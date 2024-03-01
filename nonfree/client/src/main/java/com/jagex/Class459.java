package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public class Class459 {

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "Lclient!sm;")
	public static final Class459 aClass459_2 = new Class459(0);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!sm;")
	public static final Class459 aClass459_1 = new Class459(1);

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "Lclient!sm;")
	public static final Class459 aClass459_3 = new Class459(2);

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(I)V", line = 8)
	Class459(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "wh", descriptor = "(Lclient!vs;I)V", line = 8116)
	static final void method28532(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(48) Class574 local48 = Class438.aClass589_1.method33297(local33);
		if (local13 != local48.aChar13 || local48.aChar14 != local23) {
			throw new RuntimeException(local33 + " " + local43);
		} else if (local23 == 115) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local48.method33097(local43);
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local48.method33089(local43);
		}
	}

	@OriginalMember(owner = "client!sm", name = "ahq", descriptor = "(Lclient!vs;I)V", line = 10282)
	static final void method28533(@OriginalArg(0) Class536 arg0) {
		@Pc(3) int local3 = Class76.anInt2902 * 380872341;
		@Pc(7) int local7 = Class219.anInt3728 * -668175823;
		@Pc(9) int local9 = -1;
		if (Class552.aBoolean823) {
			@Pc(14) Class573[] local14 = Class188.method23975();
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				@Pc(24) Class573 local24 = local14[local16];
				if (local3 == local24.anInt5423 * 1081330127 && local7 == local24.anInt5424 * 1418262355) {
					local9 = local16;
					break;
				}
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local9;
	}

	@OriginalMember(owner = "client!sm", name = "ave", descriptor = "(Lclient!vs;I)V", line = 12696)
	static final void method28534(@OriginalArg(0) Class536 arg0) {
		Class30.method16449(arg0.aClass26_Sub1_Sub5_Sub1_1, arg0);
	}
}
