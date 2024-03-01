package com.jagex;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public class Class556 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "Ljava/awt/GraphicsDevice;")
	GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V", line = 13)
	public Class556() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			@Pc(16) GraphicsDevice[] local16 = local14;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local16[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "(B)[I", line = 35)
	int[] method32798() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "(Ljava/awt/Frame;IIII)V", line = 47)
	void method32797(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method32801(arg0);
		if (arg4 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (local32[local36].getWidth() == arg1 && local32[local36].getHeight() == arg2 && local32[local36].getBitDepth() == arg3) {
					@Pc(63) int local63 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local63 - local28) < Math.abs(arg4 - local28)) {
						arg4 = local63;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg4 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V", line = 47)
	void method32799(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method32801(arg0);
		if (arg4 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (local32[local36].getWidth() == arg1 && local32[local36].getHeight() == arg2 && local32[local36].getBitDepth() == arg3) {
					@Pc(63) int local63 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local63 - local28) < Math.abs(arg4 - local28)) {
						arg4 = local63;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg4 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "(Ljava/awt/Frame;IIII)V", line = 47)
	void method32800(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method32801(arg0);
		if (arg4 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (local32[local36].getWidth() == arg1 && local32[local36].getHeight() == arg2 && local32[local36].getBitDepth() == arg3) {
					@Pc(63) int local63 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local63 - local28) < Math.abs(arg4 - local28)) {
						arg4 = local63;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg4 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "(Ljava/awt/Frame;IIII)V", line = 47)
	void method32802(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method32801(arg0);
		if (arg4 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (local32[local36].getWidth() == arg1 && local32[local36].getHeight() == arg2 && local32[local36].getBitDepth() == arg3) {
					@Pc(63) int local63 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local63 - local28) < Math.abs(arg4 - local28)) {
						arg4 = local63;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg4 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "(Ljava/awt/Frame;IIII)V", line = 47)
	void method32803(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method32801(arg0);
		if (arg4 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (local32[local36].getWidth() == arg1 && local32[local36].getHeight() == arg2 && local32[local36].getBitDepth() == arg3) {
					@Pc(63) int local63 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local63 - local28) < Math.abs(arg4 - local28)) {
						arg4 = local63;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg4 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V", line = 74)
	void method32804() {
		if (this.aDisplayMode1 != null) {
			@Pc(6) DisplayMode[] local6 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(8) boolean local8 = false;
			@Pc(10) DisplayMode[] local10 = local6;
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				@Pc(20) DisplayMode local20 = local10[local12];
				if (local20.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local8 = true;
					break;
				}
			}
			if (!local8) {
				try {
					@Pc(42) Field local42 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local42.setAccessible(true);
					local42.set(this.aGraphicsDevice1, null);
				} catch (@Pc(52) Throwable local52) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method32801(null);
	}

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "(Ljava/awt/Frame;B)V", line = 104)
	void method32801(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(54) Field local54 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local54.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(61) Throwable local61) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method32805(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(54) Field local54 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local54.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(61) Throwable local61) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method32806(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(54) Field local54 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local54.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(61) Throwable local61) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method32807(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(54) Field local54 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local54.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(61) Throwable local61) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "hi", descriptor = "(IIIIIZI)V", line = 3595)
	public static final void method32809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		Class272.anInt4297 = arg0 * 613578303;
		Class177.anInt3473 = arg1 * 1422814567;
		Class225.anInt3732 = arg2 * -1201814257;
		Class370.anInt4674 = arg3 * -1519884165;
		Class476.anInt5134 = arg4 * 734601409;
		if (Class72.anInt2086 * 81180077 == 3) {
			Class324.method25999();
		}
		if (arg5 && Class476.anInt5134 * -260346047 >= 100) {
			Class586.anInt5460 = Class272.anInt4297 * 467100160 + -2104062208;
			Class149.anInt3434 = Class177.anInt3473 * -1393193472 + -1272901376;
			Class140.anInt3424 = (Class186.method23926(-1129330577 * Class586.anInt5460, -324079631 * Class149.anInt3434, Class141.anInt3427 * 1197232991) - Class225.anInt3732 * 771787247) * -1930901799;
		}
		Class72.anInt2086 = 449113162;
		Class47.anInt1011 = -1801069635;
		Class449.anInt5013 = 2127832081;
	}

	@OriginalMember(owner = "client!wn", name = "anc", descriptor = "(Lclient!vs;I)V", line = 11488)
	static final void method32808(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 != Class510.aClass3_Sub45_37.aClass60_Sub23_1.method13748()) {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, local12);
			Class26_Sub1_Sub1_Sub1.method16728();
			client.aBoolean573 = false;
		}
	}
}
