package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ey")
public final class Class163 {

	@OriginalMember(owner = "client!ey", name = "p", descriptor = "I")
	static final int anInt3448 = 25;

	@OriginalMember(owner = "client!ey", name = "s", descriptor = "[I")
	int[] anIntArray350;

	@OriginalMember(owner = "client!ey", name = "l", descriptor = "Z")
	public boolean aBoolean623 = false;

	@OriginalMember(owner = "client!ey", name = "h", descriptor = "Lclient!akj;")
	Class26_Sub1_Sub1_Sub1_Sub1 aClass26_Sub1_Sub1_Sub1_Sub1_2 = null;

	@OriginalMember(owner = "client!ey", name = "x", descriptor = "Lclient!akp;")
	Class26_Sub1_Sub1_Sub1_Sub2 aClass26_Sub1_Sub1_Sub1_Sub2_2 = null;

	@OriginalMember(owner = "client!ey", name = "a", descriptor = "I")
	final int anInt3449;

	@OriginalMember(owner = "client!ey", name = "g", descriptor = "I")
	public final int anInt3447;

	@OriginalMember(owner = "client!ey", name = "<init>", descriptor = "(Lclient!ahb;I)V", line = 21)
	Class163(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3449 = arg1 * -1763165357;
		@Pc(19) int local19 = arg0.method20269();
		switch(local19) {
			case 0:
				this.anInt3447 = arg0.method20375() * -2110847219;
				break;
			case 1:
				this.anInt3447 = 2110847219;
				break;
			default:
				this.anInt3447 = 2110847219;
		}
		arg0.method20283();
	}

	@OriginalMember(owner = "client!ey", name = "p", descriptor = "(B)I", line = 21)
	static int method23298() {
		return (Class196.anInt3685 += 572433983) * -2017048129 - 1;
	}

	@OriginalMember(owner = "client!ey", name = "p", descriptor = "(IIIII)V", line = 39)
	void method23279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean623) {
			this.aBoolean623 = true;
			if (this.anInt3447 * 1116282821 >= 0) {
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2 = new Class26_Sub1_Sub1_Sub1_Sub1(client.aClass370_1.method26950(), 25);
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2355 = this.anInt3449 * 1239995567;
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2378 = client.anInt3034 * -427149901;
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method15495(Class498.aClass579_1.method33185(this.anInt3447 * 1116282821));
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16644(this.aClass26_Sub1_Sub1_Sub1_Sub1_2.aClass571_1.anInt5389 * 2130228951);
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2358 = (this.aClass26_Sub1_Sub1_Sub1_Sub1_2.aClass571_1.anInt5393 * 361716413 << 3) * -493317635;
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2360 = ((Class131.anInt3326 += -1402199347) * -1329292795 - 1) * -14577409;
			} else {
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2 = new Class26_Sub1_Sub1_Sub1_Sub2(client.aClass370_1.method26950(), 25);
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16763(Class223.aClass3_Sub41_17);
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.anInt2355 = this.anInt3449 * 1239995567;
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.anInt2378 = client.anInt3034 * -427149901;
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.anInt2360 = ((Class131.anInt3326 += -1402199347) * -1329292795 - 1) * -14577409;
			}
		}
		if (this.anInt3447 * 1116282821 >= 0) {
			this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method15509(arg2, arg0, arg1, true, this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16630());
			this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16634(arg3, true);
		} else {
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte101 = this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte102 = (byte) arg2;
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16738(arg0, arg1);
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16634(arg3, true);
		}
	}

	@OriginalMember(owner = "client!ey", name = "x", descriptor = "(IIII)V", line = 39)
	void method23280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean623) {
			this.aBoolean623 = true;
			if (this.anInt3447 * 1116282821 >= 0) {
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2 = new Class26_Sub1_Sub1_Sub1_Sub1(client.aClass370_1.method26950(), 25);
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2355 = this.anInt3449 * 1239995567;
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2378 = client.anInt3034 * -427149901;
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method15495(Class498.aClass579_1.method33185(this.anInt3447 * 1116282821));
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16644(this.aClass26_Sub1_Sub1_Sub1_Sub1_2.aClass571_1.anInt5389 * 2130228951);
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2358 = (this.aClass26_Sub1_Sub1_Sub1_Sub1_2.aClass571_1.anInt5393 * 361716413 << 3) * -493317635;
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2360 = ((Class131.anInt3326 += -1402199347) * -1329292795 - 1) * -14577409;
			} else {
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2 = new Class26_Sub1_Sub1_Sub1_Sub2(client.aClass370_1.method26950(), 25);
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16763(Class223.aClass3_Sub41_17);
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.anInt2355 = this.anInt3449 * 1239995567;
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.anInt2378 = client.anInt3034 * -427149901;
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.anInt2360 = ((Class131.anInt3326 += -1402199347) * -1329292795 - 1) * -14577409;
			}
		}
		if (this.anInt3447 * 1116282821 >= 0) {
			this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method15509(arg2, arg0, arg1, true, this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16630());
			this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16634(arg3, true);
		} else {
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte101 = this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte102 = (byte) arg2;
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16738(arg0, arg1);
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16634(arg3, true);
		}
	}

	@OriginalMember(owner = "client!ey", name = "s", descriptor = "(IIII)V", line = 39)
	void method23281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean623) {
			this.aBoolean623 = true;
			if (this.anInt3447 * 1116282821 >= 0) {
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2 = new Class26_Sub1_Sub1_Sub1_Sub1(client.aClass370_1.method26950(), 25);
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2355 = this.anInt3449 * 1239995567;
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2378 = client.anInt3034 * -427149901;
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method15495(Class498.aClass579_1.method33185(this.anInt3447 * 1116282821));
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16644(this.aClass26_Sub1_Sub1_Sub1_Sub1_2.aClass571_1.anInt5389 * 2130228951);
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2358 = (this.aClass26_Sub1_Sub1_Sub1_Sub1_2.aClass571_1.anInt5393 * 361716413 << 3) * -493317635;
				this.aClass26_Sub1_Sub1_Sub1_Sub1_2.anInt2360 = ((Class131.anInt3326 += -1402199347) * -1329292795 - 1) * -14577409;
			} else {
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2 = new Class26_Sub1_Sub1_Sub1_Sub2(client.aClass370_1.method26950(), 25);
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16763(Class223.aClass3_Sub41_17);
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.anInt2355 = this.anInt3449 * 1239995567;
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.anInt2378 = client.anInt3034 * -427149901;
				this.aClass26_Sub1_Sub1_Sub1_Sub2_2.anInt2360 = ((Class131.anInt3326 += -1402199347) * -1329292795 - 1) * -14577409;
			}
		}
		if (this.anInt3447 * 1116282821 >= 0) {
			this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method15509(arg2, arg0, arg1, true, this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16630());
			this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16634(arg3, true);
		} else {
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte101 = this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte102 = (byte) arg2;
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16738(arg0, arg1);
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16634(arg3, true);
		}
	}

	@OriginalMember(owner = "client!ey", name = "y", descriptor = "()V", line = 70)
	void method23274() {
		this.aClass26_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass26_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean623 = false;
	}

	@OriginalMember(owner = "client!ey", name = "a", descriptor = "(I)V", line = 70)
	void method23276() {
		this.aClass26_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass26_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean623 = false;
	}

	@OriginalMember(owner = "client!ey", name = "u", descriptor = "()V", line = 70)
	void method23282() {
		this.aClass26_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass26_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean623 = false;
	}

	@OriginalMember(owner = "client!ey", name = "b", descriptor = "()V", line = 70)
	void method23284() {
		this.aClass26_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass26_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean623 = false;
	}

	@OriginalMember(owner = "client!ey", name = "c", descriptor = "(III)V", line = 76)
	void method23275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass26_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte101 = this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte102 = (byte) arg0;
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16738(arg1, arg2);
		} else {
			this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method15509(arg0, arg1, arg2, true, this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16630());
		}
	}

	@OriginalMember(owner = "client!ey", name = "g", descriptor = "(IIII)V", line = 76)
	void method23277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass26_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte101 = this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte102 = (byte) arg0;
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16738(arg1, arg2);
		} else {
			this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method15509(arg0, arg1, arg2, true, this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16630());
		}
	}

	@OriginalMember(owner = "client!ey", name = "z", descriptor = "(III)V", line = 76)
	void method23283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass26_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte101 = this.aClass26_Sub1_Sub1_Sub1_Sub2_2.aByte102 = (byte) arg0;
			this.aClass26_Sub1_Sub1_Sub1_Sub2_2.method16738(arg1, arg2);
		} else {
			this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method15509(arg0, arg1, arg2, true, this.aClass26_Sub1_Sub1_Sub1_Sub1_2.method16630());
		}
	}

	@OriginalMember(owner = "client!ey", name = "l", descriptor = "(B)Lclient!act;", line = 84)
	public Class26_Sub1_Sub1_Sub1 method23278() {
		return this.aClass26_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass26_Sub1_Sub1_Sub1_Sub2_2 : this.aClass26_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ey", name = "r", descriptor = "()Lclient!act;", line = 84)
	public Class26_Sub1_Sub1_Sub1 method23286() {
		return this.aClass26_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass26_Sub1_Sub1_Sub1_Sub2_2 : this.aClass26_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ey", name = "j", descriptor = "()Lclient!act;", line = 84)
	public Class26_Sub1_Sub1_Sub1 method23287() {
		return this.aClass26_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass26_Sub1_Sub1_Sub1_Sub2_2 : this.aClass26_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ey", name = "n", descriptor = "()Lclient!act;", line = 84)
	public Class26_Sub1_Sub1_Sub1 method23288() {
		return this.aClass26_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass26_Sub1_Sub1_Sub1_Sub2_2 : this.aClass26_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ey", name = "e", descriptor = "()Lclient!act;", line = 84)
	public Class26_Sub1_Sub1_Sub1 method23289() {
		return this.aClass26_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass26_Sub1_Sub1_Sub1_Sub2_2 : this.aClass26_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ey", name = "h", descriptor = "(I)Z", line = 89)
	boolean method23285() {
		if (this.anInt3447 * 1116282821 < 0) {
			return true;
		}
		@Pc(12) Class571 local12 = Class498.aClass579_1.method33185(this.anInt3447 * 1116282821);
		@Pc(16) boolean local16 = local12.method33042();
		if (this.anIntArray350 == null) {
			@Pc(27) Class445 local27 = Class399.aClass428_1.method27917(local12.anInt5395 * 906051241);
			this.anIntArray350 = local27.method28325();
		}
		@Pc(35) int[] local35 = this.anIntArray350;
		for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
			@Pc(45) int local45 = local35[local37];
			local16 &= Class110.aClass436_1.method27999(local45).method28236();
		}
		return local16;
	}

	@OriginalMember(owner = "client!ey", name = "d", descriptor = "()Z", line = 89)
	boolean method23290() {
		if (this.anInt3447 * 1116282821 < 0) {
			return true;
		}
		@Pc(12) Class571 local12 = Class498.aClass579_1.method33185(this.anInt3447 * 1116282821);
		@Pc(16) boolean local16 = local12.method33042();
		if (this.anIntArray350 == null) {
			@Pc(27) Class445 local27 = Class399.aClass428_1.method27917(local12.anInt5395 * 906051241);
			this.anIntArray350 = local27.method28325();
		}
		@Pc(35) int[] local35 = this.anIntArray350;
		for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
			@Pc(45) int local45 = local35[local37];
			local16 &= Class110.aClass436_1.method27999(local45).method28236();
		}
		return local16;
	}

	@OriginalMember(owner = "client!ey", name = "q", descriptor = "()Z", line = 89)
	boolean method23291() {
		if (this.anInt3447 * 1116282821 < 0) {
			return true;
		}
		@Pc(12) Class571 local12 = Class498.aClass579_1.method33185(this.anInt3447 * 1116282821);
		@Pc(16) boolean local16 = local12.method33042();
		if (this.anIntArray350 == null) {
			@Pc(27) Class445 local27 = Class399.aClass428_1.method27917(local12.anInt5395 * 906051241);
			this.anIntArray350 = local27.method28325();
		}
		@Pc(35) int[] local35 = this.anIntArray350;
		for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
			@Pc(45) int local45 = local35[local37];
			local16 &= Class110.aClass436_1.method27999(local45).method28236();
		}
		return local16;
	}

	@OriginalMember(owner = "client!ey", name = "y", descriptor = "(II)V", line = 160)
	public static void method23296(@OriginalArg(0) int arg0) {
		if (!Class404.method27638()) {
			return;
		}
		if (Class190.anInt3639 * 1219357829 != arg0) {
			Class190.aLong241 = -8189732161531925055L;
		}
		Class190.anInt3639 = arg0 * -2118833075;
		Class166.method23342(15);
	}

	@OriginalMember(owner = "client!ey", name = "x", descriptor = "(Lclient!and;II)Z", line = 379)
	static boolean method23299(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.method19825(2);
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(132) int local132;
		if (local4 == 0) {
			if (arg0.method19825(1) != 0) {
				method23299(arg0, arg1);
			}
			local22 = arg0.method19825(6);
			local27 = arg0.method19825(6);
			@Pc(37) boolean local37 = arg0.method19825(1) == 1;
			if (local37) {
				Class52.anIntArray166[(Class52.anInt1129 += -415617507) * -1804860363 - 1] = arg1;
			}
			if (client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(63) Class85 local63 = Class52.aClass85Array1[arg1];
			@Pc(74) Class26_Sub1_Sub1_Sub1_Sub2 local74 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class26_Sub1_Sub1_Sub1_Sub2(client.aClass370_1.method26950());
			local74.anInt2355 = arg1 * -400995907;
			if (Class52.aClass3_Sub41Array1[arg1] != null) {
				local74.method16763(Class52.aClass3_Sub41Array1[arg1]);
			}
			if (Class52.aClass3_Sub41Array2[arg1] != null) {
				local74.method16731(Class52.aClass3_Sub41Array2[arg1]);
			}
			local74.method16634(local63.anInt2924 * 166218557, true);
			local74.anInt2364 = local63.anInt2925 * 1065719817;
			local118 = local63.anInt2926 * 1438607843;
			local122 = local118 >> 28;
			local128 = local118 >> 14 & 0xFF;
			local132 = local118 & 0xFF;
			@Pc(136) Class464 local136 = client.aClass370_1.method26942();
			@Pc(147) int local147 = local22 + (local128 << 6) - local136.anInt5071 * -1567811631;
			@Pc(158) int local158 = (local132 << 6) + local27 - local136.anInt5073 * 1360175441;
			local74.aBoolean420 = local63.aBoolean533;
			local74.aBoolean419 = local63.aBoolean532;
			local74.aByteArray41[0] = Class52.aByteArray20[arg1];
			local74.aByte101 = local74.aByte102 = (byte) local122;
			if (client.aClass370_1.method27075().method26504(local147, local158)) {
				local74.aByte102++;
			}
			local74.method16738(local147, local158);
			Class52.aClass85Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local22 = arg0.method19825(2);
			local27 = Class52.aClass85Array1[arg1].anInt2926 * 1438607843;
			Class52.aClass85Array1[arg1].anInt2926 = ((((local27 >> 28) + local22 & 0x3) << 28) + (local27 & 0xFFFFFFF)) * 1407132619;
			return false;
		} else {
			@Pc(260) int local260;
			@Pc(267) int local267;
			@Pc(290) int local290;
			if (local4 != 2) {
				local22 = arg0.method19825(20);
				local27 = local22 >> 18 & 0x3;
				local260 = local22 >> 16 & 0x3;
				local267 = local22 >> 8 & 0xFF;
				local290 = local22 & 0xFF;
				local118 = Class52.aClass85Array1[arg1].anInt2926 * 1438607843;
				Class52.aByteArray20[arg1] = (byte) (local27 - 1);
				if (!Class52.$assertionsDisabled && (Class52.aByteArray20[arg1] < 0 || Class52.aByteArray20[arg1] > 3)) {
					throw new AssertionError();
				}
				local122 = (local118 >> 28) + local260 & 0x3;
				local128 = (local118 >> 14) + local267 & 0xFF;
				local132 = local290 + local118 & 0xFF;
				Class356.method26649(Class72.method14644(), local27 - 1);
				Class52.aClass85Array1[arg1].anInt2926 = ((local122 << 28) + (local128 << 14) + local132) * 1407132619;
				return false;
			}
			local22 = arg0.method19825(5);
			local27 = local22 >> 3 & 0x3;
			local260 = local22 & 0x7;
			local267 = Class52.aClass85Array1[arg1].anInt2926 * 1438607843;
			if (!Class52.$assertionsDisabled && (Class52.aByteArray20[arg1] < 0 || Class52.aByteArray20[arg1] > 3)) {
				throw new AssertionError();
			}
			local290 = local27 + (local267 >> 28) & 0x3;
			local118 = local267 >> 14 & 0xFF;
			local122 = local267 & 0xFF;
			if (local260 == 0) {
				local118--;
				local122--;
			}
			if (local260 == 1) {
				local122--;
			}
			if (local260 == 2) {
				local118++;
				local122--;
			}
			if (local260 == 3) {
				local118--;
			}
			if (local260 == 4) {
				local118++;
			}
			if (local260 == 5) {
				local118--;
				local122++;
			}
			if (local260 == 6) {
				local122++;
			}
			if (local260 == 7) {
				local118++;
				local122++;
			}
			Class356.method26649(Class72.method14644(), Class52.aByteArray20[arg1]);
			Class52.aClass85Array1[arg1].anInt2926 = ((local290 << 28) + (local118 << 14) + local122) * 1407132619;
			return false;
		}
	}

	@OriginalMember(owner = "client!ey", name = "db", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4595)
	static final void method23292(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean632 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!ey", name = "mp", descriptor = "(Lclient!vs;I)V", line = 6367)
	static final void method23293(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class186.method23924(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ey", name = "xf", descriptor = "(Lclient!vs;B)V", line = 8393)
	static final void method23294(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.aString151 == null || local12 >= Class21_Sub1.anInt288 * 906110417) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class43_Sub2.aClass79Array1[local12].anInt2911 * -1097692209;
		}
	}

	@OriginalMember(owner = "client!ey", name = "ka", descriptor = "(Lclient!fo;III)V", line = 11039)
	public static final void method23297(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (client.aClass178_13 != null || Class250.aBoolean688 || (arg0 == null || !Class121.method22826(arg0))) {
			return;
		}
		client.aClass178_13 = arg0;
		client.aClass178_11 = Class13_Sub16.method6687(arg0);
		client.anInt3043 = arg1 * 1945472475;
		client.anInt3132 = arg2 * -861860273;
		Class3_Sub39.anInt1355 = 0;
		client.aBoolean604 = false;
	}

	@OriginalMember(owner = "client!ey", name = "aqc", descriptor = "(Lclient!vs;I)V", line = 11943)
	static final void method23295(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (Class178.aClass186Array1[local13] == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
			return;
		}
		@Pc(51) String local51 = Class178.aClass186Array1[local13].aClass178Array8[local23].aString167;
		if (local51 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local51;
		}
	}
}
