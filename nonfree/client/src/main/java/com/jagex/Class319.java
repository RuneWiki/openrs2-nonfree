package com.jagex;

import java.awt.Container;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public class Class319 implements Interface32 {

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "[B")
	static final byte[] aByteArray75 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!er;")
	static Class232 aClass232_76 = new Class232(128, 4);

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "Lclient!dx;")
	Class86 aClass86_10;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Z")
	boolean aBoolean696;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "Lclient!acj;")
	final Class59 aClass59_1;

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
	final int anInt4072;

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
	final int anInt4073;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "[Lclient!jf;")
	final Interface31[] anInterface31Array1;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "()V", line = 30)
	static void method27434() {
		aClass232_76.method25850();
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "()V", line = 30)
	static void method27435() {
		aClass232_76.method25850();
	}

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "()V", line = 30)
	static void method27436() {
		aClass232_76.method25850();
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!acj;IILclient!jc;)V", line = 33)
	Class319(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class339 arg3) {
		this.aClass59_1 = arg0;
		this.anInt4072 = arg1 * 762901405;
		this.anInt4073 = arg2 * 362974845;
		this.anInterface31Array1 = new Interface31[this.aClass59_1.anInterface46Array1.length];
		for (@Pc(23) int local23 = 0; local23 < this.anInterface31Array1.length; local23++) {
			this.anInterface31Array1[local23] = arg3.method27727(this.aClass59_1.anInterface46Array1[local23]);
		}
	}

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "(B)V", line = 44)
	@Override
	public void method27482() {
		if (this.aClass86_10 != Class284.aClass86_9) {
			this.aClass86_10 = Class284.aClass86_9;
			this.aBoolean696 = true;
		}
		this.aClass86_10.method20125(3, 0);
		@Pc(17) Interface31[] local17 = this.anInterface31Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface31 local27 = local17[local19];
			if (local27 != null) {
				local27.method27917();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "aj", descriptor = "()V", line = 44)
	@Override
	public void method27481() {
		if (this.aClass86_10 != Class284.aClass86_9) {
			this.aClass86_10 = Class284.aClass86_9;
			this.aBoolean696 = true;
		}
		this.aClass86_10.method20125(3, 0);
		@Pc(17) Interface31[] local17 = this.anInterface31Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface31 local27 = local17[local19];
			if (local27 != null) {
				local27.method27917();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "(ZS)V", line = 59)
	@Override
	public void method27490(@OriginalArg(0) boolean arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface31[] local4 = this.anInterface31Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface31 local14 = local4[local6];
			if (local14 != null) {
				local14.method27921(local1 || this.aBoolean696);
			}
		}
		this.aBoolean696 = false;
	}

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "(Z)V", line = 59)
	@Override
	public void method27487() {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface31[] local4 = this.anInterface31Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface31 local14 = local4[local6];
			if (local14 != null) {
				local14.method27921(local1 || this.aBoolean696);
			}
		}
		this.aBoolean696 = false;
	}

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "(B)I", line = 71)
	@Override
	public int method27491() {
		@Pc(1) int local1 = 0;
		@Pc(4) Interface31[] local4 = this.anInterface31Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface31 local14 = local4[local6];
			if (local14 == null || local14.method27915()) {
				local1++;
			}
		}
		return local1 * 100 / this.anInterface31Array1.length;
	}

	@OriginalMember(owner = "client!ie", name = "ai", descriptor = "()I", line = 71)
	@Override
	public int method27483() {
		@Pc(1) int local1 = 0;
		@Pc(4) Interface31[] local4 = this.anInterface31Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface31 local14 = local4[local6];
			if (local14 == null || local14.method27915()) {
				local1++;
			}
		}
		return local1 * 100 / this.anInterface31Array1.length;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()V", line = 82)
	@Override
	public void method27488() {
	}

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "()V", line = 82)
	@Override
	public void method27489() {
	}

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "(B)V", line = 82)
	@Override
	public void method27492() {
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "()V", line = 82)
	@Override
	public void method27493() {
	}

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "()V", line = 82)
	@Override
	public void method27484() {
	}

	@OriginalMember(owner = "client!ie", name = "al", descriptor = "(J)Z", line = 85)
	@Override
	public boolean method27495(@OriginalArg(0) long arg0) {
		return Class280.method26667() >= arg0 + (long) (this.anInt4072 * -1168889163);
	}

	@OriginalMember(owner = "client!ie", name = "ag", descriptor = "(J)Z", line = 85)
	@Override
	public boolean method27494(@OriginalArg(0) long arg0) {
		return Class280.method26667() >= arg0 + (long) (this.anInt4072 * -1168889163);
	}

	@OriginalMember(owner = "client!ie", name = "ao", descriptor = "(J)Z", line = 85)
	@Override
	public boolean method27496(@OriginalArg(0) long arg0) {
		return Class280.method26667() >= arg0 + (long) (this.anInt4072 * -1168889163);
	}

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "(J)Z", line = 85)
	@Override
	public boolean method27485(@OriginalArg(0) long arg0) {
		return Class280.method26667() >= arg0 + (long) (this.anInt4072 * -1168889163);
	}

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "(Lclient!pw;I)Lclient!cy;", line = 89)
	public static Class83 method27437(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class83 local5 = (Class83) aClass232_76.method25835((long) arg1);
		if (local5 == null) {
			if (Class252.aBoolean655) {
				local5 = Class284.aClass86_9.method20076(Class210.method25594(arg0, arg1), true);
			} else {
				local5 = Class667.method33160(arg0.method29745(arg1));
			}
			aClass232_76.method25844(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "(Lclient!pw;I)Lclient!cy;", line = 89)
	public static Class83 method27438(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class83 local5 = (Class83) aClass232_76.method25835((long) arg1);
		if (local5 == null) {
			if (Class252.aBoolean655) {
				local5 = Class284.aClass86_9.method20076(Class210.method25594(arg0, arg1), true);
			} else {
				local5 = Class667.method33160(arg0.method29745(arg1));
			}
			aClass232_76.method25844(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "()Z", line = 100)
	static boolean method27439() {
		try {
			@Pc(3) Class57 local3 = new Class57();
			@Pc(8) byte[] local8 = local3.method858(aByteArray75);
			Class667.method33160(local8);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "()Z", line = 100)
	static boolean method27440() {
		try {
			@Pc(3) Class57 local3 = new Class57();
			@Pc(8) byte[] local8 = local3.method858(aByteArray75);
			Class667.method33160(local8);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "()Z", line = 100)
	static boolean method27441() {
		try {
			@Pc(3) Class57 local3 = new Class57();
			@Pc(8) byte[] local8 = local3.method858(aByteArray75);
			Class667.method33160(local8);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "()Z", line = 100)
	static boolean method27442() {
		try {
			@Pc(3) Class57 local3 = new Class57();
			@Pc(8) byte[] local8 = local3.method858(aByteArray75);
			Class667.method33160(local8);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "([B)Lclient!cy;", line = 111)
	static Class83 method27443(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(10) Image local10 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(13) Container local13 = Class94.method7650();
				@Pc(18) MediaTracker local18 = new MediaTracker(local13);
				local18.addImage(local10, 0);
				local18.waitForAll();
				@Pc(28) int local28 = local10.getWidth(local13);
				@Pc(32) int local32 = local10.getHeight(local13);
				if (!local18.isErrorAny() && local28 >= 0 && local32 >= 0) {
					@Pc(49) int[] local49 = new int[local32 * local28];
					@Pc(61) PixelGrabber local61 = new PixelGrabber(local10, 0, 0, local28, local32, local49, 0, local28);
					local61.grabPixels();
					return Class284.aClass86_9.method20010(local49, 0, local28, local28, local32);
				}
				throw new RuntimeException("");
			} catch (@Pc(74) InterruptedException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "([B)Lclient!cy;", line = 111)
	static Class83 method27444(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(10) Image local10 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(13) Container local13 = Class94.method7650();
				@Pc(18) MediaTracker local18 = new MediaTracker(local13);
				local18.addImage(local10, 0);
				local18.waitForAll();
				@Pc(28) int local28 = local10.getWidth(local13);
				@Pc(32) int local32 = local10.getHeight(local13);
				if (!local18.isErrorAny() && local28 >= 0 && local32 >= 0) {
					@Pc(49) int[] local49 = new int[local32 * local28];
					@Pc(61) PixelGrabber local61 = new PixelGrabber(local10, 0, 0, local28, local32, local49, 0, local28);
					local61.grabPixels();
					return Class284.aClass86_9.method20010(local49, 0, local28, local28, local32);
				}
				throw new RuntimeException("");
			} catch (@Pc(74) InterruptedException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)I", line = 132)
	@Override
	public int method27486() {
		return this.anInt4073 * 996006613;
	}

	@OriginalMember(owner = "client!ie", name = "au", descriptor = "()I", line = 132)
	@Override
	public int method27498() {
		return this.anInt4073 * 996006613;
	}

	@OriginalMember(owner = "client!ie", name = "ax", descriptor = "()I", line = 132)
	@Override
	public int method27499() {
		return this.anInt4073 * 996006613;
	}

	@OriginalMember(owner = "client!ie", name = "ar", descriptor = "()I", line = 132)
	@Override
	public int method27500() {
		return this.anInt4073 * 996006613;
	}

	@OriginalMember(owner = "client!ie", name = "ak", descriptor = "()I", line = 132)
	@Override
	public int method27497() {
		return this.anInt4073 * 996006613;
	}

	@OriginalMember(owner = "client!ie", name = "de", descriptor = "(Lclient!dx;Lclient!akg;Lclient!hl;III)Z", line = 376)
	static boolean method27445(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub30 arg1, @OriginalArg(2) Class302 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Class136_Sub1.aBoolean339 && !client.aBoolean613 && !Class136_Sub1.method13972(arg1.anInt1638 * 1412374331, arg1.anInt1636 * -958626707)) {
			return false;
		}
		if (arg2.anIntArray420 != null) {
			arg2 = arg2.method27153(Class136_Sub1.anInterface17_2, Class136_Sub1.anInterface19_2);
			if (arg2 == null) {
				return false;
			}
		}
		@Pc(31) int local31 = Integer.MAX_VALUE;
		@Pc(33) int local33 = Integer.MIN_VALUE;
		@Pc(35) int local35 = Integer.MAX_VALUE;
		@Pc(37) int local37 = Integer.MIN_VALUE;
		if (arg2.anIntArray422 != null) {
			local31 = (arg1.anInt1638 * 1412374331 + arg2.anInt4036 * 1863424643 - Class136_Sub1.anInt1690) * (Class136_Sub1.anInt1695 - Class136_Sub1.anInt1693) / (Class136_Sub1.anInt1679 - Class136_Sub1.anInt1690) + Class136_Sub1.anInt1693;
			local33 = (arg1.anInt1638 * 1412374331 + arg2.anInt4046 * -321707117 - Class136_Sub1.anInt1690) * (Class136_Sub1.anInt1695 - Class136_Sub1.anInt1693) / (Class136_Sub1.anInt1679 - Class136_Sub1.anInt1690) + Class136_Sub1.anInt1693;
			local37 = Class136_Sub1.anInt1678 - (Class136_Sub1.anInt1678 - Class136_Sub1.anInt1694) * (arg1.anInt1636 * -958626707 + arg2.anInt4033 * 148212907 - Class136_Sub1.anInt1692) / (Class136_Sub1.anInt1691 - Class136_Sub1.anInt1692);
			local35 = Class136_Sub1.anInt1678 - (Class136_Sub1.anInt1678 - Class136_Sub1.anInt1694) * (arg2.anInt4039 * -967887583 + arg1.anInt1636 * -958626707 - Class136_Sub1.anInt1692) / (Class136_Sub1.anInt1691 - Class136_Sub1.anInt1692);
		}
		@Pc(130) Class83 local130 = null;
		@Pc(132) int local132 = 0;
		@Pc(134) int local134 = 0;
		@Pc(136) int local136 = 0;
		@Pc(138) int local138 = 0;
		if (arg2.anInt4019 * 1747122653 != -1) {
			if (arg1.aBoolean335 && arg2.anInt4020 * 1755773887 != -1) {
				local130 = arg2.method27137(arg0, true);
			} else {
				local130 = arg2.method27137(arg0, false);
			}
			if (local130 != null) {
				switch(arg2.aClass311_1.anInt4060 * -1448550931) {
					case 0:
						local132 = arg1.anInt1637 * 2139882933 - local130.method18121();
						local134 = arg1.anInt1637 * 2139882933;
						break;
					case 1:
						local132 = arg1.anInt1637 * 2139882933 - (local130.method18121() + 1 >> 1);
						local134 = arg1.anInt1637 * 2139882933 + (local130.method18121() + 1 >> 1);
						break;
					case 2:
						local132 = arg1.anInt1637 * 2139882933;
						local134 = arg1.anInt1637 * 2139882933 + local130.method18121();
				}
				switch(arg2.aClass309_1.anInt4057 * -1863758235) {
					case 0:
						local136 = arg1.anInt1634 * 917865515 - local130.method18198();
						local138 = arg1.anInt1634 * 917865515;
						break;
					case 1:
						local136 = arg1.anInt1634 * 917865515;
						local138 = arg1.anInt1634 * 917865515 + local130.method18198();
						break;
					case 2:
						local136 = arg1.anInt1634 * 917865515 - (local130.method18198() + 1 >> 1);
						local138 = arg1.anInt1634 * 917865515 + (local130.method18198() + 1 >> 1);
				}
				if (local132 < local31) {
					local31 = local132;
				}
				if (local134 > local33) {
					local33 = local134;
				}
				if (local136 < local35) {
					local35 = local136;
				}
				if (local138 > local37) {
					local37 = local138;
				}
			}
		}
		@Pc(306) Class83 local306 = null;
		if (arg2.anInt4032 * 1339524825 != -1) {
			local306 = arg2.method27140(arg0);
		}
		@Pc(319) int local319 = 0;
		@Pc(321) int local321 = 0;
		@Pc(323) int local323 = 0;
		@Pc(325) int local325 = 0;
		@Pc(327) int local327 = 0;
		@Pc(329) int local329 = 0;
		@Pc(331) int local331 = 0;
		@Pc(333) int local333 = 0;
		if (arg2.aString189 != null) {
			Class298.method27063(arg2.anInt4031 * 638004337);
			if (Class581.aClass94_12 != null) {
				local333 = Class266.aClass17_10.method312(arg2.aString189, Class149_Sub4.anInt2368 * 1771907305, 0, null);
				local323 = Class266.aClass17_10.method308(arg2.aString189, Class149_Sub4.anInt2368 * 1771907305, null);
				local319 = arg1.anInt1637 * 2139882933 - local323 / 2 + (Class136_Sub1.anInt1695 - Class136_Sub1.anInt1693) * arg2.anInt4044 * -614049423 / (Class136_Sub1.anInt1679 - Class136_Sub1.anInt1690);
				local321 = arg1.anInt1634 * 917865515 - arg2.anInt4022 * 364305451 * (Class136_Sub1.anInt1678 - Class136_Sub1.anInt1694) / (Class136_Sub1.anInt1691 - Class136_Sub1.anInt1692);
				if (local130 == null) {
					local321 -= local333 / 2;
				} else {
					local321 -= (local130.method18198() >> 1) + local333;
				}
				local325 = arg3 + local319;
				if (local325 < local31) {
					local31 = local325;
				}
				local327 = arg3 + local319 + local323;
				if (local327 > local33) {
					local33 = local327;
				}
				local329 = local321 + arg4;
				if (local329 < local35) {
					local35 = local329;
				}
				local331 = local321 + local333 + arg4;
				if (local331 > local37) {
					local37 = local331;
				}
			}
		}
		if (local33 < Class136_Sub1.anInt1693 || local31 > Class136_Sub1.anInt1695 || local37 < Class136_Sub1.anInt1694 || local35 > Class136_Sub1.anInt1678) {
			return true;
		}
		Class136_Sub1.method13971(arg0, arg1, arg2);
		if (local130 != null) {
			@Pc(486) int local486 = 0;
			@Pc(488) int local488 = 0;
			@Pc(490) int local490 = 0;
			@Pc(492) int local492 = 0;
			@Pc(494) int local494 = 0;
			@Pc(496) int local496 = 0;
			switch(arg2.aClass311_1.anInt4060 * -1448550931) {
				case 0:
					local486 = local130.method18169();
					local488 = (local130.method18169() + 1) / 2;
					local490 = local130.method18121();
					break;
				case 1:
					local486 = local130.method18169() / 2;
					local490 = local130.method18121() >> 1;
					break;
				case 2:
					local488 = -(local130.method18169() + 1) / 2;
			}
			switch(arg2.aClass309_1.anInt4057 * -1863758235) {
				case 0:
					local492 = local130.method18169();
					local494 = (local130.method18169() + 1) / 2;
					local496 = local130.method18198();
					break;
				case 1:
					local494 = -(local130.method18169() + 1) / 2;
					break;
				case 2:
					local492 = local130.method18169() / 2;
					local496 = local130.method18198() >> 1;
			}
			@Pc(583) Class1 local583 = (Class1) Class136_Sub1.aHashMap5.get(arg1.anInt1635 * 1592054281);
			if (local583 == null) {
				local583 = (Class1) Class136_Sub1.aHashMap4.get(arg2.anInt4027 * -15128681);
			}
			@Pc(627) int local627;
			@Pc(643) int local643;
			if (local583 != null && arg2.anInt4032 * 1339524825 == -1) {
				if (local583.anInt1 * -959968621 > Class136_Sub1.anInt1708 * 2135626771 / 2) {
					local627 = (Class136_Sub1.anInt1708 * -876019987 - local583.anInt1 * 21137517) / (Class136_Sub1.anInt1708 * 2135626771);
				} else {
					local627 = local583.anInt1 * 21137517 / (Class136_Sub1.anInt1708 * 2135626771);
				}
				local643 = local627 << 24 | 0xFFFF00;
				if (arg0 instanceof Class86_Sub1) {
					arg0.method19986(arg1.anInt1637 * 2139882933 - local486 - 7, arg1.anInt1634 * 917865515 - local492 - 7, local130.method18169() + 14, local130.method18169() + 14, local643);
					arg0.method19986(arg1.anInt1637 * 2139882933 - local486 - 5, arg1.anInt1634 * 917865515 - local492 - 5, local130.method18169() + 10, local130.method18169() + 10, local643);
					arg0.method19986(arg1.anInt1637 * 2139882933 - local486 - 3, arg1.anInt1634 * 917865515 - local492 - 3, local130.method18169() + 6, local130.method18169() + 6, local643);
					arg0.method19986(arg1.anInt1637 * 2139882933 - local486 - 1, arg1.anInt1634 * 917865515 - local492 - 1, local130.method18169() + 2, local130.method18169() + 2, local643);
					arg0.method19986(arg1.anInt1637 * 2139882933 - local486, arg1.anInt1634 * 917865515 - local492, local130.method18169(), local130.method18169(), local643);
				} else {
					arg0.method19991(arg1.anInt1637 * 2139882933 - local488, arg1.anInt1634 * 917865515 - local494, local130.method18169() / 2 + 7, local643);
					arg0.method19991(arg1.anInt1637 * 2139882933 - local488, arg1.anInt1634 * 917865515 - local494 - local494 == 0 ? 0 : 1, local130.method18169() / 2 + 5, local643);
					arg0.method19991(arg1.anInt1637 * 2139882933 - local488, arg1.anInt1634 * 917865515 - local494 - local494 == 0 ? 0 : 1, local130.method18169() / 2 + 3, local643);
					arg0.method19991(arg1.anInt1637 * 2139882933 - local488, arg1.anInt1634 * 917865515 - local494 - local494 == 0 ? 0 : 1, local130.method18169() / 2 + 1, local643);
					arg0.method19991(arg1.anInt1637 * 2139882933 - local488, arg1.anInt1634 * 917865515 - local494 - local494 == 0 ? 0 : 1, local130.method18169() / 2, local643);
				}
			}
			local130.method18123(arg1.anInt1637 * 2139882933 - local490, arg1.anInt1634 * 917865515 - local496);
			local627 = 0;
			local643 = 0;
			if (local583 != null && local306 != null) {
				switch(arg2.aClass311_1.anInt4060 * -1448550931) {
					case 0:
					default:
						break;
					case 1:
						local627 = local306.method18121() >> 1;
						break;
					case 2:
						local627 = local306.method18121();
				}
				switch(arg2.aClass309_1.anInt4057 * -1863758235) {
					case 0:
						local643 = (local306.method18198() + local130.method18198()) / 2;
					case 1:
					default:
						break;
					case 2:
						local643 = (local306.method18198() / 2 + local130.method18198()) / 2;
				}
				@Pc(1004) int local1004;
				if (local583.anInt1 * -959968621 > Class136_Sub1.anInt1708 * 2135626771 / 2) {
					local1004 = (Class136_Sub1.anInt1708 * -876019987 - local583.anInt1 * 21137517) / (Class136_Sub1.anInt1708 * 2135626771);
				} else {
					local1004 = local583.anInt1 * 21137517 / (Class136_Sub1.anInt1708 * 2135626771);
				}
				@Pc(1020) int local1020 = local1004 << 24 | 0xFFFF00;
				local306.method18177(arg1.anInt1637 * 2139882933 - local627, arg1.anInt1634 * 917865515 - local643, 0, local1020, 1);
			}
		}
		if (arg2.aString189 != null && Class581.aClass94_12 != null) {
			Class33.method16813(arg0, arg1, arg2, local319, local321, local333, local323);
		}
		if (arg2.anInt4019 * 1747122653 != -1 || arg2.aString189 != null) {
			@Pc(1066) Class77_Sub19 local1066 = new Class77_Sub19(arg1);
			local1066.anInt1520 = local132 * -773567207;
			local1066.anInt1522 = local134 * -1946346005;
			local1066.anInt1519 = local136 * -1190860309;
			local1066.anInt1518 = local138 * -1010377381;
			local1066.anInt1521 = local325 * 869904827;
			local1066.anInt1517 = local327 * -536426739;
			local1066.anInt1523 = local329 * -2069055837;
			local1066.anInt1524 = local331 * -1973105707;
			Class612.aClass695_52.method36383(local1066);
		}
		return false;
	}

	@OriginalMember(owner = "client!ie", name = "apj", descriptor = "(Lclient!yf;I)V", line = 12297)
	static final void method27446(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 != Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950()) {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, local12);
			Class667.method33150();
			client.aBoolean593 = false;
			client.aClass517_1.method30486();
		}
	}
}
