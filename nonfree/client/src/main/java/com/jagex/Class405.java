package com.jagex;

import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
class Class405 implements Comparator {

	// $FF: synthetic field
	@OriginalMember(owner = "client!qf", name = "this$0", descriptor = "Lclient!aew;")
	final Class48_Sub2 this$0;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "([[F[[SB)[[S", line = 56)
	static short[][] method27654(@OriginalArg(0) float[][] arg0, @OriginalArg(1) short[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			for (@Pc(7) int local7 = 0; local7 < arg1[local1].length; local7++) {
				arg1[local1][local7] = (short) (arg0[local1][local7] * 16383.0F);
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!aew;)V", line = 150)
	Class405(@OriginalArg(0) Class48_Sub2 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "(Lclient!on;Lclient!on;I)I", line = 152)
	int method27640(@OriginalArg(0) Class371 arg0, @OriginalArg(1) Class371 arg1) {
		@Pc(3) float local3 = arg0.method27158();
		@Pc(7) float local7 = arg1.method27158();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "(Lclient!on;Lclient!on;)I", line = 152)
	int method27641(@OriginalArg(0) Class371 arg0, @OriginalArg(1) Class371 arg1) {
		@Pc(3) float local3 = arg0.method27158();
		@Pc(7) float local7 = arg1.method27158();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "(Lclient!on;Lclient!on;)I", line = 152)
	int method27644(@OriginalArg(0) Class371 arg0, @OriginalArg(1) Class371 arg1) {
		@Pc(3) float local3 = arg0.method27158();
		@Pc(7) float local7 = arg1.method27158();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "(Lclient!on;Lclient!on;)I", line = 152)
	int method27646(@OriginalArg(0) Class371 arg0, @OriginalArg(1) Class371 arg1) {
		@Pc(3) float local3 = arg0.method27158();
		@Pc(7) float local7 = arg1.method27158();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!on;Lclient!on;)I", line = 152)
	int method27647(@OriginalArg(0) Class371 arg0, @OriginalArg(1) Class371 arg1) {
		@Pc(3) float local3 = arg0.method27158();
		@Pc(7) float local7 = arg1.method27158();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "(Lclient!on;Lclient!on;)I", line = 152)
	int method27649(@OriginalArg(0) Class371 arg0, @OriginalArg(1) Class371 arg1) {
		@Pc(3) float local3 = arg0.method27158();
		@Pc(7) float local7 = arg1.method27158();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 160)
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method27640((Class371) arg0, (Class371) arg1);
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 160)
	public int method27642(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method27640((Class371) arg0, (Class371) arg1);
	}

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 160)
	public int method27645(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method27640((Class371) arg0, (Class371) arg1);
	}

	@OriginalMember(owner = "client!qf", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "hm", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	public boolean method27643(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "ib", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	public boolean method27648(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "zc", descriptor = "(Lclient!vs;I)V", line = 8573)
	static final void method27653(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.anInt3788 * 1047229597;
	}

	@OriginalMember(owner = "client!qf", name = "ahr", descriptor = "(Lclient!vs;I)V", line = 10444)
	static final void method27652(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		client.anInt3120 = arg0.anIntArray496[arg0.anInt5319 * 960738381] * -816478993;
		client.anInt3145 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] * 754835825;
	}

	@OriginalMember(owner = "client!qf", name = "aiq", descriptor = "(Lclient!vs;B)V", line = 10519)
	static final void method27650(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		arg0.aClass269_2 = new Class269(local13, true);
	}

	@OriginalMember(owner = "client!qf", name = "ama", descriptor = "(Lclient!vs;I)V", line = 11359)
	static final void method27651(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub33_3, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
