package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
	int anInt797;

	@OriginalMember(owner = "client!afa", name = "v", descriptor = "Ljava/lang/String;")
	final String aString25;

	@OriginalMember(owner = "client!afa", name = "l", descriptor = "I")
	final int anInt796;

	@OriginalMember(owner = "client!afa", name = "y", descriptor = "I")
	final int anInt798;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!akv;)V", line = 12)
	Class96_Sub1(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt797 = arg0.method22483() * -1755926421;
		this.aString25 = arg0.method22523();
		this.anInt796 = arg0.method22500() * 137382483;
		this.anInt798 = arg0.method22483() * -1797579591;
	}

	@OriginalMember(owner = "client!afa", name = "w", descriptor = "()V", line = 20)
	@Override
	public void method19913() {
		Class589.aClass222Array1[this.anInt797 * 2073328707].method25755().method21114(this.aString25, this.anInt796 * -2077324837, 0, this.anInt798 * -1908135543);
	}

	@OriginalMember(owner = "client!afa", name = "y", descriptor = "()V", line = 20)
	@Override
	public void method19912() {
		Class589.aClass222Array1[this.anInt797 * 2073328707].method25755().method21114(this.aString25, this.anInt796 * -2077324837, 0, this.anInt798 * -1908135543);
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)V", line = 20)
	@Override
	public void method19911() {
		Class589.aClass222Array1[this.anInt797 * 2073328707].method25755().method21114(this.aString25, this.anInt796 * -2077324837, 0, this.anInt798 * -1908135543);
	}

	@OriginalMember(owner = "client!afa", name = "s", descriptor = "(IIIIB)V", line = 311)
	public static void method7072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub16 local4;
		for (local4 = (Class77_Sub16) Class77_Sub16.aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) Class77_Sub16.aClass695_20.method36406()) {
			Class273.method26541(local4, arg0, arg1, arg2, arg3);
		}
		@Pc(29) byte local29;
		@Pc(34) Class570 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(219) Class447 local219;
		for (local4 = (Class77_Sub16) Class77_Sub16.aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) Class77_Sub16.aClass695_21.method36406()) {
			local29 = 1;
			local34 = local4.aClass104_Sub1_Sub1_Sub1_Sub1_1.method21105();
			local40 = local4.aClass104_Sub1_Sub1_Sub1_Sub1_1.aClass151_Sub1_3.method23399();
			if (local40 == -1 || local4.aClass104_Sub1_Sub1_Sub1_Sub1_1.aClass151_Sub1_3.aBoolean363) {
				local29 = 0;
			} else if (local34.anInt5365 * 1074876801 == local40 || local40 == local34.anInt5356 * 421310407 || local40 == local34.anInt5358 * 541177679 || local40 == local34.anInt5357 * -921167219) {
				local29 = 2;
			} else if (local40 == local34.anInt5359 * 1846476627 || local40 == local34.anInt5362 * -63558043 || local40 == local34.anInt5370 * -1045334803 || local34.anInt5360 * 630970333 == local40) {
				local29 = 3;
			}
			if (local29 != local4.anInt1507 * 1445799511) {
				local115 = Class334.method27667(local4.aClass104_Sub1_Sub1_Sub1_Sub1_1);
				@Pc(119) Class333 local119 = local4.aClass104_Sub1_Sub1_Sub1_Sub1_1.aClass333_1;
				if (local119.anIntArray437 != null) {
					local119 = local119.method27642(Class55.aClass124_1, Class55.aClass124_1);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1502 = -1086873753;
					local4.anInt1507 = local29 * 1882006887;
				} else if (local115 == local4.anInt1502 * -241175639) {
					local4.anInt1507 = local29 * 1882006887;
					local4.anInt1495 = local119.anInt4122 * 1689126761;
				} else {
					@Pc(152) boolean local152 = false;
					if (local4.aClass496_3 == null) {
						local152 = true;
					} else {
						local4.anInt1495 -= 1072686592;
						if (local4.anInt1495 * 63994171 <= 0) {
							local4.aClass496_3.method30100(100);
							Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
							local4.aClass496_3 = null;
							local152 = true;
						}
					}
					if (local152) {
						local4.anInt1495 = local119.anInt4122 * 1689126761;
						local4.anInt1502 = local115 * 1086873753;
						local4.anInt1507 = local29 * 1882006887;
					}
				}
			}
			local219 = local4.aClass104_Sub1_Sub1_Sub1_Sub1_1.method24085().aClass447_61;
			local4.anInt1490 = (int) local219.aFloat277 * -973592293;
			local4.anInt1492 = ((int) local219.aFloat277 + (local4.aClass104_Sub1_Sub1_Sub1_Sub1_1.method21095() << 8)) * -800010841;
			local4.anInt1491 = (int) local219.aFloat278 * -1604946927;
			local4.anInt1493 = ((int) local219.aFloat278 + (local4.aClass104_Sub1_Sub1_Sub1_Sub1_1.method21095() << 8)) * 1156683381;
			local4.anInt1489 = local4.aClass104_Sub1_Sub1_Sub1_Sub1_1.aByte100 * -1178810913;
			Class273.method26541(local4, arg0, arg1, arg2, arg3);
		}
		for (local4 = (Class77_Sub16) Class77_Sub16.aClass12_12.method190(); local4 != null; local4 = (Class77_Sub16) Class77_Sub16.aClass12_12.method192()) {
			local29 = 1;
			local34 = local4.aClass104_Sub1_Sub1_Sub1_Sub2_1.method21105();
			local40 = local4.aClass104_Sub1_Sub1_Sub1_Sub2_1.aClass151_Sub1_3.method23399();
			if (local40 == -1 || local4.aClass104_Sub1_Sub1_Sub1_Sub2_1.aClass151_Sub1_3.aBoolean363) {
				local29 = 0;
			} else if (local40 == local34.anInt5365 * 1074876801 || local40 == local34.anInt5356 * 421310407 || local34.anInt5358 * 541177679 == local40 || local40 == local34.anInt5357 * -921167219) {
				local29 = 2;
			} else if (local40 == local34.anInt5359 * 1846476627 || local34.anInt5362 * -63558043 == local40 || local34.anInt5370 * -1045334803 == local40 || local34.anInt5360 * 630970333 == local40) {
				local29 = 3;
			}
			if (local29 != local4.anInt1507 * 1445799511) {
				local115 = Class110.method9160(local4.aClass104_Sub1_Sub1_Sub1_Sub2_1);
				if (local4.anInt1502 * -241175639 == local115) {
					local4.anInt1495 = local4.aClass104_Sub1_Sub1_Sub1_Sub2_1.anInt2905 * -908420807;
					local4.anInt1507 = local29 * 1882006887;
				} else {
					@Pc(384) boolean local384 = false;
					if (local4.aClass496_3 == null) {
						local384 = true;
					} else {
						local4.anInt1495 -= 1072686592;
						if (local4.anInt1495 * 63994171 <= 0) {
							local4.aClass496_3.method30100(100);
							Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
							local4.aClass496_3 = null;
							local384 = true;
						}
					}
					if (local384) {
						local4.anInt1495 = local4.aClass104_Sub1_Sub1_Sub1_Sub2_1.anInt2905 * -908420807;
						local4.anInt1502 = local115 * 1086873753;
						local4.anInt1507 = local29 * 1882006887;
					}
				}
			}
			local219 = local4.aClass104_Sub1_Sub1_Sub1_Sub2_1.method24085().aClass447_61;
			local4.anInt1490 = (int) local219.aFloat277 * -973592293;
			local4.anInt1492 = ((int) local219.aFloat277 + (local4.aClass104_Sub1_Sub1_Sub1_Sub2_1.method21095() << 8)) * -800010841;
			local4.anInt1491 = (int) local219.aFloat278 * -1604946927;
			local4.anInt1493 = ((int) local219.aFloat278 + (local4.aClass104_Sub1_Sub1_Sub1_Sub2_1.method21095() << 8)) * 1156683381;
			local4.anInt1489 = local4.aClass104_Sub1_Sub1_Sub1_Sub2_1.aByte100 * -1178810913;
			Class273.method26541(local4, arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "wt", descriptor = "(Lclient!yf;B)V", line = 8503)
	static final void method7073(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3479 * 956397893;
	}
}
