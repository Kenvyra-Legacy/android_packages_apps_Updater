/*
 * Copyright (C) 2017 The LineageOS Project
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
package org.lineageos.updater.misc;

public final class Constants {

    private Constants() {
    }

    public static final String PROJECT_NAME_PREFIX = "arrow-";
    public static final String SF_PROJECT_NAME = "arrow-os";
    // version will be set according to the update version in the mirrors function
    public static final String SF_PROJECT_ROOT_PATH_NAME = "arrow-";
    public static final String[] arrowMirrors = { "Europe", "Usa", "Asia SE" };

    public static final String AB_PAYLOAD_BIN_PATH = "payload.bin";
    public static final String AB_PAYLOAD_PROPERTIES_PATH = "payload_properties.txt";

    public static final int AUTO_UPDATES_CHECK_INTERVAL_NEVER = 0;
    public static final int AUTO_UPDATES_CHECK_INTERVAL_DAILY = 1;
    public static final int AUTO_UPDATES_CHECK_INTERVAL_WEEKLY = 2;
    public static final int AUTO_UPDATES_CHECK_INTERVAL_MONTHLY = 3;

    public static final String PREF_LAST_UPDATE_CHECK = "last_update_check";
    public static final String PREF_AUTO_UPDATES_CHECK_INTERVAL = "auto_updates_check_interval";
    public static final String PREF_AUTO_DELETE_UPDATES = "auto_delete_updates";
    public static final String PREF_AB_PERF_MODE = "ab_perf_mode";
    public static final String PREF_MOBILE_DATA_WARNING = "pref_mobile_data_warning";
    public static final String PREF_NEEDS_REBOOT_ID = "needs_reboot_id";
    public static final String PREF_RANK_SORT = "rank_sort";

    public static final String UNCRYPT_FILE_EXT = ".uncrypt";

    public static final String PROP_AB_DEVICE = "ro.build.ab_update";
    public static final String PROP_BUILD_DATE = "ro.build.date.utc";
    public static final String PROP_BUILD_VERSION = "ro.modversion";
    //public static final String PROP_BUILD_VERSION_INCREMENTAL = "ro.build.version.incremental";
    public static final String PROP_DEVICE = "ro.kenvyra.device";
    public static final String PROP_NEXT_DEVICE = "ro.updater.next_device";
    public static final String PROP_RELEASE_TYPE = "ro.kenvyra.releasetype";
    public static final String PROP_ZIP_TYPE = "ro.kenvyra.ziptype";
    public static final String PROP_UPDATER_ALLOW_DOWNGRADING = "lineage.updater.allow_downgrading";
    public static final String PROP_UPDATER_URI = "arrow.updater.uri";
    public static final String PROP_BLOCK_UPDATER = "ro.block_updater";

    public static final String PREF_INSTALL_OLD_TIMESTAMP = "install_old_timestamp";
    public static final String PREF_INSTALL_NEW_TIMESTAMP = "install_new_timestamp";
    public static final String PREF_INSTALL_PACKAGE_PATH = "install_package_path";
    public static final String PREF_INSTALL_AGAIN = "install_again";
    public static final String PREF_INSTALL_NOTIFIED = "install_notified";
}
