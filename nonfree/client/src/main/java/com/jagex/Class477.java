package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public class Class477 {

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	static final int anInt5138 = 2000000000;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	int anInt5135 = 0;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "I")
	int anInt5137 = 959261471;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "I")
	int anInt5136 = -828076673;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!tw;")
	final Class492 aClass492_1;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Z")
	final boolean aBoolean793;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!tw;Z)V", line = 14)
	public Class477(@OriginalArg(0) Class492 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass492_1 = arg0;
		this.aBoolean793 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "p", descriptor = "(I)I", line = 20)
	public int method28799() {
		return this.anInt5135 * 1296968929;
	}

	@OriginalMember(owner = "client!te", name = "y", descriptor = "()I", line = 20)
	public int method28807() {
		return this.anInt5135 * 1296968929;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()I", line = 20)
	public int method28808() {
		return this.anInt5135 * 1296968929;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!vl;I)I", line = 24)
	public int method28800(@OriginalArg(0) Class531 arg0) {
		if (arg0 == Class531.aClass531_1 && this.aClass492_1.method29261() && this.aClass492_1.method29269()) {
			@Pc(17) int local17 = this.aClass492_1.method29283();
			if (!this.aBoolean793) {
				local17 /= 10;
			}
			if (this.anInt5135 * 1296968929 > local17) {
				return local17;
			}
		}
		return this.anInt5135 * 1296968929;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(Lclient!vl;)I", line = 24)
	public int method28809(@OriginalArg(0) Class531 arg0) {
		if (arg0 == Class531.aClass531_1 && this.aClass492_1.method29261() && this.aClass492_1.method29269()) {
			@Pc(17) int local17 = this.aClass492_1.method29283();
			if (!this.aBoolean793) {
				local17 /= 10;
			}
			if (this.anInt5135 * 1296968929 > local17) {
				return local17;
			}
		}
		return this.anInt5135 * 1296968929;
	}

	@OriginalMember(owner = "client!te", name = "z", descriptor = "(Lclient!vl;)I", line = 24)
	public int method28810(@OriginalArg(0) Class531 arg0) {
		if (arg0 == Class531.aClass531_1 && this.aClass492_1.method29261() && this.aClass492_1.method29269()) {
			@Pc(17) int local17 = this.aClass492_1.method29283();
			if (!this.aBoolean793) {
				local17 /= 10;
			}
			if (this.anInt5135 * 1296968929 > local17) {
				return local17;
			}
		}
		return this.anInt5135 * 1296968929;
	}

	@OriginalMember(owner = "client!te", name = "n", descriptor = "(Lclient!vl;)I", line = 24)
	public int method28814(@OriginalArg(0) Class531 arg0) {
		if (arg0 == Class531.aClass531_1 && this.aClass492_1.method29261() && this.aClass492_1.method29269()) {
			@Pc(17) int local17 = this.aClass492_1.method29283();
			if (!this.aBoolean793) {
				local17 /= 10;
			}
			if (this.anInt5135 * 1296968929 > local17) {
				return local17;
			}
		}
		return this.anInt5135 * 1296968929;
	}

	@OriginalMember(owner = "client!te", name = "j", descriptor = "(Lclient!vl;)I", line = 24)
	public int method28819(@OriginalArg(0) Class531 arg0) {
		if (arg0 == Class531.aClass531_1 && this.aClass492_1.method29261() && this.aClass492_1.method29269()) {
			@Pc(17) int local17 = this.aClass492_1.method29283();
			if (!this.aBoolean793) {
				local17 /= 10;
			}
			if (this.anInt5135 * 1296968929 > local17) {
				return local17;
			}
		}
		return this.anInt5135 * 1296968929;
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(IB)V", line = 33)
	public void method28801(@OriginalArg(0) int arg0) {
		this.anInt5135 = arg0 * -614197471;
		if (this.anInt5135 * 1296968929 < 0) {
			this.anInt5135 = 0;
		} else if (this.aBoolean793 && this.anInt5135 * 1296968929 > 2000000000) {
			this.anInt5135 = -30141440;
		} else if (!this.aBoolean793 && this.anInt5135 * 1296968929 > 200000000) {
			this.anInt5135 = 2144469504;
		}
		this.method28806();
	}

	@OriginalMember(owner = "client!te", name = "r", descriptor = "(I)V", line = 33)
	public void method28813(@OriginalArg(0) int arg0) {
		this.anInt5135 = arg0 * -614197471;
		if (this.anInt5135 * 1296968929 < 0) {
			this.anInt5135 = 0;
		} else if (this.aBoolean793 && this.anInt5135 * 1296968929 > 2000000000) {
			this.anInt5135 = -30141440;
		} else if (!this.aBoolean793 && this.anInt5135 * 1296968929 > 200000000) {
			this.anInt5135 = 2144469504;
		}
		this.method28806();
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V", line = 33)
	public void method28815(@OriginalArg(0) int arg0) {
		this.anInt5135 = arg0 * -614197471;
		if (this.anInt5135 * 1296968929 < 0) {
			this.anInt5135 = 0;
		} else if (this.aBoolean793 && this.anInt5135 * 1296968929 > 2000000000) {
			this.anInt5135 = -30141440;
		} else if (!this.aBoolean793 && this.anInt5135 * 1296968929 > 200000000) {
			this.anInt5135 = 2144469504;
		}
		this.method28806();
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V", line = 33)
	public void method28817(@OriginalArg(0) int arg0) {
		this.anInt5135 = arg0 * -614197471;
		if (this.anInt5135 * 1296968929 < 0) {
			this.anInt5135 = 0;
		} else if (this.aBoolean793 && this.anInt5135 * 1296968929 > 2000000000) {
			this.anInt5135 = -30141440;
		} else if (!this.aBoolean793 && this.anInt5135 * 1296968929 > 200000000) {
			this.anInt5135 = 2144469504;
		}
		this.method28806();
	}

	@OriginalMember(owner = "client!te", name = "l", descriptor = "(I)I", line = 41)
	public int method28802() {
		return this.anInt5137 * -807759649;
	}

	@OriginalMember(owner = "client!te", name = "q", descriptor = "()I", line = 41)
	public int method28804() {
		return this.anInt5137 * -807759649;
	}

	@OriginalMember(owner = "client!te", name = "m", descriptor = "()I", line = 41)
	public int method28816() {
		return this.anInt5137 * -807759649;
	}

	@OriginalMember(owner = "client!te", name = "v", descriptor = "(Lclient!vl;)I", line = 45)
	public int method28798(@OriginalArg(0) Class531 arg0) {
		if (Class531.aClass531_1 == arg0 && this.aClass492_1.method29261() && this.aClass492_1.method29269()) {
			@Pc(17) int local17 = this.aClass492_1.method29267();
			if (this.anInt5137 * -807759649 > local17) {
				return local17;
			}
		}
		return this.anInt5137 * -807759649;
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(Lclient!vl;I)I", line = 45)
	public int method28811(@OriginalArg(0) Class531 arg0) {
		if (Class531.aClass531_1 == arg0 && this.aClass492_1.method29261() && this.aClass492_1.method29269()) {
			@Pc(17) int local17 = this.aClass492_1.method29267();
			if (this.anInt5137 * -807759649 > local17) {
				return local17;
			}
		}
		return this.anInt5137 * -807759649;
	}

	@OriginalMember(owner = "client!te", name = "x", descriptor = "(B)I", line = 53)
	public int method28812() {
		return this.anInt5136 * -1966787969;
	}

	@OriginalMember(owner = "client!te", name = "t", descriptor = "()I", line = 53)
	public int method28818() {
		return this.anInt5136 * -1966787969;
	}

	@OriginalMember(owner = "client!te", name = "w", descriptor = "()I", line = 53)
	public int method28821() {
		return this.anInt5136 * -1966787969;
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "(I)V", line = 57)
	public void method28803(@OriginalArg(0) int arg0) {
		this.anInt5136 = arg0 * -828076673;
	}

	@OriginalMember(owner = "client!te", name = "s", descriptor = "(IB)V", line = 57)
	public void method28805(@OriginalArg(0) int arg0) {
		this.anInt5136 = arg0 * -828076673;
	}

	@OriginalMember(owner = "client!te", name = "o", descriptor = "(I)V", line = 57)
	public void method28820(@OriginalArg(0) int arg0) {
		this.anInt5136 = arg0 * -828076673;
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V", line = 57)
	public void method28822(@OriginalArg(0) int arg0) {
		this.anInt5136 = arg0 * -828076673;
	}

	@OriginalMember(owner = "client!te", name = "u", descriptor = "(B)V", line = 61)
	void method28806() {
		if (this.aBoolean793) {
			this.anInt5137 = this.aClass492_1.method29265(this.anInt5135 * 1296968929) * 959261471;
		} else {
			this.anInt5137 = this.aClass492_1.method29264(this.anInt5135 * 1296968929) * 959261471;
		}
	}

	@OriginalMember(owner = "client!te", name = "k", descriptor = "()V", line = 61)
	void method28823() {
		if (this.aBoolean793) {
			this.anInt5137 = this.aClass492_1.method29265(this.anInt5135 * 1296968929) * 959261471;
		} else {
			this.anInt5137 = this.aClass492_1.method29264(this.anInt5135 * 1296968929) * 959261471;
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(Lclient!vs;I)V", line = 85)
	static void method28827(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).aStringArray19[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 624249098;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(II)V", line = 177)
	public static void method28828(@OriginalArg(0) int arg0) {
		if (!Class404.method27638()) {
			return;
		}
		if (Class190.anInt3639 * 1219357829 != arg0) {
			Class190.aLong241 = -8189732161531925055L;
		}
		Class190.anInt3639 = arg0 * -2118833075;
		client.aClass82_1.method21604();
		Class166.method23342(19);
	}

	@OriginalMember(owner = "client!te", name = "mk", descriptor = "(Lclient!vs;I)V", line = 6290)
	static final void method28824(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class3_Sub35_Sub1.method18868(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!te", name = "aaj", descriptor = "(Lclient!vs;B)V", line = 8814)
	static final void method28825(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13 | 0x1 << local23;
	}

	@OriginalMember(owner = "client!te", name = "adj", descriptor = "(Lclient!vs;I)V", line = 9238)
	static final void method28826(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class594 local17 = Class44_Sub3.aClass596_1.method33435(local12);
		@Pc(25) int local25;
		if (local17.aBoolean845) {
			local25 = local17.anInt5514 * -651326929;
		} else if (local17.aBoolean843) {
			local25 = Class44.aClass483_5.anInt5159 * 601732047;
		} else {
			local25 = Class44.aClass483_5.anInt5160 * -867495587;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local25;
	}
}
