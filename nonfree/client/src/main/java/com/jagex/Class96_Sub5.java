package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afe")
public class Class96_Sub5 extends Class96 {

	@OriginalMember(owner = "client!afe", name = "fx", descriptor = "Lclient!pw;")
	public static Class478 aClass478_17;

	@OriginalMember(owner = "client!afe", name = "c", descriptor = "Ljava/lang/String;")
	final String aString27;

	@OriginalMember(owner = "client!afe", name = "v", descriptor = "I")
	final int anInt819;

	@OriginalMember(owner = "client!afe", name = "<init>", descriptor = "(Lclient!akv;)V", line = 12)
	Class96_Sub5(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.aString27 = arg0.method22523();
		this.anInt819 = arg0.method22483() * -1982141145;
	}

	@OriginalMember(owner = "client!afe", name = "w", descriptor = "()V", line = 18)
	@Override
	public void method19913() {
		if (client.anInt3381 * -1450626137 != -1) {
			Class528.method30708(client.anInt3381 * -1450626137, this.aString27, this.anInt819 * 1323283095);
		}
	}

	@OriginalMember(owner = "client!afe", name = "y", descriptor = "()V", line = 18)
	@Override
	public void method19912() {
		if (client.anInt3381 * -1450626137 != -1) {
			Class528.method30708(client.anInt3381 * -1450626137, this.aString27, this.anInt819 * 1323283095);
		}
	}

	@OriginalMember(owner = "client!afe", name = "c", descriptor = "(I)V", line = 18)
	@Override
	public void method19911() {
		if (client.anInt3381 * -1450626137 != -1) {
			Class528.method30708(client.anInt3381 * -1450626137, this.aString27, this.anInt819 * 1323283095);
		}
	}

	@OriginalMember(owner = "client!afe", name = "q", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", line = 156)
	public static void method7143(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (arg0.length() > 320 || !Class539.method30909()) {
			return;
		}
		Class331.method27603();
		Class589.aString234 = arg0;
		Class589.aString233 = arg1;
		Class589.aString235 = arg2;
		Class589.aBoolean813 = arg3;
		Class668.method33179(12);
	}

	@OriginalMember(owner = "client!afe", name = "is", descriptor = "(Lclient!yf;I)V", line = 6048)
	static final void method7144(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class656.method33036(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!afe", name = "je", descriptor = "(Lclient!agh;[IIZB)V", line = 9955)
	public static void method7145(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) boolean local5;
		@Pc(7) int local7;
		if (arg0.anIntArray272 != null) {
			local5 = true;
			for (local7 = 0; local7 < arg0.anIntArray272.length; local7++) {
				if (arg0.anIntArray272[local7] != arg1[local7]) {
					local5 = false;
					break;
				}
			}
			@Pc(28) Class151 local28 = arg0.aClass151_3;
			if (local5 && local28.method23396()) {
				@Pc(39) Class234 local39 = arg0.aClass151_3.method23398();
				@Pc(44) int local44 = local39.anInt3773 * 629077835;
				if (local44 == 1) {
					local28.method23460(arg2);
				}
				if (local44 == 2) {
					local28.method23450();
				}
			}
		}
		local5 = true;
		for (local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] != -1) {
				local5 = false;
			}
			if (arg0.anIntArray272 == null || arg0.anIntArray272[local7] == -1 || ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(arg1[local7])).anInt3768 * 995056269 >= ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(arg0.anIntArray272[local7])).anInt3768 * 995056269) {
				arg0.anIntArray272 = arg1;
				arg0.aClass151_3.method23428(arg2);
				if (arg3) {
					arg0.anInt2877 = arg0.anInt2900 * -1267839587;
				}
			}
		}
		if (!local5) {
			return;
		}
		arg0.anIntArray272 = arg1;
		arg0.aClass151_3.method23428(arg2);
		if (arg3) {
			arg0.anInt2877 = arg0.anInt2900 * -1267839587;
		}
	}
}
