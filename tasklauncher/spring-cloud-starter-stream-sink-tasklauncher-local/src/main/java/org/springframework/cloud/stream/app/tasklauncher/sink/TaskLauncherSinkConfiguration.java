/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.stream.app.tasklauncher.sink;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.deployer.spi.task.TaskLauncher;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

/**
 * Configuration class for the TaskLauncherSink. Delegates to a {@link TaskLauncher} for
 * creating the writer used by the sink.
 *
 * @author Glenn Renfro
 */
@EnableBinding(Sink.class)
@EnableConfigurationProperties(TaskLauncherSinkProperties.class)
@EnableTaskLauncher
public class TaskLauncherSinkConfiguration {


}