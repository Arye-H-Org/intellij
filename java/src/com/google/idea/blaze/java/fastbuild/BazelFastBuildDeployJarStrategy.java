/*
 * Copyright 2023 The Bazel Authors. All rights reserved.
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
package com.google.idea.blaze.java.fastbuild;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.idea.blaze.base.model.primitives.Label;
import com.google.idea.blaze.base.model.primitives.TargetExpression;
import com.google.idea.blaze.base.settings.BuildSystemName;

final class BazelFastBuildDeployJarStrategy extends FastBuildDeployJarStrategy {

  @Override
  public ImmutableSet<BuildSystemName> getSupportedBuildSystems() {
    return ImmutableSet.of(BuildSystemName.Bazel);
  }

  @Override
  public ImmutableList<? extends TargetExpression> getBuildTargets(Label label) {
    return ImmutableList.of(createDeployJarLabel(label), label);
  }

  @Override
  public ImmutableList<String> getBuildFlags() {
    return ImmutableList.of();
  }

  @Override
  public Label createDeployJarLabel(Label label) {
    return Label.create(label + "_deploy.jar");
  }

  @Override
  public Label deployJarOwnerLabel(Label label) {
    return createDeployJarLabel(label);
  }
}
