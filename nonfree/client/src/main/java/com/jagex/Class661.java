package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yb")
public class Class661 implements Interface75 {

	@OriginalMember(owner = "client!yb", name = "u", descriptor = "Lclient!eq;")
	static Class231 aClass231_4;

	@OriginalMember(owner = "client!yb", name = "bu", descriptor = "Z")
	static boolean aBoolean856;

	@OriginalMember(owner = "client!yb", name = "p", descriptor = "Lclient!yb;")
	public static final Class661 aClass661_5 = new Class661("", 0, new Class660[] { Class660.aClass660_1 });

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "Lclient!yb;")
	public static final Class661 aClass661_2 = new Class661("", 1, new Class660[] { Class660.aClass660_2, Class660.aClass660_1 });

	@OriginalMember(owner = "client!yb", name = "v", descriptor = "Lclient!yb;")
	public static final Class661 aClass661_14 = new Class661("", 2, new Class660[] { Class660.aClass660_2, Class660.aClass660_3 });

	@OriginalMember(owner = "client!yb", name = "l", descriptor = "Lclient!yb;")
	public static final Class661 aClass661_13 = new Class661("", 3, new Class660[] { Class660.aClass660_2 });

	@OriginalMember(owner = "client!yb", name = "y", descriptor = "Lclient!yb;")
	public static final Class661 aClass661_3 = new Class661("", 4);

	@OriginalMember(owner = "client!yb", name = "w", descriptor = "Lclient!yb;")
	public static final Class661 aClass661_6 = new Class661("", 5, new Class660[] { Class660.aClass660_2, Class660.aClass660_1 });

	@OriginalMember(owner = "client!yb", name = "t", descriptor = "Lclient!yb;")
	static final Class661 aClass661_7 = new Class661("", 6, new Class660[] { Class660.aClass660_1 });

	@OriginalMember(owner = "client!yb", name = "q", descriptor = "Lclient!yb;")
	static final Class661 aClass661_8 = new Class661("", 8, new Class660[] { Class660.aClass660_2, Class660.aClass660_1 });

	@OriginalMember(owner = "client!yb", name = "x", descriptor = "Lclient!yb;")
	static final Class661 aClass661_9 = new Class661("", 9, new Class660[] { Class660.aClass660_2, Class660.aClass660_3 });

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "Lclient!yb;")
	public static final Class661 aClass661_10 = new Class661("", 10, new Class660[] { Class660.aClass660_2 });

	@OriginalMember(owner = "client!yb", name = "s", descriptor = "Lclient!yb;")
	static final Class661 aClass661_4 = new Class661("", 11, new Class660[] { Class660.aClass660_2 });

	@OriginalMember(owner = "client!yb", name = "r", descriptor = "Lclient!yb;")
	static final Class661 aClass661_12 = new Class661("", 12, new Class660[] { Class660.aClass660_2, Class660.aClass660_1 });

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "Lclient!yb;")
	static final Class661 aClass661_11 = new Class661("", 13, new Class660[] { Class660.aClass660_2 });

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "Ljava/util/Set;")
	final Set aSet2 = new HashSet();

	@OriginalMember(owner = "client!yb", name = "z", descriptor = "I")
	final int anInt5778;

	static {
		method33079();
	}

	@OriginalMember(owner = "client!yb", name = "w", descriptor = "()[Lclient!yb;", line = 35)
	public static Class661[] method33078() {
		return new Class661[] { aClass661_13, aClass661_6, aClass661_3, aClass661_12, aClass661_14, aClass661_9, aClass661_10, aClass661_7, aClass661_5, aClass661_11, aClass661_8, aClass661_2, aClass661_4 };
	}

	@OriginalMember(owner = "client!yb", name = "p", descriptor = "(I)[Lclient!yb;", line = 35)
	public static Class661[] method33079() {
		return new Class661[] { aClass661_13, aClass661_6, aClass661_3, aClass661_12, aClass661_14, aClass661_9, aClass661_10, aClass661_7, aClass661_5, aClass661_11, aClass661_8, aClass661_2, aClass661_4 };
	}

	@OriginalMember(owner = "client!yb", name = "t", descriptor = "()[Lclient!yb;", line = 35)
	public static Class661[] method33080() {
		return new Class661[] { aClass661_13, aClass661_6, aClass661_3, aClass661_12, aClass661_14, aClass661_9, aClass661_10, aClass661_7, aClass661_5, aClass661_11, aClass661_8, aClass661_2, aClass661_4 };
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 38)
	Class661(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5778 = arg1 * -733164599;
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "(Ljava/lang/String;I[Lclient!ya;)V", line = 42)
	Class661(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class660[] arg2) {
		this.anInt5778 = arg1 * -733164599;
		@Pc(13) Class660[] local13 = arg2;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class660 local23 = local13[local15];
			this.aSet2.add(local23);
		}
	}

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "()I", line = 54)
	@Override
	public int method36479() {
		return this.anInt5778 * 1443970681;
	}

	@OriginalMember(owner = "client!yb", name = "l", descriptor = "()I", line = 54)
	@Override
	public int method36478() {
		return this.anInt5778 * 1443970681;
	}

	@OriginalMember(owner = "client!yb", name = "y", descriptor = "()I", line = 54)
	@Override
	public int method36477() {
		return this.anInt5778 * 1443970681;
	}

	@OriginalMember(owner = "client!yb", name = "v", descriptor = "(Lclient!ya;I)Z", line = 58)
	public boolean method33081(@OriginalArg(0) Class660 arg0) {
		return this.aSet2.contains(arg0);
	}

	@OriginalMember(owner = "client!yb", name = "q", descriptor = "(Lclient!ya;)Z", line = 58)
	public boolean method33082(@OriginalArg(0) Class660 arg0) {
		return this.aSet2.contains(arg0);
	}

	@OriginalMember(owner = "client!yb", name = "v", descriptor = "(Ljava/lang/String;I)Z", line = 162)
	static boolean method33083(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (@Pc(11) MalformedURLException local11) {
			return false;
		}
	}

	@OriginalMember(owner = "client!yb", name = "u", descriptor = "(Lclient!gm;III)V", line = 534)
	static void method33084(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (client.aBoolean619) {
			@Pc(16) Class67 local16 = (Class67) (Class121_Sub1.anInt1207 * 410979031 == -1 ? null : Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(Class121_Sub1.anInt1207 * 410979031));
			if (client.method25376(arg0).method13659() && (Class96_Sub15.anInt893 * 460977285 & 0x20) != 0 && (local16 == null || arg0.method26638(Class121_Sub1.anInt1207 * 410979031, local16.anInt198 * 263946597) != local16.anInt198 * 263946597)) {
				Class155.method23634(client.aString160, client.aString161 + " " + Class184.aString136 + " " + arg0.aString179, Class130.anInt1407 * -731032933, 58, arg0.anInt3936 * 403396513, 0L, arg0.anInt3927 * 1365669833, arg0.anInt3863 * -1278450723, true, false, (long) (arg0.anInt3927 * 1365669833 << 0 | arg0.anInt3863 * -1278450723), false);
			}
		}
		for (@Pc(97) int local97 = 9; local97 >= 5; local97--) {
			@Pc(105) String local105 = Class398.method28453(arg0, local97);
			if (local105 != null) {
				Class155.method23634(local105, arg0.aString179, Class77_Sub1_Sub11.method22236(arg0, local97), 1007, arg0.anInt3936 * 403396513, (long) (local97 + 1), arg0.anInt3927 * 1365669833, arg0.anInt3863 * -1278450723, true, false, (long) (arg0.anInt3927 * 1365669833 << 0 | arg0.anInt3863 * -1278450723), false);
			}
		}
		@Pc(154) String local154 = Class596.method31921(arg0);
		if (local154 != null) {
			Class155.method23634(local154, arg0.aString179, arg0.anInt3920 * 1751127275, 25, arg0.anInt3936 * 403396513, 0L, arg0.anInt3927 * 1365669833, arg0.anInt3863 * -1278450723, true, false, (long) (arg0.anInt3927 * 1365669833 << 0 | arg0.anInt3863 * -1278450723), false);
		}
		for (@Pc(196) int local196 = 4; local196 >= 0; local196--) {
			@Pc(203) String local203 = Class398.method28453(arg0, local196);
			if (local203 != null) {
				Class155.method23634(local203, arg0.aString179, Class77_Sub1_Sub11.method22236(arg0, local196), 57, arg0.anInt3936 * 403396513, (long) (local196 + 1), arg0.anInt3927 * 1365669833, arg0.anInt3863 * -1278450723, true, false, (long) (arg0.anInt3927 * 1365669833 << 0 | arg0.anInt3863 * -1278450723), false);
			}
		}
		if (!client.method25376(arg0).method13645()) {
			return;
		}
		if (arg0.aString176 == null) {
			Class155.method23634(Class44.aClass44_18.method713(Class128.aClass667_3), "", -1, 30, arg0.anInt3936 * 403396513, 0L, arg0.anInt3927 * 1365669833, arg0.anInt3863 * -1278450723, true, false, (long) (arg0.anInt3927 * 1365669833 << 0 | arg0.anInt3863 * -1278450723), false);
		} else {
			Class155.method23634(arg0.aString176, "", -1, 30, arg0.anInt3936 * 403396513, 0L, arg0.anInt3927 * 1365669833, arg0.anInt3863 * -1278450723, true, false, (long) (arg0.anInt3927 * 1365669833 << 0 | arg0.anInt3863 * -1278450723), false);
		}
	}

	@OriginalMember(owner = "client!yb", name = "hv", descriptor = "(Lclient!yf;B)V", line = 5866)
	static final void method33085(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class462.method29540(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!yb", name = "agh", descriptor = "(Lclient!yf;I)V", line = 10506)
	static final void method33086(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class615.aClass465_1.method29551(local13).aCharArray3[local23];
	}

	@OriginalMember(owner = "client!yb", name = "aif", descriptor = "(Lclient!yf;I)V", line = 10855)
	static final void method33087(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(15) Class77_Sub1_Sub8 local15 = Class261.method26362();
		if (local15 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			return;
		}
		@Pc(30) boolean local30 = local15.method21862(local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class674.anIntArray538);
		if (local30) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class674.anIntArray538[1];
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class674.anIntArray538[2];
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		}
	}
}
