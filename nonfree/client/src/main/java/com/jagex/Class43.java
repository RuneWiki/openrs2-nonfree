package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public class Class43 implements Interface56 {

	@OriginalMember(owner = "client!nw", name = "ae", descriptor = "I")
	public static int anInt1086;

	@OriginalMember(owner = "client!nw", name = "bx", descriptor = "[I")
	static int[] anIntArray163;

	@OriginalMember(owner = "client!nw", name = "p", descriptor = "Lclient!nw;")
	public static final Class43 aClass43_68 = new Class43_Sub5(Class185.aClass185_59, 0, true, true);

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "Lclient!nw;")
	public static final Class43 aClass43_62 = new Class43_Sub4(Class185.aClass185_69, 1, false, true);

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "Lclient!nw;")
	public static final Class43 aClass43_60 = new Class43_Sub3(Class185.aClass185_61, 2, true, true);

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "Lclient!nw;")
	static final Class43 aClass43_61 = new Class43_Sub1(Class185.aClass185_62, 3, false, false);

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "Lclient!nw;")
	static final Class43 aClass43_67 = new Class43(Class185.aClass185_63, 4, false, false);

	@OriginalMember(owner = "client!nw", name = "x", descriptor = "Lclient!nw;")
	static final Class43 aClass43_63 = new Class43(Class185.aClass185_64, 5, true, false);

	@OriginalMember(owner = "client!nw", name = "s", descriptor = "Lclient!nw;")
	public static final Class43 aClass43_64 = new Class43(Class185.aClass185_65, 6, true, true);

	@OriginalMember(owner = "client!nw", name = "u", descriptor = "Lclient!nw;")
	public static final Class43 aClass43_59 = new Class43(Class185.aClass185_40, 7, true, false);

	@OriginalMember(owner = "client!nw", name = "y", descriptor = "Lclient!nw;")
	static final Class43 aClass43_65 = new Class43_Sub2(Class185.aClass185_67, 8, false, false);

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "Lclient!nw;")
	static final Class43 aClass43_66 = new Class43(null, 9, false, false);

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Lclient!nw;")
	static final Class43 aClass43_69 = new Class43(Class185.aClass185_73, 10, false, false);

	@OriginalMember(owner = "client!nw", name = "z", descriptor = "Lclient!fv;")
	final Class185 aClass185_6;

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
	final int anInt1087;

	// $FF: synthetic method
	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!fv;IZZLclient!aev;)V", line = 12)
	Class43(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class43_Sub5 arg4) {
		this(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIII)I", line = 19)
	public static int method9506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "()[Lclient!nw;", line = 53)
	public static Class43[] method9492() {
		return new Class43[] { aClass43_62, aClass43_61, aClass43_60, aClass43_68, aClass43_59, aClass43_67, aClass43_63, aClass43_66, aClass43_69, aClass43_64, aClass43_65 };
	}

	@OriginalMember(owner = "client!nw", name = "p", descriptor = "(I)[Lclient!nw;", line = 53)
	public static Class43[] method9496() {
		return new Class43[] { aClass43_62, aClass43_61, aClass43_60, aClass43_68, aClass43_59, aClass43_67, aClass43_63, aClass43_66, aClass43_69, aClass43_64, aClass43_65 };
	}

	@OriginalMember(owner = "client!nw", name = "z", descriptor = "()[Lclient!nw;", line = 53)
	public static Class43[] method9497() {
		return new Class43[] { aClass43_62, aClass43_61, aClass43_60, aClass43_68, aClass43_59, aClass43_67, aClass43_63, aClass43_66, aClass43_69, aClass43_64, aClass43_65 };
	}

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "()[Lclient!nw;", line = 53)
	public static Class43[] method9498() {
		return new Class43[] { aClass43_62, aClass43_61, aClass43_60, aClass43_68, aClass43_59, aClass43_67, aClass43_63, aClass43_66, aClass43_69, aClass43_64, aClass43_65 };
	}

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "()[Lclient!nw;", line = 53)
	public static Class43[] method9499() {
		return new Class43[] { aClass43_62, aClass43_61, aClass43_60, aClass43_68, aClass43_59, aClass43_67, aClass43_63, aClass43_66, aClass43_69, aClass43_64, aClass43_65 };
	}

	@OriginalMember(owner = "client!nw", name = "n", descriptor = "()[Lclient!nw;", line = 53)
	public static Class43[] method9503() {
		return new Class43[] { aClass43_62, aClass43_61, aClass43_60, aClass43_68, aClass43_59, aClass43_67, aClass43_63, aClass43_66, aClass43_69, aClass43_64, aClass43_65 };
	}

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!fv;IZZ)V", line = 56)
	Class43(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.aClass185_6 = arg0;
		this.anInt1087 = arg1 * 514324607;
	}

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "()Lclient!fv;", line = 62)
	public Class185 method9489() {
		return this.aClass185_6;
	}

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "(I)Lclient!fv;", line = 62)
	public Class185 method9491() {
		return this.aClass185_6;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)I", line = 66)
	@Override
	public int method33765() {
		return this.anInt1087 * 1325385599;
	}

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "()I", line = 66)
	@Override
	public int method33766() {
		return this.anInt1087 * 1325385599;
	}

	@OriginalMember(owner = "client!nw", name = "x", descriptor = "()I", line = 66)
	@Override
	public int method33764() {
		return this.anInt1087 * 1325385599;
	}

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "()I", line = 66)
	@Override
	public int method33767() {
		return this.anInt1087 * 1325385599;
	}

	@OriginalMember(owner = "client!nw", name = "s", descriptor = "(Lclient!cy;I)Ljava/lang/Object;", line = 70)
	public Object method9500(@OriginalArg(0) Class11 arg0) {
		return arg0.aBoolean40 ? this.method9490(arg0) : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 70)
	public Object method9501(@OriginalArg(0) Class11 arg0) {
		return arg0.aBoolean40 ? this.method9490(arg0) : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!nw", name = "q", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 70)
	public Object method9502(@OriginalArg(0) Class11 arg0) {
		return arg0.aBoolean40 ? this.method9490(arg0) : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!nw", name = "u", descriptor = "(Lclient!cy;B)Ljava/lang/Object;", line = 75)
	Object method9490(@OriginalArg(0) Class11 arg0) {
		return arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!nw", name = "y", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 75)
	Object method9494(@OriginalArg(0) Class11 arg0) {
		return arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 75)
	Object method9495(@OriginalArg(0) Class11 arg0) {
		return arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "(ZS)V", line = 174)
	public static void method9505(@OriginalArg(0) boolean arg0) {
		if (client.anInt3065 * -1773414811 == 3 || client.anInt3065 * -1773414811 == 4) {
			return;
		}
		if (!arg0) {
			if (Class496.aClass13Array1 != null) {
				@Pc(16) Class13[] local16 = Class496.aClass13Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class13 local26 = local16[local18];
					local26.method16892();
				}
			}
			if (Class131.anInt3329 * 1412702665 != -1) {
				Class510.aClass183_1.method23573(Class131.anInt3329 * 1412702665, 255);
			}
		}
		client.anInt3065 = -1022115257;
		Class223.aClass3_Sub41_17 = null;
		client.aBoolean582 = false;
		if (Class131.anInt3330 * -2090483569 > 0) {
			Class291.method25543(Class634.aClass634_20, Class131.anInt3330 * -2090483569, -1);
		}
		Class123.method22843();
		@Pc(68) Class3_Sub23 local68 = Class269.method25284(Class311.aClass311_2, client.aClass82_2.aClass577_2);
		local68.aClass3_Sub41_Sub1_1.method20250(arg0 ? 1 : 0);
		client.aClass82_2.method21601(local68);
	}

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "(II)V", line = 899)
	static void method9493(@OriginalArg(0) int arg0) {
		if (Class190.anInt3670 * 1734568685 == 166) {
			Class190.anInt3669 = arg0 * -403560809;
		} else if (Class190.anInt3670 * 1734568685 == 240) {
			Class190.anInt3671 = arg0 * -1497570763;
		}
	}

	@OriginalMember(owner = "client!nw", name = "wc", descriptor = "(Lclient!vs;I)V", line = 8158)
	static final void method9504(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class574 local17 = Class438.aClass589_1.method33297(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.method33086();
	}

	@OriginalMember(owner = "client!nw", name = "atq", descriptor = "(Lclient!vs;B)V", line = 12382)
	static final void method9507(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12965() ? 1 : 0;
	}
}
