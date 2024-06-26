/*
 * Copyright 2016 The Bazel Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.idea.blaze.base.wizard2;

import com.google.idea.blaze.base.settings.BlazeUserSettings;
import com.google.idea.blaze.base.settings.BuildSystemName;
import com.google.idea.blaze.base.ui.BlazeValidationResult;
import com.google.idea.blaze.base.wizard2.ui.SelectBazelBinaryControl;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.ide.wizard.CommitStepException;
import com.intellij.openapi.options.ConfigurationException;
import java.awt.BorderLayout;
import javax.annotation.Nullable;
import javax.swing.JComponent;
import javax.swing.JPanel;

class BlazeSelectBuildSystemBinaryStep extends ProjectImportWizardStep {

  private final JPanel component = new JPanel(new BorderLayout());
  private SelectBazelBinaryControl control;
  private boolean settingsInitialized = false;

  BlazeSelectBuildSystemBinaryStep(WizardContext context) {
    super(context);
  }

  @Override
  public boolean isStepVisible() {
    updateStep();
    if (control.builder.getBuildSystem() != BuildSystemName.Bazel) {
      return false;
    }
    String currentBinaryPath = BlazeUserSettings.getInstance().getBazelBinaryPath();
    return currentBinaryPath == null;
  }

  @Override
  public JComponent getComponent() {
    return component;
  }

  @Override
  public void updateStep() {
    if (!settingsInitialized) {
      init();
    }
  }

  private void init() {
    control = new SelectBazelBinaryControl(getProjectBuilder());
    component.add(control.getUiComponent());
    settingsInitialized = true;
  }

  @Override
  public void validateAndUpdateModel() throws ConfigurationException {
    BlazeValidationResult result = control.validate();
    result.throwConfigurationExceptionIfNotSuccess();
  }

  @Override
  public void onWizardFinished() throws CommitStepException {
    control.commit();
  }

  @Nullable
  @Override
  public String getHelpId() {
    return null;
  }
}
