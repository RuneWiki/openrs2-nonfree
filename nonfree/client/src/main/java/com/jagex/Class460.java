package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class460 implements Interface6 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "J")
	static final long aLong272 = 4611686018427387904L;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "J")
	static final long aLong273 = 4611686018427387903L;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "J")
	static final long aLong274 = 500L;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "J")
	static final long aLong275 = 1L;

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "Lclient!xn;")
	Class581 aClass581_34 = new Class581(128);

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "[I")
	int[] anIntArray460 = new int[Class429.aClass70_Sub1_Sub1_2.method14714()];

	@OriginalMember(owner = "client!sn", name = "x", descriptor = "[I")
	int[] anIntArray459 = new int[Class429.aClass70_Sub1_Sub1_2.method14714()];

	@OriginalMember(owner = "client!sn", name = "aa", descriptor = "(ZI)I", line = 29)
	public int method28566(@OriginalArg(0) boolean arg0) {
		@Pc(2) long local2 = Class176.method23413();
		for (@Pc(15) Class3_Sub36 local15 = (Class3_Sub36) (arg0 ? this.aClass581_34.method33221() : this.aClass581_34.method33231()); local15 != null; local15 = (Class3_Sub36) this.aClass581_34.method33231()) {
			if ((local15.aLong79 * 5522342608882961519L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong79 * 5522342608882961519L & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) (local15.aLong296 * -1930649055099428229L);
					this.anIntArray459[local42] = this.anIntArray460[local42];
					local15.method33656();
					return local42;
				}
				local15.method33656();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sn", name = "aq", descriptor = "(Z)I", line = 29)
	public int method28569(@OriginalArg(0) boolean arg0) {
		@Pc(2) long local2 = Class176.method23413();
		for (@Pc(15) Class3_Sub36 local15 = (Class3_Sub36) (arg0 ? this.aClass581_34.method33221() : this.aClass581_34.method33231()); local15 != null; local15 = (Class3_Sub36) this.aClass581_34.method33231()) {
			if ((local15.aLong79 * 5522342608882961519L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong79 * 5522342608882961519L & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) (local15.aLong296 * -1930649055099428229L);
					this.anIntArray459[local42] = this.anIntArray460[local42];
					local15.method33656();
					return local42;
				}
				local15.method33656();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sn", name = "as", descriptor = "(Z)I", line = 29)
	public int method28571(@OriginalArg(0) boolean arg0) {
		@Pc(2) long local2 = Class176.method23413();
		for (@Pc(15) Class3_Sub36 local15 = (Class3_Sub36) (arg0 ? this.aClass581_34.method33221() : this.aClass581_34.method33231()); local15 != null; local15 = (Class3_Sub36) this.aClass581_34.method33231()) {
			if ((local15.aLong79 * 5522342608882961519L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong79 * 5522342608882961519L & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) (local15.aLong296 * -1930649055099428229L);
					this.anIntArray459[local42] = this.anIntArray460[local42];
					local15.method33656();
					return local42;
				}
				local15.method33656();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sn", name = "ai", descriptor = "(Z)I", line = 29)
	public int method28572(@OriginalArg(0) boolean arg0) {
		@Pc(2) long local2 = Class176.method23413();
		for (@Pc(15) Class3_Sub36 local15 = (Class3_Sub36) (arg0 ? this.aClass581_34.method33221() : this.aClass581_34.method33231()); local15 != null; local15 = (Class3_Sub36) this.aClass581_34.method33231()) {
			if ((local15.aLong79 * 5522342608882961519L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong79 * 5522342608882961519L & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) (local15.aLong296 * -1930649055099428229L);
					this.anIntArray459[local42] = this.anIntArray460[local42];
					local15.method33656();
					return local42;
				}
				local15.method33656();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sn", name = "ah", descriptor = "(I)V", line = 45)
	public void method28564() {
		for (@Pc(1) int local1 = 0; local1 < Class429.aClass70_Sub1_Sub1_2.method14714(); local1++) {
			@Pc(12) Class11_Sub1 local12 = (Class11_Sub1) Class429.aClass70_Sub1_Sub1_2.method14717(local1);
			if (local12 != null) {
				this.anIntArray460[local1] = 0;
				this.anIntArray459[local1] = 0;
			}
		}
		this.aClass581_34 = new Class581(128);
	}

	@OriginalMember(owner = "client!sn", name = "av", descriptor = "()V", line = 45)
	public void method28570() {
		for (@Pc(1) int local1 = 0; local1 < Class429.aClass70_Sub1_Sub1_2.method14714(); local1++) {
			@Pc(12) Class11_Sub1 local12 = (Class11_Sub1) Class429.aClass70_Sub1_Sub1_2.method14717(local1);
			if (local12 != null) {
				this.anIntArray460[local1] = 0;
				this.anIntArray459[local1] = 0;
			}
		}
		this.aClass581_34 = new Class581(128);
	}

	@OriginalMember(owner = "client!sn", name = "ax", descriptor = "()V", line = 45)
	public void method28573() {
		for (@Pc(1) int local1 = 0; local1 < Class429.aClass70_Sub1_Sub1_2.method14714(); local1++) {
			@Pc(12) Class11_Sub1 local12 = (Class11_Sub1) Class429.aClass70_Sub1_Sub1_2.method14717(local1);
			if (local12 != null) {
				this.anIntArray460[local1] = 0;
				this.anIntArray459[local1] = 0;
			}
		}
		this.aClass581_34 = new Class581(128);
	}

	@OriginalMember(owner = "client!sn", name = "az", descriptor = "()V", line = 45)
	public void method28574() {
		for (@Pc(1) int local1 = 0; local1 < Class429.aClass70_Sub1_Sub1_2.method14714(); local1++) {
			@Pc(12) Class11_Sub1 local12 = (Class11_Sub1) Class429.aClass70_Sub1_Sub1_2.method14717(local1);
			if (local12 != null) {
				this.anIntArray460[local1] = 0;
				this.anIntArray459[local1] = 0;
			}
		}
		this.aClass581_34 = new Class581(128);
	}

	@OriginalMember(owner = "client!sn", name = "al", descriptor = "()V", line = 45)
	public void method28577() {
		for (@Pc(1) int local1 = 0; local1 < Class429.aClass70_Sub1_Sub1_2.method14714(); local1++) {
			@Pc(12) Class11_Sub1 local12 = (Class11_Sub1) Class429.aClass70_Sub1_Sub1_2.method14717(local1);
			if (local12 != null) {
				this.anIntArray460[local1] = 0;
				this.anIntArray459[local1] = 0;
			}
		}
		this.aClass581_34 = new Class581(128);
	}

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "(Lclient!cy;B)I", line = 56)
	@Override
	public int method32385(@OriginalArg(0) Class11 arg0) {
		return this.anIntArray459[arg0.anInt130 * -112096509];
	}

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "(Lclient!cy;)I", line = 56)
	@Override
	public int method32387(@OriginalArg(0) Class11 arg0) {
		return this.anIntArray459[arg0.anInt130 * -112096509];
	}

	@OriginalMember(owner = "client!sn", name = "w", descriptor = "(Lclient!cy;)I", line = 56)
	@Override
	public int method32388(@OriginalArg(0) Class11 arg0) {
		return this.anIntArray459[arg0.anInt130 * -112096509];
	}

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "(Lclient!cy;)I", line = 56)
	@Override
	public int method32386(@OriginalArg(0) Class11 arg0) {
		return this.anIntArray459[arg0.anInt130 * -112096509];
	}

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "(Lclient!cy;I)V", line = 60)
	@Override
	public void method32395(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray459[arg0.anInt130 * -112096509] = arg1;
		@Pc(17) Class3_Sub36 local17 = (Class3_Sub36) this.aClass581_34.method33217((long) (arg0.anInt130 * -112096509));
		if (local17 == null) {
			local17 = new Class3_Sub36(Class176.method23413() + 500L);
			this.aClass581_34.method33241(local17, (long) (arg0.anInt130 * -112096509));
		} else {
			local17.aLong79 = (Class176.method23413() + 500L) * 5570757074813571727L;
		}
	}

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "(Lclient!cy;II)V", line = 60)
	@Override
	public void method32389(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray459[arg0.anInt130 * -112096509] = arg1;
		@Pc(17) Class3_Sub36 local17 = (Class3_Sub36) this.aClass581_34.method33217((long) (arg0.anInt130 * -112096509));
		if (local17 == null) {
			local17 = new Class3_Sub36(Class176.method23413() + 500L);
			this.aClass581_34.method33241(local17, (long) (arg0.anInt130 * -112096509));
		} else {
			local17.aLong79 = (Class176.method23413() + 500L) * 5570757074813571727L;
		}
	}

	@OriginalMember(owner = "client!sn", name = "an", descriptor = "(Lclient!cy;II)V", line = 70)
	public void method28565(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray460[arg0.anInt130 * -112096509] = arg1;
		@Pc(17) Class3_Sub36 local17 = (Class3_Sub36) this.aClass581_34.method33217((long) (arg0.anInt130 * -112096509));
		if (local17 == null) {
			local17 = new Class3_Sub36(4611686018427387905L);
			this.aClass581_34.method33241(local17, (long) (arg0.anInt130 * -112096509));
		} else if (local17.aLong79 * 5522342608882961519L != 4611686018427387905L) {
			local17.aLong79 = (Class176.method23413() + 500L | 0x4000000000000000L) * 5570757074813571727L;
		}
	}

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "(Lclient!ky;I)I", line = 82)
	@Override
	public int method32384(@OriginalArg(0) Class290 arg0) {
		return arg0.method25523(this.anIntArray459[arg0.aClass11_1.anInt130 * -112096509]);
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(Lclient!ky;)I", line = 82)
	@Override
	public int method32383(@OriginalArg(0) Class290 arg0) {
		return arg0.method25523(this.anIntArray459[arg0.aClass11_1.anInt130 * -112096509]);
	}

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "(Lclient!ky;I)V", line = 87)
	@Override
	public void method32407(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method25524(this.anIntArray459[arg0.aClass11_1.anInt130 * -112096509], arg1);
			this.method32389(arg0.aClass11_1, local12);
		} catch (@Pc(20) Exception_Sub5 local20) {
		}
	}

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "(Lclient!ky;I)V", line = 87)
	@Override
	public void method32394(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method25524(this.anIntArray459[arg0.aClass11_1.anInt130 * -112096509], arg1);
			this.method32389(arg0.aClass11_1, local12);
		} catch (@Pc(20) Exception_Sub5 local20) {
		}
	}

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "(Lclient!ky;I)V", line = 87)
	@Override
	public void method32392(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method25524(this.anIntArray459[arg0.aClass11_1.anInt130 * -112096509], arg1);
			this.method32389(arg0.aClass11_1, local12);
		} catch (@Pc(20) Exception_Sub5 local20) {
		}
	}

	@OriginalMember(owner = "client!sn", name = "x", descriptor = "(Lclient!ky;II)V", line = 87)
	@Override
	public void method32411(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method25524(this.anIntArray459[arg0.aClass11_1.anInt130 * -112096509], arg1);
			this.method32389(arg0.aClass11_1, local12);
		} catch (@Pc(20) Exception_Sub5 local20) {
		}
	}

	@OriginalMember(owner = "client!sn", name = "ab", descriptor = "(Lclient!ky;I)V", line = 95)
	public void method28567(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method25524(this.anIntArray460[arg0.aClass11_1.anInt130 * -112096509], arg1);
			this.method28565(arg0.aClass11_1, local12);
		} catch (@Pc(20) Exception_Sub5 local20) {
		}
	}

	@OriginalMember(owner = "client!sn", name = "aj", descriptor = "(Lclient!ky;II)V", line = 95)
	public void method28568(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method25524(this.anIntArray460[arg0.aClass11_1.anInt130 * -112096509], arg1);
			this.method28565(arg0.aClass11_1, local12);
		} catch (@Pc(20) Exception_Sub5 local20) {
		}
	}

	@OriginalMember(owner = "client!sn", name = "ao", descriptor = "(Lclient!ky;I)V", line = 95)
	public void method28575(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method25524(this.anIntArray460[arg0.aClass11_1.anInt130 * -112096509], arg1);
			this.method28565(arg0.aClass11_1, local12);
		} catch (@Pc(20) Exception_Sub5 local20) {
		}
	}

	@OriginalMember(owner = "client!sn", name = "ap", descriptor = "(Lclient!ky;I)V", line = 95)
	public void method28576(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method25524(this.anIntArray460[arg0.aClass11_1.anInt130 * -112096509], arg1);
			this.method28565(arg0.aClass11_1, local12);
		} catch (@Pc(20) Exception_Sub5 local20) {
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Lclient!cy;)J", line = 102)
	@Override
	public long method32396(@OriginalArg(0) Class11 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!cy;I)J", line = 102)
	@Override
	public long method32393(@OriginalArg(0) Class11 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "(Lclient!cy;J)V", line = 106)
	@Override
	public void method32401(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(Lclient!cy;J)V", line = 106)
	@Override
	public void method32397(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "(Lclient!cy;J)V", line = 106)
	@Override
	public void method32398(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "(Lclient!cy;J)V", line = 106)
	@Override
	public void method32399(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "(Lclient!cy;I)Ljava/lang/Object;", line = 110)
	@Override
	public Object method32408(@OriginalArg(0) Class11 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 110)
	@Override
	public Object method32400(@OriginalArg(0) Class11 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 110)
	@Override
	public Object method32405(@OriginalArg(0) Class11 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 110)
	@Override
	public Object method32406(@OriginalArg(0) Class11 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 110)
	@Override
	public Object method32402(@OriginalArg(0) Class11 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 110)
	@Override
	public Object method32403(@OriginalArg(0) Class11 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 110)
	@Override
	public Object method32404(@OriginalArg(0) Class11 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "(Lclient!cy;Ljava/lang/Object;I)V", line = 114)
	@Override
	public void method32391(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "at", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 114)
	@Override
	public void method32409(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "af", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 114)
	@Override
	public void method32410(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "ak", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 114)
	@Override
	public void method32390(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(Lclient!de;IILclient!fo;Lclient!ch;III)V", line = 508)
	static void method28581(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3163 * 1758488217; local1++) {
			@Pc(14) Class3_Sub29 local14 = (Class3_Sub29) client.aClass581_21.method33217((long) client.anIntArray303[local1]);
			if (local14 != null) {
				@Pc(21) Class26_Sub1_Sub1_Sub1_Sub1 local21 = (Class26_Sub1_Sub1_Sub1_Sub1) local14.anObject2;
				if (local21.method15501() && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 == local21.aByte101) {
					@Pc(33) Class571 local33 = local21.aClass571_1;
					if (local33 != null && local33.anIntArray508 != null) {
						local33 = local33.method33044(Class424.aClass165_1, Class424.aClass165_1);
					}
					if (local33 != null && local33.aBoolean835 && local33.aBoolean832) {
						@Pc(57) Class320 local57 = local21.method21431().aClass320_61;
						@Pc(67) int local67 = (int) local57.aFloat259 / 128 - arg1 / 128;
						@Pc(77) int local77 = (int) local57.aFloat261 / 128 - arg2 / 128;
						if (local33.anInt5411 * 1466869465 == -1) {
							Class154.method23164(arg3, arg4, arg5, arg6, local67, local77, Class486.aClass6Array14[1]);
						} else {
							Class60_Sub24.method13783(arg0, arg4, arg3, arg5, arg6, local67, local77, local33.anInt5411 * 1466869465);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "bx", descriptor = "(FFFFFFIB)F", line = 1930)
	static float method28582(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		@Pc(1) float local1 = 0.0F;
		@Pc(5) float local5 = arg3 - arg0;
		@Pc(9) float local9 = arg4 - arg1;
		@Pc(13) float local13 = arg5 - arg2;
		@Pc(15) float local15 = 0.0F;
		@Pc(17) float local17 = 0.0F;
		@Pc(19) float local19 = 0.0F;
		@Pc(23) Class438 local23 = client.aClass370_1.method26950();
		while (local1 < 1.1F) {
			@Pc(33) float local33 = arg0 + local1 * local5;
			@Pc(39) float local39 = arg1 + local1 * local9;
			@Pc(45) float local45 = arg2 + local13 * local1;
			@Pc(50) int local50 = (int) local33 >> 9;
			@Pc(55) int local55 = (int) local45 >> 9;
			if (local50 > 0 && local55 > 0 && local50 < client.aClass370_1.method26943() && local55 < client.aClass370_1.method27062()) {
				@Pc(72) int local72 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101;
				if (local72 < 3 && (client.aClass370_1.method27075().aByteArrayArrayArray12[1][local50][local55] & 0x2) != 0) {
					local72++;
				}
				@Pc(100) int local100 = local23.aClass17Array1[local72].method3583((int) local33, (int) local45);
				if ((float) local100 < local39) {
					if (arg6 >= 2) {
						return local1 - 0.1F + method28582(local15, local17, local19, local33, local39, local45, arg6 - 1) * 0.1F;
					}
					return local1;
				}
			}
			local15 = local33;
			local17 = local39;
			local19 = local45;
			local1 += 0.1F;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!sn", name = "mr", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;S)V", line = 6402)
	static final void method28580(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		@Pc(18) int[] local18 = Class201.method24159(local13, arg2);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray23 = Class484.method29109(local13, arg2);
		arg0.anIntArray367 = local18;
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!sn", name = "ql", descriptor = "(Lclient!fo;Lclient!vs;B)V", line = 7140)
	static final void method28578(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(12) int local12 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381];
		@Pc(27) int local27 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381] - 1;
		if (arg0.anInt3513 * -2138884745 != 2) {
			throw new RuntimeException("");
		}
		@Pc(46) Class571 local46 = Class498.aClass579_1.method33185(arg0.anInt3514 * -472903775);
		if (arg0.aClass584_2 == null) {
			arg0.aClass584_2 = new Class584(local46, false);
		}
		arg0.aClass584_2.aLong293 = Class468.method28748() * 3125814776544842647L;
		if (local27 < 0 || local27 >= local46.anIntArray506.length) {
			throw new RuntimeException("");
		}
		arg0.aClass584_2.anIntArray512[local27] = local12;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!sn", name = "atc", descriptor = "(Lclient!vs;B)V", line = 12482)
	static final void method28579(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub10_1.method14599(local12);
	}
}
