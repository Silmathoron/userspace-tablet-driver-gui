# Kuri's Userspace tablet driver utility (GUI)

This is a new GUI implementation for the userland driver I've written here: https://github.com/kurikaesu/userspace-tablet-driver-daemon

### Supports
- XP-Pen Deco Pro Small
- XP-Pen Deco Pro Medium
- XP-Pen Deco 01 v2
- XP-Pen Artist 12 Pro
- XP-Pen Artist 13.3 Pro
- XP-Pen Artist 22r Pro
- XP-Pen Artist 24 Pro
- Huion WH1409 v2
- Huion WH1409 (2048)
- Huion H1161

The python GUI will no longer be updates as there are severe limitations on assigning keys to it due to the library I used (pynput).

## Building and running
### Prerequisites:

- OpenJDK 11+

Both of the above should be available from your package managers.
Once installed:
```
git clone https://github.com/kurikaesu/userspace-tablet-driver-gui.git
cd userspace-tablet-driver-gui
./gradlew build
./gradlew run
```

The userspace driver daemon will need to be running as this GUI will communicate directly with it.