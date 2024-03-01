package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public class Class224 {

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "Lclient!yx;")
	static Class611 aClass611_8;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "Lclient!hm;")
	Class226 aClass226_1;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_39;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_38;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!ny;Lclient!ny;)V", line = 23)
	public Class224(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1) {
		this.aClass359_39 = arg0;
		this.aClass359_38 = arg1;
	}

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "(Lclient!kk;I)Lclient!ib;", line = 29)
	public Interface19 method24447(@OriginalArg(0) Interface31 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(8) Class274 local8 = arg0.method25540();
		if (Class274.aClass274_4 == local8) {
			return new Class222((Class286) arg0);
		} else if (Class274.aClass274_8 == local8) {
			return new Class230(this.method24446(), (Class282) arg0);
		} else if (local8 == Class274.aClass274_5) {
			return new Class33(this.aClass359_39, (Class49) arg0);
		} else if (local8 == Class274.aClass274_6) {
			return new Class33_Sub1(this.aClass359_39, (Class49_Sub1) arg0);
		} else if (Class274.aClass274_1 == local8) {
			return new Class34_Sub2(this.aClass359_39, this.aClass359_38, (Class44_Sub3) arg0);
		} else if (Class274.aClass274_2 == local8) {
			return new Class34_Sub3(this.aClass359_39, this.aClass359_38, (Class44_Sub1) arg0);
		} else if (Class274.aClass274_3 == local8) {
			return new Class34_Sub1(this.aClass359_39, this.aClass359_38, (Class44_Sub2) arg0);
		} else if (Class274.aClass274_7 == local8) {
			return new Class237(this.aClass359_39, this.aClass359_38, (Class278) arg0);
		} else if (Class274.aClass274_11 == local8) {
			return new Class225(this.aClass359_39, (Class291) arg0);
		} else if (local8 == Class274.aClass274_9) {
			return new Class34_Sub1_Sub1(this.aClass359_39, this.aClass359_38, (Class44_Sub2_Sub1) arg0);
		} else if (Class274.aClass274_10 == local8) {
			return new Class229(this.aClass359_39, this.aClass359_38, (Class281) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(Lclient!kk;)Lclient!ib;", line = 29)
	public Interface19 method24449(@OriginalArg(0) Interface31 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(8) Class274 local8 = arg0.method25540();
		if (Class274.aClass274_4 == local8) {
			return new Class222((Class286) arg0);
		} else if (Class274.aClass274_8 == local8) {
			return new Class230(this.method24446(), (Class282) arg0);
		} else if (local8 == Class274.aClass274_5) {
			return new Class33(this.aClass359_39, (Class49) arg0);
		} else if (local8 == Class274.aClass274_6) {
			return new Class33_Sub1(this.aClass359_39, (Class49_Sub1) arg0);
		} else if (Class274.aClass274_1 == local8) {
			return new Class34_Sub2(this.aClass359_39, this.aClass359_38, (Class44_Sub3) arg0);
		} else if (Class274.aClass274_2 == local8) {
			return new Class34_Sub3(this.aClass359_39, this.aClass359_38, (Class44_Sub1) arg0);
		} else if (Class274.aClass274_3 == local8) {
			return new Class34_Sub1(this.aClass359_39, this.aClass359_38, (Class44_Sub2) arg0);
		} else if (Class274.aClass274_7 == local8) {
			return new Class237(this.aClass359_39, this.aClass359_38, (Class278) arg0);
		} else if (Class274.aClass274_11 == local8) {
			return new Class225(this.aClass359_39, (Class291) arg0);
		} else if (local8 == Class274.aClass274_9) {
			return new Class34_Sub1_Sub1(this.aClass359_39, this.aClass359_38, (Class44_Sub2_Sub1) arg0);
		} else if (Class274.aClass274_10 == local8) {
			return new Class229(this.aClass359_39, this.aClass359_38, (Class281) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "(Lclient!kk;)Lclient!ib;", line = 29)
	public Interface19 method24450(@OriginalArg(0) Interface31 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(8) Class274 local8 = arg0.method25540();
		if (Class274.aClass274_4 == local8) {
			return new Class222((Class286) arg0);
		} else if (Class274.aClass274_8 == local8) {
			return new Class230(this.method24446(), (Class282) arg0);
		} else if (local8 == Class274.aClass274_5) {
			return new Class33(this.aClass359_39, (Class49) arg0);
		} else if (local8 == Class274.aClass274_6) {
			return new Class33_Sub1(this.aClass359_39, (Class49_Sub1) arg0);
		} else if (Class274.aClass274_1 == local8) {
			return new Class34_Sub2(this.aClass359_39, this.aClass359_38, (Class44_Sub3) arg0);
		} else if (Class274.aClass274_2 == local8) {
			return new Class34_Sub3(this.aClass359_39, this.aClass359_38, (Class44_Sub1) arg0);
		} else if (Class274.aClass274_3 == local8) {
			return new Class34_Sub1(this.aClass359_39, this.aClass359_38, (Class44_Sub2) arg0);
		} else if (Class274.aClass274_7 == local8) {
			return new Class237(this.aClass359_39, this.aClass359_38, (Class278) arg0);
		} else if (Class274.aClass274_11 == local8) {
			return new Class225(this.aClass359_39, (Class291) arg0);
		} else if (local8 == Class274.aClass274_9) {
			return new Class34_Sub1_Sub1(this.aClass359_39, this.aClass359_38, (Class44_Sub2_Sub1) arg0);
		} else if (Class274.aClass274_10 == local8) {
			return new Class229(this.aClass359_39, this.aClass359_38, (Class281) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "(Lclient!kk;)Lclient!ib;", line = 29)
	public Interface19 method24452(@OriginalArg(0) Interface31 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(8) Class274 local8 = arg0.method25540();
		if (Class274.aClass274_4 == local8) {
			return new Class222((Class286) arg0);
		} else if (Class274.aClass274_8 == local8) {
			return new Class230(this.method24446(), (Class282) arg0);
		} else if (local8 == Class274.aClass274_5) {
			return new Class33(this.aClass359_39, (Class49) arg0);
		} else if (local8 == Class274.aClass274_6) {
			return new Class33_Sub1(this.aClass359_39, (Class49_Sub1) arg0);
		} else if (Class274.aClass274_1 == local8) {
			return new Class34_Sub2(this.aClass359_39, this.aClass359_38, (Class44_Sub3) arg0);
		} else if (Class274.aClass274_2 == local8) {
			return new Class34_Sub3(this.aClass359_39, this.aClass359_38, (Class44_Sub1) arg0);
		} else if (Class274.aClass274_3 == local8) {
			return new Class34_Sub1(this.aClass359_39, this.aClass359_38, (Class44_Sub2) arg0);
		} else if (Class274.aClass274_7 == local8) {
			return new Class237(this.aClass359_39, this.aClass359_38, (Class278) arg0);
		} else if (Class274.aClass274_11 == local8) {
			return new Class225(this.aClass359_39, (Class291) arg0);
		} else if (local8 == Class274.aClass274_9) {
			return new Class34_Sub1_Sub1(this.aClass359_39, this.aClass359_38, (Class44_Sub2_Sub1) arg0);
		} else if (Class274.aClass274_10 == local8) {
			return new Class229(this.aClass359_39, this.aClass359_38, (Class281) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lclient!hm;", line = 46)
	Class226 method24446() {
		if (this.aClass226_1 == null) {
			this.aClass226_1 = new Class226();
		}
		return this.aClass226_1;
	}

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "()Lclient!hm;", line = 46)
	Class226 method24448() {
		if (this.aClass226_1 == null) {
			this.aClass226_1 = new Class226();
		}
		return this.aClass226_1;
	}

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "()Lclient!hm;", line = 46)
	Class226 method24451() {
		if (this.aClass226_1 == null) {
			this.aClass226_1 = new Class226();
		}
		return this.aClass226_1;
	}

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "()Lclient!hm;", line = 46)
	Class226 method24453() {
		if (this.aClass226_1 == null) {
			this.aClass226_1 = new Class226();
		}
		return this.aClass226_1;
	}

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "()Lclient!hm;", line = 46)
	Class226 method24454() {
		if (this.aClass226_1 == null) {
			this.aClass226_1 = new Class226();
		}
		return this.aClass226_1;
	}

	@OriginalMember(owner = "client!hj", name = "gh", descriptor = "(I)V", line = 3200)
	static final void method24457() {
		Class189.method23986(Class613.aClass21_13);
		if (Class141.anInt3427 * 1197232991 != client.anInt3109 * -886935421) {
			Class43_Sub5.method9508();
		}
	}

	@OriginalMember(owner = "client!hj", name = "gs", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5260)
	static final void method24455(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean627 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
		Class223.method24442(arg0);
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class362.method26779(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!hj", name = "adi", descriptor = "(Lclient!vs;I)V", line = 9413)
	static final void method24459(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(15) Class82 local15 = Class406.method27657();
		@Pc(21) Class3_Sub23 local21 = Class269.method25284(Class311.aClass311_85, local15.aClass577_2);
		local21.aClass3_Sub41_Sub1_1.method20250(local12);
		local15.method21601(local21);
	}

	@OriginalMember(owner = "client!hj", name = "aln", descriptor = "(Lclient!vs;I)V", line = 11147)
	static final void method24456(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class435.method27992().method33765();
	}

	@OriginalMember(owner = "client!hj", name = "alk", descriptor = "(Lclient!vs;I)V", line = 11190)
	static final void method24458(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class190.anInt3669 * 1840232743;
	}
}
