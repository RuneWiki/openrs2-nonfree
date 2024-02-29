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

@OriginalClass("client!aap")
public class Class15 {

	@OriginalMember(owner = "client!aap", name = "c", descriptor = "Ljava/awt/DisplayMode;")
	DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!aap", name = "p", descriptor = "Ljava/awt/GraphicsDevice;")
	GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!aap", name = "<init>", descriptor = "()V", line = 13)
	public Class15() throws Exception {
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

	@OriginalMember(owner = "client!aap", name = "p", descriptor = "(I)[I", line = 35)
	int[] method251() {
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

	@OriginalMember(owner = "client!aap", name = "w", descriptor = "()[I", line = 35)
	int[] method252() {
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

	@OriginalMember(owner = "client!aap", name = "y", descriptor = "()[I", line = 35)
	int[] method253() {
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

	@OriginalMember(owner = "client!aap", name = "c", descriptor = "(Ljava/awt/Frame;IIIIB)V", line = 47)
	void method254(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method263(arg0);
		if (arg4 == 0) {
			@Pc(29) int local29 = this.aDisplayMode1.getRefreshRate();
			@Pc(33) DisplayMode[] local33 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < local33.length; local37++) {
				if (local33[local37].getWidth() == arg1 && local33[local37].getHeight() == arg2 && local33[local37].getBitDepth() == arg3) {
					@Pc(64) int local64 = local33[local37].getRefreshRate();
					if (!local35 || Math.abs(local64 - local29) < Math.abs(arg4 - local29)) {
						arg4 = local64;
						local35 = true;
					}
				}
			}
			if (!local35) {
				arg4 = local29;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!aap", name = "t", descriptor = "(Ljava/awt/Frame;IIII)V", line = 47)
	void method255(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method263(arg0);
		if (arg4 == 0) {
			@Pc(29) int local29 = this.aDisplayMode1.getRefreshRate();
			@Pc(33) DisplayMode[] local33 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < local33.length; local37++) {
				if (local33[local37].getWidth() == arg1 && local33[local37].getHeight() == arg2 && local33[local37].getBitDepth() == arg3) {
					@Pc(64) int local64 = local33[local37].getRefreshRate();
					if (!local35 || Math.abs(local64 - local29) < Math.abs(arg4 - local29)) {
						arg4 = local64;
						local35 = true;
					}
				}
			}
			if (!local35) {
				arg4 = local29;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!aap", name = "v", descriptor = "(B)V", line = 74)
	void method256() {
		if (this.aDisplayMode1 != null) {
			@Pc(7) DisplayMode[] local7 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(9) boolean local9 = false;
			@Pc(11) DisplayMode[] local11 = local7;
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				@Pc(21) DisplayMode local21 = local11[local13];
				if (local21.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local9 = true;
					break;
				}
			}
			if (!local9) {
				try {
					@Pc(43) Field local43 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local43.setAccessible(true);
					local43.set(this.aGraphicsDevice1, null);
				} catch (@Pc(53) Throwable local53) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method263(null);
	}

	@OriginalMember(owner = "client!aap", name = "q", descriptor = "()V", line = 74)
	void method257() {
		if (this.aDisplayMode1 != null) {
			@Pc(7) DisplayMode[] local7 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(9) boolean local9 = false;
			@Pc(11) DisplayMode[] local11 = local7;
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				@Pc(21) DisplayMode local21 = local11[local13];
				if (local21.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local9 = true;
					break;
				}
			}
			if (!local9) {
				try {
					@Pc(43) Field local43 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local43.setAccessible(true);
					local43.set(this.aGraphicsDevice1, null);
				} catch (@Pc(53) Throwable local53) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method263(null);
	}

	@OriginalMember(owner = "client!aap", name = "x", descriptor = "()V", line = 74)
	void method258() {
		if (this.aDisplayMode1 != null) {
			@Pc(7) DisplayMode[] local7 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(9) boolean local9 = false;
			@Pc(11) DisplayMode[] local11 = local7;
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				@Pc(21) DisplayMode local21 = local11[local13];
				if (local21.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local9 = true;
					break;
				}
			}
			if (!local9) {
				try {
					@Pc(43) Field local43 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local43.setAccessible(true);
					local43.set(this.aGraphicsDevice1, null);
				} catch (@Pc(53) Throwable local53) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method263(null);
	}

	@OriginalMember(owner = "client!aap", name = "d", descriptor = "()V", line = 74)
	void method259() {
		if (this.aDisplayMode1 != null) {
			@Pc(7) DisplayMode[] local7 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(9) boolean local9 = false;
			@Pc(11) DisplayMode[] local11 = local7;
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				@Pc(21) DisplayMode local21 = local11[local13];
				if (local21.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local9 = true;
					break;
				}
			}
			if (!local9) {
				try {
					@Pc(43) Field local43 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local43.setAccessible(true);
					local43.set(this.aGraphicsDevice1, null);
				} catch (@Pc(53) Throwable local53) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method263(null);
	}

	@OriginalMember(owner = "client!aap", name = "s", descriptor = "()V", line = 74)
	void method260() {
		if (this.aDisplayMode1 != null) {
			@Pc(7) DisplayMode[] local7 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(9) boolean local9 = false;
			@Pc(11) DisplayMode[] local11 = local7;
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				@Pc(21) DisplayMode local21 = local11[local13];
				if (local21.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local9 = true;
					break;
				}
			}
			if (!local9) {
				try {
					@Pc(43) Field local43 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local43.setAccessible(true);
					local43.set(this.aGraphicsDevice1, null);
				} catch (@Pc(53) Throwable local53) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method263(null);
	}

	@OriginalMember(owner = "client!aap", name = "g", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method261(@OriginalArg(0) Frame arg0) {
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

	@OriginalMember(owner = "client!aap", name = "r", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method262(@OriginalArg(0) Frame arg0) {
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

	@OriginalMember(owner = "client!aap", name = "l", descriptor = "(Ljava/awt/Frame;I)V", line = 104)
	void method263(@OriginalArg(0) Frame arg0) {
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

	@OriginalMember(owner = "client!aap", name = "z", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method264(@OriginalArg(0) Frame arg0) {
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

	@OriginalMember(owner = "client!aap", name = "aws", descriptor = "(Lclient!yf;I)V", line = 13343)
	static final void method265(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
