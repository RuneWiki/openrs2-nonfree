package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afq")
public class Class96_Sub14 extends Class96 {

	@OriginalMember(owner = "client!afq", name = "m", descriptor = "[I")
	static int[] anIntArray93;

	@OriginalMember(owner = "client!afq", name = "c", descriptor = "I")
	final int anInt885;

	@OriginalMember(owner = "client!afq", name = "v", descriptor = "I")
	final int anInt886;

	@OriginalMember(owner = "client!afq", name = "<init>", descriptor = "(Lclient!akv;)V", line = 10)
	Class96_Sub14(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt885 = arg0.method22483() * 805064331;
		this.anInt886 = arg0.method22483() * -1770817007;
	}

	@OriginalMember(owner = "client!afq", name = "w", descriptor = "()V", line = 16)
	@Override
	public void method19913() {
		Class589.aClass222Array1[this.anInt885 * 174532899].method25755().method21070(this.anInt886 * -362629391, true);
	}

	@OriginalMember(owner = "client!afq", name = "y", descriptor = "()V", line = 16)
	@Override
	public void method19912() {
		Class589.aClass222Array1[this.anInt885 * 174532899].method25755().method21070(this.anInt886 * -362629391, true);
	}

	@OriginalMember(owner = "client!afq", name = "c", descriptor = "(I)V", line = 16)
	@Override
	public void method19911() {
		Class589.aClass222Array1[this.anInt885 * 174532899].method25755().method21070(this.anInt886 * -362629391, true);
	}

	@OriginalMember(owner = "client!afq", name = "aj", descriptor = "(Lclient!yf;B)V", line = 4420)
	static final void method7498(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		if (arg0.anIntArray536[arg0.anInt5784 * 2088438307] != arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!afq", name = "gm", descriptor = "(Lclient!yf;I)V", line = 5775)
	static final void method7499(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class77_Sub19.method13488(local11, local14, false, 2, arg0);
	}

	@OriginalMember(owner = "client!afq", name = "lb", descriptor = "(Lclient!yf;I)V", line = 6531)
	static final void method7500(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class575.method31601(local11, local14, arg0);
	}
}
