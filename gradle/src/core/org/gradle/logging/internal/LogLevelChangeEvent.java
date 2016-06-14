/*
 * Copyright 2010 the original author or authors.
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
package org.gradle.logging.internal;

import org.gradle.api.logging.LogLevel;

/**
 * Notifies output consumers that the log level has changed. Consumers will not receive any further events at a lesser log level.
 */
public class LogLevelChangeEvent extends OutputEvent {
    private final LogLevel newLogLevel;

    public LogLevelChangeEvent(LogLevel newLogLevel) {
        this.newLogLevel = newLogLevel;
    }

    public LogLevel getNewLogLevel() {
        return newLogLevel;
    }

    @Override
    public String toString() {
        return String.format("%s %s", LogLevelChangeEvent.class.getSimpleName(), newLogLevel);
    }

    @Override
    public LogLevel getLogLevel() {
        return null;
    }
}
