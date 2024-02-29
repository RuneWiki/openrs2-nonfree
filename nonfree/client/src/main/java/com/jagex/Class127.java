package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public class Class127 implements Interface75 {

	@OriginalMember(owner = "client!pd", name = "ly", descriptor = "I")
	public static int anInt1449;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Lclient!pd;")
	public static final Class127 aClass127_63 = new Class127_Sub1(Class647.aClass647_84, 0, true, true);

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!pd;")
	public static final Class127 aClass127_68 = new Class127_Sub2(Class647.aClass647_85, 1, false, true);

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "Lclient!pd;")
	public static final Class127 aClass127_64 = new Class127_Sub5(Class647.aClass647_46, 2, true, true);

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Lclient!pd;")
	static final Class127 aClass127_65 = new Class127_Sub4(Class647.aClass647_87, 3, false, false);

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "Lclient!pd;")
	static final Class127 aClass127_66 = new Class127(Class647.aClass647_92, 4, false, false);

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Lclient!pd;")
	public static final Class127 aClass127_69 = new Class127(Class647.aClass647_89, 5, true, true);

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!pd;")
	public static final Class127 aClass127_70 = new Class127(Class647.aClass647_86, 6, true, true);

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "Lclient!pd;")
	public static final Class127 aClass127_71 = new Class127(Class647.aClass647_91, 7, true, false);

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "Lclient!pd;")
	static final Class127 aClass127_62 = new Class127_Sub3(Class647.aClass647_61, 8, false, false);

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!pd;")
	public static final Class127 aClass127_67 = new Class127(Class647.aClass647_106, 9, false, true);

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "Lclient!pd;")
	static final Class127 aClass127_72 = new Class127(Class647.aClass647_36, 10, false, false);

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "Lclient!xl;")
	final Class647 aClass647_8;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	final int anInt1448;

	// $FF: synthetic method
	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!xl;IZZLclient!aif;)V", line = 22)
	Class127(@OriginalArg(0) Class647 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class127_Sub1 arg4) {
		this(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "(I)[Lclient!pd;", line = 63)
	public static Class127[] method13144() {
		return new Class127[] { aClass127_67, aClass127_72, aClass127_63, aClass127_70, aClass127_71, aClass127_68, aClass127_66, aClass127_64, aClass127_65, aClass127_69, aClass127_62 };
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "()[Lclient!pd;", line = 63)
	public static Class127[] method13145() {
		return new Class127[] { aClass127_67, aClass127_72, aClass127_63, aClass127_70, aClass127_71, aClass127_68, aClass127_66, aClass127_64, aClass127_65, aClass127_69, aClass127_62 };
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!xl;IZZ)V", line = 66)
	Class127(@OriginalArg(0) Class647 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.aClass647_8 = arg0;
		this.anInt1448 = arg1 * 288015735;
	}

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "(B)Lclient!xl;", line = 72)
	public final Class647 method13146() {
		return this.aClass647_8;
	}

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "()Lclient!xl;", line = 72)
	public final Class647 method13147() {
		return this.aClass647_8;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()I", line = 76)
	@Override
	public int method36479() {
		return this.anInt1448 * -214588345;
	}

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "()I", line = 76)
	@Override
	public int method36478() {
		return this.anInt1448 * -214588345;
	}

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "()I", line = 76)
	@Override
	public int method36477() {
		return this.anInt1448 * -214588345;
	}

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "(Lclient!ci;B)Ljava/lang/Object;", line = 80)
	public Object method13148(@OriginalArg(0) Class75 arg0) {
		return arg0.aBoolean23 ? this.method13151(arg0) : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 80)
	public Object method13149(@OriginalArg(0) Class75 arg0) {
		return arg0.aBoolean23 ? this.method13151(arg0) : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 80)
	public Object method13150(@OriginalArg(0) Class75 arg0) {
		return arg0.aBoolean23 ? this.method13151(arg0) : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "(Lclient!ci;I)Ljava/lang/Object;", line = 85)
	Object method13151(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 85)
	Object method13152(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 85)
	Object method13153(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!pd", name = "ft", descriptor = "(ZB)V", line = 1948)
	static void method13154(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (client.anInt3459 * -993629849 != -1) {
				Class248.method26154(client.anInt3459 * -993629849);
			}
			for (@Pc(16) Class77_Sub38 local16 = (Class77_Sub38) client.aClass12_20.method190(); local16 != null; local16 = (Class77_Sub38) client.aClass12_20.method192()) {
				if (!local16.method24066()) {
					local16 = (Class77_Sub38) client.aClass12_20.method190();
					if (local16 == null) {
						break;
					}
				}
				Class77_Sub41.method14838(local16, true, false);
			}
			client.anInt3459 = 1328962985;
			client.aClass12_20 = new Class12(8);
			Class696.method36463();
			client.anInt3459 = Class617.aClass629_1.anInt5674 * 1207952641;
			if (-993629849 * client.anInt3459 != -1) {
				Class290.method27000(false);
				Class430.method28815();
				Class469.method29595(client.anInt3459 * -993629849, null);
			}
		}
		Class589.aBoolean814 = true;
	}

	@OriginalMember(owner = "client!pd", name = "eq", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5249)
	static final void method13155(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (!local13.equals(arg0.aString178)) {
			arg0.aString178 = local13;
			Class461.method29531(arg0);
		}
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class354.method27932(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!pd", name = "iu", descriptor = "(Lclient!yf;S)V", line = 6041)
	static final void method13156(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class656.method33036(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!pd", name = "kx", descriptor = "(Lclient!gm;IIILclient!yf;B)V", line = 6411)
	static final void method13157(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class665 arg4) {
		if (arg0.anIntArray394 == null) {
			throw new RuntimeException();
		}
		arg0.anIntArray394[arg1] = arg2;
		arg0.anIntArray395[arg1] = arg3;
	}

	@OriginalMember(owner = "client!pd", name = "vv", descriptor = "(Lclient!yf;I)V", line = 8486)
	static final void method13158(@OriginalArg(0) Class665 arg0) {
		if (client.anInt3466 * 365872613 >= 2) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3466 * 365872613;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}
}
