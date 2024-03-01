package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aft")
public class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!aft", name = "bu", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!aft", name = "ey", descriptor = "Lclient!qu;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!aft", name = "l", descriptor = "I")
	int anInt1220 = 1104342575;

	@OriginalMember(owner = "client!aft", name = "h", descriptor = "I")
	int anInt1214 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!aft", name = "x", descriptor = "I")
	int anInt1215 = -1956864287;

	@OriginalMember(owner = "client!aft", name = "s", descriptor = "I")
	int anInt1219 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!aft", name = "u", descriptor = "I")
	int anInt1217 = -2026907969;

	@OriginalMember(owner = "client!aft", name = "y", descriptor = "I")
	int anInt1218 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!aft", name = "b", descriptor = "I")
	int anInt1213 = 567675443;

	@OriginalMember(owner = "client!aft", name = "c", descriptor = "I")
	int anInt1216 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!aft", name = "z", descriptor = "Lclient!agk;")
	Class3_Sub26 aClass3_Sub26_1;

	@OriginalMember(owner = "client!aft", name = "u", descriptor = "(IB)V", line = 264)
	static void method11192(@OriginalArg(0) int arg0) {
		Class2.anInt3 = 0;
		@Pc(5) int local5 = client.aClass370_1.method26943();
		@Pc(9) int local9 = client.aClass370_1.method27062();
		@Pc(13) Class346 local13 = client.aClass370_1.method27075();
		@Pc(17) Class438 local17 = client.aClass370_1.method26950();
		@Pc(21) Class457 local21 = client.aClass370_1.method26954();
		@Pc(23) int local23 = arg0;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(32) int local32 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] >> 3;
			@Pc(39) int local39 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			if (local32 >= 0 && local32 < Class72_Sub1.aBooleanArrayArray11.length && local39 >= 0 && local39 < Class72_Sub1.aBooleanArrayArray11[local32].length && Class72_Sub1.aBooleanArrayArray11[local32][local39]) {
				local23 = 0;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < local5; local63++) {
			for (@Pc(68) int local68 = 0; local68 < local9; local68++) {
				for (@Pc(73) int local73 = local23; local73 <= arg0 + 1 && local73 <= 3; local73++) {
					if ((local73 < arg0 || local13.method26501(arg0, local73, local63, local68)) && !Class279.method25419((Interface43) local17.method28053(local73, local63, local68), local21, local63, local68) && !Class279.method25419((Interface43) local17.method28150(local73, local63, local68, client.anInterface48_1), local21, local63, local68) && !Class279.method25419((Interface43) local17.method28066(local73, local63, local68), local21, local63, local68) && Class279.method25419((Interface43) local17.method28200(local73, local63, local68), local21, local63, local68)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aft", name = "<init>", descriptor = "(Lclient!agk;)V", line = 883)
	Class3_Sub10(@OriginalArg(0) Class3_Sub26 arg0) {
		this.aClass3_Sub26_1 = arg0;
	}

	@OriginalMember(owner = "client!aft", name = "g", descriptor = "(II)Z", line = 888)
	boolean method11189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt1220 * -1332943055 && arg0 <= this.anInt1214 * -1080620715 && arg1 >= this.anInt1215 * 2043075295 && arg1 <= this.anInt1219 * -1513046197) {
			return true;
		} else {
			return arg0 >= this.anInt1217 * -1721669951 && arg0 <= this.anInt1218 * 1719988043 && arg1 >= this.anInt1213 * 2075393797 && arg1 <= this.anInt1216 * -656196851;
		}
	}

	@OriginalMember(owner = "client!aft", name = "p", descriptor = "(III)Z", line = 888)
	boolean method11190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt1220 * -1332943055 && arg0 <= this.anInt1214 * -1080620715 && arg1 >= this.anInt1215 * 2043075295 && arg1 <= this.anInt1219 * -1513046197) {
			return true;
		} else {
			return arg0 >= this.anInt1217 * -1721669951 && arg0 <= this.anInt1218 * 1719988043 && arg1 >= this.anInt1213 * 2075393797 && arg1 <= this.anInt1216 * -656196851;
		}
	}

	@OriginalMember(owner = "client!aft", name = "a", descriptor = "(II)Z", line = 888)
	boolean method11191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt1220 * -1332943055 && arg0 <= this.anInt1214 * -1080620715 && arg1 >= this.anInt1215 * 2043075295 && arg1 <= this.anInt1219 * -1513046197) {
			return true;
		} else {
			return arg0 >= this.anInt1217 * -1721669951 && arg0 <= this.anInt1218 * 1719988043 && arg1 >= this.anInt1213 * 2075393797 && arg1 <= this.anInt1216 * -656196851;
		}
	}
}
