package com.jagex;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public class Class227 implements Interface18 {

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "[B")
	static final byte[] aByteArray73 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "Lclient!ew;")
	static Class161 aClass161_26 = new Class161(128, 4);

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "Z")
	boolean aBoolean677;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "Lclient!de;")
	Class21 aClass21_7;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "Lclient!zq;")
	final Class627 aClass627_1;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
	final int anInt3735;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
	final int anInt3734;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "[Lclient!ib;")
	final Interface19[] anInterface19Array1;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!zq;IILclient!hj;)V", line = 32)
	Class227(@OriginalArg(0) Class627 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class224 arg3) {
		this.aClass627_1 = arg0;
		this.anInt3735 = arg1 * 1443442165;
		this.anInt3734 = arg2 * -1205187589;
		this.anInterface19Array1 = new Interface19[this.aClass627_1.anInterface31Array1.length];
		for (@Pc(23) int local23 = 0; local23 < this.anInterface19Array1.length; local23++) {
			this.anInterface19Array1[local23] = arg3.method24447(this.aClass627_1.anInterface31Array1[local23]);
		}
	}

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "(I)V", line = 43)
	@Override
	public void method24483() {
		if (Class613.aClass21_13 != this.aClass21_7) {
			this.aClass21_7 = Class613.aClass21_13;
			this.aBoolean677 = true;
		}
		this.aClass21_7.method17061(3, 0);
		@Pc(17) Interface19[] local17 = this.anInterface19Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface19 local27 = local17[local19];
			if (local27 != null) {
				local27.method24604();
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "()V", line = 43)
	@Override
	public void method24496() {
		if (Class613.aClass21_13 != this.aClass21_7) {
			this.aClass21_7 = Class613.aClass21_13;
			this.aBoolean677 = true;
		}
		this.aClass21_7.method17061(3, 0);
		@Pc(17) Interface19[] local17 = this.anInterface19Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface19 local27 = local17[local19];
			if (local27 != null) {
				local27.method24604();
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(Lclient!vs;S)V", line = 56)
	static void method24502(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29472(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "(ZB)V", line = 58)
	@Override
	public void method24497(@OriginalArg(0) boolean arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface19[] local4 = this.anInterface19Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface19 local14 = local4[local6];
			if (local14 != null) {
				local14.method24606(local1 || this.aBoolean677);
			}
		}
		this.aBoolean677 = false;
	}

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "(Z)V", line = 58)
	@Override
	public void method24485() {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface19[] local4 = this.anInterface19Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface19 local14 = local4[local6];
			if (local14 != null) {
				local14.method24606(local1 || this.aBoolean677);
			}
		}
		this.aBoolean677 = false;
	}

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "(I)I", line = 70)
	@Override
	public int method24490() {
		@Pc(1) int local1 = 0;
		@Pc(4) Interface19[] local4 = this.anInterface19Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface19 local14 = local4[local6];
			if (local14 == null || local14.method24602()) {
				local1++;
			}
		}
		return local1 * 100 / this.anInterface19Array1.length;
	}

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "()I", line = 70)
	@Override
	public int method24489() {
		@Pc(1) int local1 = 0;
		@Pc(4) Interface19[] local4 = this.anInterface19Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface19 local14 = local4[local6];
			if (local14 == null || local14.method24602()) {
				local1++;
			}
		}
		return local1 * 100 / this.anInterface19Array1.length;
	}

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "()I", line = 70)
	@Override
	public int method24492() {
		@Pc(1) int local1 = 0;
		@Pc(4) Interface19[] local4 = this.anInterface19Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface19 local14 = local4[local6];
			if (local14 == null || local14.method24602()) {
				local1++;
			}
		}
		return local1 * 100 / this.anInterface19Array1.length;
	}

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "(B)V", line = 81)
	@Override
	public void method24486() {
	}

	@OriginalMember(owner = "client!ho", name = "af", descriptor = "()V", line = 81)
	@Override
	public void method24491() {
	}

	@OriginalMember(owner = "client!ho", name = "at", descriptor = "()V", line = 81)
	@Override
	public void method24484() {
	}

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "(J)Z", line = 84)
	@Override
	public boolean method24487(@OriginalArg(0) long arg0) {
		return Class176.method23413() >= (long) (this.anInt3735 * -166570403) + arg0;
	}

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "(J)Z", line = 84)
	@Override
	public boolean method24493(@OriginalArg(0) long arg0) {
		return Class176.method23413() >= (long) (this.anInt3735 * -166570403) + arg0;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "()Z", line = 99)
	static boolean method24498() {
		try {
			@Pc(3) Class622 local3 = new Class622();
			@Pc(8) byte[] local8 = local3.method33761(aByteArray73);
			Class107.method21920(local8);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "([B)Lclient!co;", line = 110)
	static Class6 method24499(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(11) Image local11 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(16) MediaTracker local16 = new MediaTracker(Class524.anApplet2);
				local16.addImage(local11, 0);
				local16.waitForAll();
				@Pc(26) int local26 = local11.getWidth(Class524.anApplet2);
				@Pc(30) int local30 = local11.getHeight(Class524.anApplet2);
				if (!local16.isErrorAny() && local26 >= 0 && local30 >= 0) {
					@Pc(47) int[] local47 = new int[local26 * local30];
					@Pc(59) PixelGrabber local59 = new PixelGrabber(local11, 0, 0, local26, local30, local47, 0, local26);
					local59.grabPixels();
					return Class613.aClass21_13.method17113(local47, 0, local26, local26, local30);
				}
				throw new RuntimeException("");
			} catch (@Pc(72) InterruptedException local72) {
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "([B)Lclient!co;", line = 110)
	static Class6 method24500(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(11) Image local11 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(16) MediaTracker local16 = new MediaTracker(Class524.anApplet2);
				local16.addImage(local11, 0);
				local16.waitForAll();
				@Pc(26) int local26 = local11.getWidth(Class524.anApplet2);
				@Pc(30) int local30 = local11.getHeight(Class524.anApplet2);
				if (!local16.isErrorAny() && local26 >= 0 && local30 >= 0) {
					@Pc(47) int[] local47 = new int[local26 * local30];
					@Pc(59) PixelGrabber local59 = new PixelGrabber(local11, 0, 0, local26, local30, local47, 0, local26);
					local59.grabPixels();
					return Class613.aClass21_13.method17113(local47, 0, local26, local26, local30);
				}
				throw new RuntimeException("");
			} catch (@Pc(72) InterruptedException local72) {
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "([B)Lclient!co;", line = 110)
	static Class6 method24501(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(11) Image local11 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(16) MediaTracker local16 = new MediaTracker(Class524.anApplet2);
				local16.addImage(local11, 0);
				local16.waitForAll();
				@Pc(26) int local26 = local11.getWidth(Class524.anApplet2);
				@Pc(30) int local30 = local11.getHeight(Class524.anApplet2);
				if (!local16.isErrorAny() && local26 >= 0 && local30 >= 0) {
					@Pc(47) int[] local47 = new int[local26 * local30];
					@Pc(59) PixelGrabber local59 = new PixelGrabber(local11, 0, 0, local26, local30, local47, 0, local26);
					local59.grabPixels();
					return Class613.aClass21_13.method17113(local47, 0, local26, local26, local30);
				}
				throw new RuntimeException("");
			} catch (@Pc(72) InterruptedException local72) {
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)I", line = 130)
	@Override
	public int method24488() {
		return this.anInt3734 * 1464665907;
	}

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "()I", line = 130)
	@Override
	public int method24495() {
		return this.anInt3734 * 1464665907;
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "()I", line = 130)
	@Override
	public int method24494() {
		return this.anInt3734 * 1464665907;
	}

	@OriginalMember(owner = "client!ho", name = "hv", descriptor = "(Lclient!act;[I[I[II)V", line = 4231)
	public static void method24505(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(9) int local9 = arg1[local1];
			@Pc(13) int local13 = arg3[local1];
			@Pc(17) int local17 = arg2[local1];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && local19 < arg0.aClass71_Sub3_Sub1Array3.length) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass71_Sub3_Sub1Array3[local19] = null;
					} else {
						@Pc(46) Class440 local46 = Class110.aClass436_1.method27999(local9);
						@Pc(51) int local51 = local46.anInt4928 * -413041149;
						@Pc(56) Class71_Sub3_Sub1 local56 = arg0.aClass71_Sub3_Sub1Array3[local19];
						if (local56 != null && local56.method20021()) {
							if (local9 == local56.method20103()) {
								if (local51 == 0) {
									arg0.aClass71_Sub3_Sub1Array3[local19] = null;
									local56 = null;
								} else if (local51 == 1) {
									local56.method20041();
									local56.anInt2772 = local17 * -2110998129;
								} else if (local51 == 2) {
									local56.method20040();
								}
							} else if (local46.anInt4932 * -2127032365 >= local56.method20069().anInt4932 * -2127032365) {
								arg0.aClass71_Sub3_Sub1Array3[local19] = null;
								local56 = null;
							}
						}
						if (local56 == null || !local56.method20021()) {
							local56 = arg0.aClass71_Sub3_Sub1Array3[local19] = new Class71_Sub3_Sub1(arg0);
							local56.method20038(local9);
							local56.anInt2772 = local17 * -2110998129;
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "aad", descriptor = "(Lclient!vs;B)V", line = 8821)
	static final void method24503(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13 & -1 - (0x1 << local23);
	}

	@OriginalMember(owner = "client!ho", name = "aro", descriptor = "(Lclient!vs;I)V", line = 12129)
	static final void method24504(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class193.anInt3683 * 902291223;
	}
}
