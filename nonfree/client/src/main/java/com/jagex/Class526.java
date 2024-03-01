package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public class Class526 implements Interface6 {

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "Lclient!iu;")
	Class245 aClass245_3;

	@OriginalMember(owner = "client!vg", name = "gi", descriptor = "(Lclient!vs;I)V", line = 5287)
	static final void method32412(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class505.method29518(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "il", descriptor = "(Lclient!vs;I)V", line = 5529)
	static final void method32413(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class186.method23927(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "sf", descriptor = "(Lclient!vs;B)V", line = 7374)
	static final void method32414(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(25) Class169 local25 = local16.method23435(Class613.aClass21_13);
		if (local25 != null) {
			local18 = local25.anInt3457 * -165923349;
			local20 = local25.anInt3456 * 1164759253;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local20;
	}

	@OriginalMember(owner = "client!vg", name = "yc", descriptor = "(Lclient!vs;B)V", line = 8507)
	static final void method32415(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.aString151 == null || local12 >= Class21_Sub1.anInt288 * 906110417) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class43_Sub2.aClass79Array1[local12].aString131;
		}
	}

	@OriginalMember(owner = "client!vg", name = "kw", descriptor = "(Lclient!av;Lclient!fo;IIII)V", line = 9625)
	static void method32416(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class3_Sub23 local8;
		if (arg2 == 1) {
			local8 = Class269.method25284(Class311.aClass311_84, arg0.aClass577_2);
			Class401.method27607(local8, arg3, arg4, arg1.anInt3559 * 1976441867);
			arg0.method21601(local8);
		}
		if (arg2 == 2) {
			local8 = Class269.method25284(Class311.aClass311_86, arg0.aClass577_2);
			Class401.method27607(local8, arg3, arg4, arg1.anInt3559 * 1976441867);
			arg0.method21601(local8);
		}
		if (arg2 == 3) {
			local8 = Class269.method25284(Class311.aClass311_87, arg0.aClass577_2);
			Class401.method27607(local8, arg3, arg4, arg1.anInt3559 * 1976441867);
			arg0.method21601(local8);
		}
		if (arg2 == 4) {
			local8 = Class269.method25284(Class311.aClass311_12, arg0.aClass577_2);
			Class401.method27607(local8, arg3, arg4, arg1.anInt3559 * 1976441867);
			arg0.method21601(local8);
		}
		if (arg2 == 5) {
			local8 = Class269.method25284(Class311.aClass311_20, arg0.aClass577_2);
			Class401.method27607(local8, arg3, arg4, arg1.anInt3559 * 1976441867);
			arg0.method21601(local8);
		}
		if (arg2 == 6) {
			local8 = Class269.method25284(Class311.aClass311_33, arg0.aClass577_2);
			Class401.method27607(local8, arg3, arg4, arg1.anInt3559 * 1976441867);
			arg0.method21601(local8);
		}
		if (arg2 == 7) {
			local8 = Class269.method25284(Class311.aClass311_94, arg0.aClass577_2);
			Class401.method27607(local8, arg3, arg4, arg1.anInt3559 * 1976441867);
			arg0.method21601(local8);
		}
		if (arg2 == 8) {
			local8 = Class269.method25284(Class311.aClass311_54, arg0.aClass577_2);
			Class401.method27607(local8, arg3, arg4, arg1.anInt3559 * 1976441867);
			arg0.method21601(local8);
		}
		if (arg2 == 9) {
			local8 = Class269.method25284(Class311.aClass311_74, arg0.aClass577_2);
			Class401.method27607(local8, arg3, arg4, arg1.anInt3559 * 1976441867);
			arg0.method21601(local8);
		}
		if (arg2 == 10) {
			local8 = Class269.method25284(Class311.aClass311_58, arg0.aClass577_2);
			Class401.method27607(local8, arg3, arg4, arg1.anInt3559 * 1976441867);
			arg0.method21601(local8);
		}
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!iu;)V", line = 12816)
	Class526(@OriginalArg(0) Class245 arg0) {
		this.aClass245_3 = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "(Lclient!cy;B)I", line = 12821)
	@Override
	public int method32385(@OriginalArg(0) Class11 arg0) {
		@Pc(15) Integer local15 = this.aClass245_3.method24827(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
		return local15 == null ? (Integer) arg0.method1202() : local15;
	}

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "(Lclient!cy;)I", line = 12821)
	@Override
	public int method32386(@OriginalArg(0) Class11 arg0) {
		@Pc(15) Integer local15 = this.aClass245_3.method24827(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
		return local15 == null ? (Integer) arg0.method1202() : local15;
	}

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "(Lclient!cy;)I", line = 12821)
	@Override
	public int method32388(@OriginalArg(0) Class11 arg0) {
		@Pc(15) Integer local15 = this.aClass245_3.method24827(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
		return local15 == null ? (Integer) arg0.method1202() : local15;
	}

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "(Lclient!cy;)I", line = 12821)
	@Override
	public int method32387(@OriginalArg(0) Class11 arg0) {
		@Pc(15) Integer local15 = this.aClass245_3.method24827(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
		return local15 == null ? (Integer) arg0.method1202() : local15;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!cy;I)J", line = 12827)
	@Override
	public long method32393(@OriginalArg(0) Class11 arg0) {
		@Pc(15) Long local15 = this.aClass245_3.method24807(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
		return local15 == null ? (Long) arg0.method1202() : local15;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(Lclient!cy;)J", line = 12827)
	@Override
	public long method32396(@OriginalArg(0) Class11 arg0) {
		@Pc(15) Long local15 = this.aClass245_3.method24807(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
		return local15 == null ? (Long) arg0.method1202() : local15;
	}

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "(Lclient!cy;I)Ljava/lang/Object;", line = 12833)
	@Override
	public Object method32408(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass339_3 != Class339.aClass339_89) {
			throw new IllegalArgumentException("");
		}
		return this.aClass245_3.method24808(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 12833)
	@Override
	public Object method32406(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass339_3 != Class339.aClass339_89) {
			throw new IllegalArgumentException("");
		}
		return this.aClass245_3.method24808(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 12833)
	@Override
	public Object method32400(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass339_3 != Class339.aClass339_89) {
			throw new IllegalArgumentException("");
		}
		return this.aClass245_3.method24808(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 12833)
	@Override
	public Object method32405(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass339_3 != Class339.aClass339_89) {
			throw new IllegalArgumentException("");
		}
		return this.aClass245_3.method24808(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 12833)
	@Override
	public Object method32402(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass339_3 != Class339.aClass339_89) {
			throw new IllegalArgumentException("");
		}
		return this.aClass245_3.method24808(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 12833)
	@Override
	public Object method32403(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass339_3 != Class339.aClass339_89) {
			throw new IllegalArgumentException("");
		}
		return this.aClass245_3.method24808(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 12833)
	@Override
	public Object method32404(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass339_3 != Class339.aClass339_89) {
			throw new IllegalArgumentException("");
		}
		return this.aClass245_3.method24808(client.aClass543_2.anInt5326 * 1050721143 << 16 | arg0.anInt130 * -112096509);
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(Lclient!ky;)I", line = 12838)
	@Override
	public int method32383(@OriginalArg(0) Class290 arg0) {
		return arg0.method25523(this.method32385(arg0.aClass11_1));
	}

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "(Lclient!ky;I)I", line = 12838)
	@Override
	public int method32384(@OriginalArg(0) Class290 arg0) {
		return arg0.method25523(this.method32385(arg0.aClass11_1));
	}

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "(Lclient!cy;I)V", line = 12842)
	@Override
	public void method32395(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "(Lclient!cy;II)V", line = 12842)
	@Override
	public void method32389(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "(Lclient!cy;J)V", line = 12846)
	@Override
	public void method32401(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "(Lclient!cy;J)V", line = 12846)
	@Override
	public void method32398(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(Lclient!cy;J)V", line = 12846)
	@Override
	public void method32397(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "(Lclient!cy;J)V", line = 12846)
	@Override
	public void method32399(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "at", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 12850)
	@Override
	public void method32409(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "(Lclient!cy;Ljava/lang/Object;I)V", line = 12850)
	@Override
	public void method32391(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "af", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 12850)
	@Override
	public void method32410(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "ak", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 12850)
	@Override
	public void method32390(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "(Lclient!ky;II)V", line = 12854)
	@Override
	public void method32411(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "(Lclient!ky;I)V", line = 12854)
	@Override
	public void method32394(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "(Lclient!ky;I)V", line = 12854)
	@Override
	public void method32407(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "(Lclient!ky;I)V", line = 12854)
	@Override
	public void method32392(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}
}
