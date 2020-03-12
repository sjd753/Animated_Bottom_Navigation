# Animated Bottom Navigation ![version](https://jitpack.io/v/sjd753/Animated_Bottom_Navigation.svg)

A lightweight library for your awesome animated bottom navigation with cool customization options!

## Latest version: (https://jitpack.io/#sjd753/Animated_Bottom_Navigation)

## How to use 

### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
 
### Step 2. Add the dependency

```
dependencies {
	        implementation 'com.github.sjd753:Animated_Bottom_Navigation:Tag'
	}
```
### Step 3. Add BottomNavigationView in layout

```
 <com.sjd.animatedbottomnavigation.library.BottomNavigationBar
        android:id="@+id/bottomNavigationBar"
        android:layout_width="match_parent"
        android:layout_height="84dp"
        android:layout_gravity="bottom"
        app:iconSize="28dp"
        app:iconTint="@android:color/darker_gray"
        app:iconTintActive="@color/colorPrimary"
        app:indicatorColor="@color/colorPrimaryAlpha"
        app:indicatorRadius="24dp"
        app:menu="@menu/menu_bottom_nav"
        app:menuItemColors="@array/menuItemColors"
        app:textColor="@color/colorPrimary" />
```
### Customization 

```
	app:menu="" // menu resource for bottom nav (should be upto 4)
	app:menuItemColors="@array/menuItemColors" // optional menu item accent colors for icon and text tint & background
        app:backgroundColor="" // optional bottom nav view background color
        app:indicatorColor="" // optional indicator color (this is overridden by app:menuItemColors if set)
        app:indicatorRadius="" // optional indicator radius
        app:sideMargins="" // optional side margins
        app:itemPadding="" // optional item padding
        app:textColor="" // optional text color (this is overridden by app:menuItemColors if set)
        app:itemFontFamily="" // optional font family
        app:textSize="" // optional text size
        app:iconSize="" // optional icon size
        app:iconTint="" // optional icon tint
        app:iconTintActive="" // optional active / selected icon tint (this is overridden by app:menuItemColors if set)
        app:activeItem="" // optional active / selected item
        app:duration="" // optional animation duration
```
	

## Built With

* [SmoothBottomBar](https://github.com/ibrahimsn98/SmoothBottomBar) - AnimatedBottomNavigation library is an extension of SmoothBottomBar library by (https://github.com/ibrahimsn98)

## Authors

* **sjd753** - *Extended development* - [AnimatedBottomNavigation](https://github.com/sjd753/Animated_Bottom_Navigation)


## Acknowledgments

* Kudos to **ibrahimsn98** 
* AnimatedBottomNavigation library is built on top of [SmoothBottomBar](https://github.com/ibrahimsn98/SmoothBottomBar)
* Thanks!
