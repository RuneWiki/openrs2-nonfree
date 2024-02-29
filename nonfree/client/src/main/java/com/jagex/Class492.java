package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
final class Class492 implements Interface10 {

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 25)
	@Override
	public Object method30210(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22523();
	}

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "(Lclient!akv;I)Ljava/lang/Object;", line = 25)
	@Override
	public Object method30209(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22523();
	}

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 25)
	@Override
	public Object method30211(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22523();
	}

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 25)
	@Override
	public Object method30208(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22523();
	}

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "(I)V", line = 126)
	static final void method30037() {
		@Pc(4) Class77_Sub4 local4;
		for (local4 = (Class77_Sub4) Class77_Sub4.aClass695_17.method36395(); local4 != null; local4 = (Class77_Sub4) Class77_Sub4.aClass695_17.method36406()) {
			Class413.method28609(local4, false);
		}
		for (local4 = (Class77_Sub4) Class77_Sub4.aClass695_18.method36395(); local4 != null; local4 = (Class77_Sub4) Class77_Sub4.aClass695_18.method36406()) {
			Class413.method28609(local4, true);
		}
	}

	@OriginalMember(owner = "client!qn", name = "gh", descriptor = "(I)V", line = 3615)
	public static final void method30038() {
		if (!client.aBoolean609) {
			client.aFloat248 += (24.0F - client.aFloat248) / 2.0F;
			client.aBoolean612 = true;
			client.aBoolean609 = true;
		}
	}

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "(Lclient!yf;I)V", line = 4377)
	static final void method30039(@OriginalArg(0) Class665 arg0) {
		@Pc(9) Class75 local9 = (Class75) arg0.aClass77_Sub1_Sub9_2.anObjectArray5[arg0.anInt5786 * 662605117];
		@Pc(30) Interface18 local30 = (Interface18) (arg0.anIntArray535[arg0.anInt5786 * 662605117] == 0 ? arg0.aMap22.get(local9.aClass127_3) : arg0.aMap23.get(local9.aClass127_3));
		@Pc(35) Class489 local35 = local9.aClass498_6.method30191();
		if (local35 == Class489.aClass489_2) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local30.method35934(local9);
		} else if (Class489.aClass489_3 == local35) {
			arg0.aLongArray28[(arg0.anInt5782 += 1091885681) * 1572578961 - 1] = local30.method35950(local9);
		} else if (local35 == Class489.aClass489_6) {
			try {
				@Pc(88) String local88 = (String) local30.method35949(local9);
				if (local88 == null) {
					local88 = "null";
				}
				arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local88;
			} catch (@Pc(110) Exception local110) {
				throw new RuntimeException(local110);
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qn", name = "xu", descriptor = "(Lclient!yf;I)V", line = 8662)
	static final void method30040(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aBoolean619 ? 1 : 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = client.aString161 == null ? "" : client.aString161;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = client.aString160 == null ? "" : client.aString160;
	}

	@OriginalMember(owner = "client!qn", name = "aiy", descriptor = "(Lclient!yf;I)V", line = 11017)
	static final void method30041(@OriginalArg(0) Class665 arg0) {
		if (Class706.aBoolean868 && Class184.aFrame1 != null) {
			Class196.method25463(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194(), -1, -1, false);
		}
	}

	@OriginalMember(owner = "client!qn", name = "awk", descriptor = "(Lclient!yf;I)V", line = 13323)
	static final void method30042(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub14_1.method16264(local12);
	}
}
