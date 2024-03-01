package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public class Class418 {

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "Lclient!dw;")
	public static Class14 aClass14_11;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "[I")
	int[] anIntArray433;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
	int anInt4838 = 1991692301;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
	int anInt4837 = 1399243079;

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "Lclient!qn;")
	Class412 aClass412_4 = Class412.aClass412_2;

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
	int anInt4839 = 434895681;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "()V", line = 14)
	Class418() {
	}

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "(Lclient!ahb;I)V", line = 18)
	void method27823(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method27828(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "(Lclient!ahb;)V", line = 18)
	void method27824(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method27828(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "(Lclient!ahb;)V", line = 18)
	void method27825(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method27828(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "(Lclient!ahb;)V", line = 18)
	void method27826(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method27828(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "(Lclient!ahb;I)V", line = 25)
	void method27822(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4838 = arg0.method20271() * -1991692301;
		} else if (arg1 == 2) {
			this.anIntArray433 = new int[arg0.method20269()];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray433.length; local21++) {
				this.anIntArray433[local21] = arg0.method20271();
			}
		} else if (arg1 == 3) {
			this.anInt4837 = arg0.method20269() * -1399243079;
		} else if (arg1 == 4) {
			this.aClass412_4 = (Class412) Class356.method26649(Class528.method32451(), arg0.method20269());
		} else if (arg1 == 5) {
			this.anInt4839 = arg0.method20375() * -434895681;
		} else if (arg1 == 6) {
			arg0.method20375();
		}
	}

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "(Lclient!ahb;I)V", line = 25)
	void method27827(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4838 = arg0.method20271() * -1991692301;
		} else if (arg1 == 2) {
			this.anIntArray433 = new int[arg0.method20269()];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray433.length; local21++) {
				this.anIntArray433[local21] = arg0.method20271();
			}
		} else if (arg1 == 3) {
			this.anInt4837 = arg0.method20269() * -1399243079;
		} else if (arg1 == 4) {
			this.aClass412_4 = (Class412) Class356.method26649(Class528.method32451(), arg0.method20269());
		} else if (arg1 == 5) {
			this.anInt4839 = arg0.method20375() * -434895681;
		} else if (arg1 == 6) {
			arg0.method20375();
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!ahb;II)V", line = 25)
	void method27828(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4838 = arg0.method20271() * -1991692301;
		} else if (arg1 == 2) {
			this.anIntArray433 = new int[arg0.method20269()];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray433.length; local21++) {
				this.anIntArray433[local21] = arg0.method20271();
			}
		} else if (arg1 == 3) {
			this.anInt4837 = arg0.method20269() * -1399243079;
		} else if (arg1 == 4) {
			this.aClass412_4 = (Class412) Class356.method26649(Class528.method32451(), arg0.method20269());
		} else if (arg1 == 5) {
			this.anInt4839 = arg0.method20375() * -434895681;
		} else if (arg1 == 6) {
			arg0.method20375();
		}
	}

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "(Lclient!ahb;I)V", line = 25)
	void method27829(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4838 = arg0.method20271() * -1991692301;
		} else if (arg1 == 2) {
			this.anIntArray433 = new int[arg0.method20269()];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray433.length; local21++) {
				this.anIntArray433[local21] = arg0.method20271();
			}
		} else if (arg1 == 3) {
			this.anInt4837 = arg0.method20269() * -1399243079;
		} else if (arg1 == 4) {
			this.aClass412_4 = (Class412) Class356.method26649(Class528.method32451(), arg0.method20269());
		} else if (arg1 == 5) {
			this.anInt4839 = arg0.method20375() * -434895681;
		} else if (arg1 == 6) {
			arg0.method20375();
		}
	}

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "(Lclient!vs;I)V", line = 29)
	static void method27830(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).aBoolean818 ? 1 : 0;
	}

	@OriginalMember(owner = "client!qv", name = "qu", descriptor = "(Lclient!fo;Lclient!vs;I)V", line = 7090)
	static final void method27832(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(5) Class611 local5 = arg0.method23433(Class379.aClass312_1, client.anInterface34_1);
		@Pc(18) int local18 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381];
		@Pc(34) Point local34 = local5.method33581(arg0.aString169, arg0.anInt3498 * -1494060731, arg0.anInt3541 * -815720547, local18, Class19_Sub1.aClass6Array10);
		arg1.anIntArray496[(arg1.anInt5319 += 312124549) * 960738381 - 1] = local34.x;
		arg1.anIntArray496[(arg1.anInt5319 += 312124549) * 960738381 - 1] = local34.y;
	}

	@OriginalMember(owner = "client!qv", name = "tj", descriptor = "(Lclient!vs;I)V", line = 7659)
	static final void method27831(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1560622745;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(53) int local53 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 4];
		Class510.aClass183_1.method23589(Class160.aClass160_9, local13, local23, local43, Class141.aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local53, local33);
	}
}
