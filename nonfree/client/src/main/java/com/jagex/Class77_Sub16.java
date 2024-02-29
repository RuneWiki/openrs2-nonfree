package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajo")
public class Class77_Sub16 extends Class77 {

	@OriginalMember(owner = "client!ajo", name = "l", descriptor = "I")
	static final int anInt1494 = 512;

	@OriginalMember(owner = "client!ajo", name = "o", descriptor = "I")
	static final int anInt1497 = 0;

	@OriginalMember(owner = "client!ajo", name = "b", descriptor = "I")
	static final int anInt1498 = 1;

	@OriginalMember(owner = "client!ajo", name = "n", descriptor = "I")
	static final int anInt1499 = 2;

	@OriginalMember(owner = "client!ajo", name = "a", descriptor = "I")
	static final int anInt1500 = 3;

	@OriginalMember(owner = "client!ajo", name = "y", descriptor = "Lclient!zm;")
	static Class695 aClass695_20 = new Class695();

	@OriginalMember(owner = "client!ajo", name = "w", descriptor = "Lclient!zm;")
	static Class695 aClass695_21 = new Class695();

	@OriginalMember(owner = "client!ajo", name = "t", descriptor = "Lclient!aak;")
	static Class12 aClass12_12 = new Class12(16);

	@OriginalMember(owner = "client!ajo", name = "i", descriptor = "I")
	int anInt1488;

	@OriginalMember(owner = "client!ajo", name = "q", descriptor = "I")
	int anInt1489;

	@OriginalMember(owner = "client!ajo", name = "d", descriptor = "I")
	int anInt1490;

	@OriginalMember(owner = "client!ajo", name = "x", descriptor = "I")
	int anInt1491;

	@OriginalMember(owner = "client!ajo", name = "s", descriptor = "I")
	int anInt1492;

	@OriginalMember(owner = "client!ajo", name = "r", descriptor = "I")
	int anInt1493;

	@OriginalMember(owner = "client!ajo", name = "ax", descriptor = "[I")
	int[] anIntArray197;

	@OriginalMember(owner = "client!ajo", name = "k", descriptor = "I")
	int anInt1495;

	@OriginalMember(owner = "client!ajo", name = "u", descriptor = "Lclient!vm;")
	Class599 aClass599_1;

	@OriginalMember(owner = "client!ajo", name = "e", descriptor = "Lclient!apo;")
	Class104_Sub1_Sub1_Sub1_Sub1 aClass104_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ajo", name = "aj", descriptor = "I")
	int anInt1496;

	@OriginalMember(owner = "client!ajo", name = "ar", descriptor = "I")
	int anInt1501;

	@OriginalMember(owner = "client!ajo", name = "ag", descriptor = "I")
	int anInt1502;

	@OriginalMember(owner = "client!ajo", name = "f", descriptor = "Lclient!apv;")
	Class104_Sub1_Sub1_Sub1_Sub2 aClass104_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ajo", name = "j", descriptor = "I")
	int anInt1503;

	@OriginalMember(owner = "client!ajo", name = "al", descriptor = "Lclient!qs;")
	Class496 aClass496_3;

	@OriginalMember(owner = "client!ajo", name = "ai", descriptor = "I")
	int anInt1504;

	@OriginalMember(owner = "client!ajo", name = "ao", descriptor = "Lclient!qs;")
	Class496 aClass496_4;

	@OriginalMember(owner = "client!ajo", name = "ak", descriptor = "I")
	int anInt1505;

	@OriginalMember(owner = "client!ajo", name = "au", descriptor = "I")
	int anInt1506;

	@OriginalMember(owner = "client!ajo", name = "h", descriptor = "Z")
	boolean aBoolean328;

	@OriginalMember(owner = "client!ajo", name = "g", descriptor = "Lclient!oo;")
	Class447 aClass447_45 = new Class447(0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!ajo", name = "z", descriptor = "Lclient!oo;")
	Class447 aClass447_46 = new Class447(0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!ajo", name = "m", descriptor = "I")
	int anInt1507 = 0;

	@OriginalMember(owner = "client!ajo", name = "<init>", descriptor = "()V", line = 53)
	Class77_Sub16() {
	}

	@OriginalMember(owner = "client!ajo", name = "z", descriptor = "(Z)V", line = 56)
	public static void method13432(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class77_Sub16 local4;
		for (local4 = (Class77_Sub16) aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_20.method36406()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			if (local4.aClass496_4 != null) {
				local4.aClass496_4.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_4);
				local4.aClass496_4 = null;
			}
			local4.method24063();
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class77_Sub16) aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_21.method36406()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			local4.method24063();
		}
		for (local4 = (Class77_Sub16) aClass12_12.method190(); local4 != null; local4 = (Class77_Sub16) aClass12_12.method192()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			local4.method24063();
		}
	}

	@OriginalMember(owner = "client!ajo", name = "j", descriptor = "(Z)V", line = 56)
	public static void method13433(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class77_Sub16 local4;
		for (local4 = (Class77_Sub16) aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_20.method36406()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			if (local4.aClass496_4 != null) {
				local4.aClass496_4.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_4);
				local4.aClass496_4 = null;
			}
			local4.method24063();
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class77_Sub16) aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_21.method36406()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			local4.method24063();
		}
		for (local4 = (Class77_Sub16) aClass12_12.method190(); local4 != null; local4 = (Class77_Sub16) aClass12_12.method192()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			local4.method24063();
		}
	}

	@OriginalMember(owner = "client!ajo", name = "g", descriptor = "(Z)V", line = 56)
	public static void method13434(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class77_Sub16 local4;
		for (local4 = (Class77_Sub16) aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_20.method36406()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			if (local4.aClass496_4 != null) {
				local4.aClass496_4.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_4);
				local4.aClass496_4 = null;
			}
			local4.method24063();
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class77_Sub16) aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_21.method36406()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			local4.method24063();
		}
		for (local4 = (Class77_Sub16) aClass12_12.method190(); local4 != null; local4 = (Class77_Sub16) aClass12_12.method192()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			local4.method24063();
		}
	}

	@OriginalMember(owner = "client!ajo", name = "b", descriptor = "()V", line = 90)
	public static void method13435() {
		@Pc(4) Class77_Sub16 local4;
		for (local4 = (Class77_Sub16) aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_20.method36406()) {
			if (local4.aBoolean328) {
				local4.method13438();
			}
		}
		for (local4 = (Class77_Sub16) aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_21.method36406()) {
			if (local4.aBoolean328) {
				local4.method13438();
			}
		}
	}

	@OriginalMember(owner = "client!ajo", name = "n", descriptor = "()V", line = 90)
	public static void method13436() {
		@Pc(4) Class77_Sub16 local4;
		for (local4 = (Class77_Sub16) aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_20.method36406()) {
			if (local4.aBoolean328) {
				local4.method13438();
			}
		}
		for (local4 = (Class77_Sub16) aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_21.method36406()) {
			if (local4.aBoolean328) {
				local4.method13438();
			}
		}
	}

	@OriginalMember(owner = "client!ajo", name = "a", descriptor = "()V", line = 90)
	public static void method13437() {
		@Pc(4) Class77_Sub16 local4;
		for (local4 = (Class77_Sub16) aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_20.method36406()) {
			if (local4.aBoolean328) {
				local4.method13438();
			}
		}
		for (local4 = (Class77_Sub16) aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_21.method36406()) {
			if (local4.aBoolean328) {
				local4.method13438();
			}
		}
	}

	@OriginalMember(owner = "client!ajo", name = "v", descriptor = "(I)V", line = 99)
	void method13438() {
		@Pc(4) int local4 = this.anInt1502 * -241175639;
		if (this.aClass599_1 != null) {
			@Pc(21) Class599 local21 = this.aClass599_1.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
			if (local21 == null) {
				this.anInt1502 = -1086873753;
				this.anInt1488 = 0;
				this.anInt1495 = 0;
				this.anInt1505 = 0;
				this.anInt1506 = 0;
				this.anIntArray197 = null;
				this.anInt1504 = 1916307200;
				this.anInt1496 = 665776896;
				this.anInt1503 = 0;
			} else {
				this.anInt1502 = local21.anInt5540 * 1128583165;
				this.anInt1488 = (local21.anInt5541 * 372226515 << 9) * -612932795;
				this.anInt1495 = local21.anInt5543 * 1993106295;
				this.anInt1505 = local21.anInt5523 * 617813239;
				this.anInt1506 = local21.anInt5545 * 1071004077;
				this.anIntArray197 = local21.anIntArray512;
				this.anInt1504 = local21.anInt5547 * -1005766001;
				this.anInt1496 = local21.anInt5514 * -990708005;
			}
		} else if (this.aClass104_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(111) int local111 = Class334.method27667(this.aClass104_Sub1_Sub1_Sub1_Sub1_1);
			if (local4 != local111) {
				this.anInt1502 = local111 * 1086873753;
				@Pc(123) Class333 local123 = this.aClass104_Sub1_Sub1_Sub1_Sub1_1.aClass333_1;
				if (local123.anIntArray437 != null) {
					local123 = local123.method27642(Class55.aClass124_1, Class55.aClass124_1);
				}
				if (local123 == null) {
					this.anInt1503 = 0;
					this.anInt1488 = 0;
					this.anInt1495 = 0;
					this.anInt1504 = 1916307200;
					this.anInt1496 = 665776896;
				} else {
					this.anInt1488 = (local123.anInt4121 * -869231065 << 9) * -612932795;
					this.anInt1503 = (local123.anInt4102 * -1156607845 << 9) * -2034082261;
					this.anInt1495 = local123.anInt4122 * 1689126761;
					this.anInt1504 = local123.anInt4127 * 932822485;
					this.anInt1496 = local123.anInt4126 * -32158863;
				}
			}
		} else if (this.aClass104_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1502 = Class110.method9160(this.aClass104_Sub1_Sub1_Sub1_Sub2_1) * 1086873753;
			this.anInt1488 = (this.aClass104_Sub1_Sub1_Sub1_Sub2_1.anInt2914 * -785793877 << 9) * -612932795;
			this.anInt1503 = 0;
			this.anInt1495 = this.aClass104_Sub1_Sub1_Sub1_Sub2_1.anInt2905 * -908420807;
			this.anInt1504 = 1916307200;
			this.anInt1496 = 665776896;
		}
		if (this.anInt1502 * -241175639 != local4 && this.aClass496_3 != null && this.aClass496_3 != null) {
			this.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(this.aClass496_3);
			this.aClass496_3 = null;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "m", descriptor = "()V", line = 99)
	void method13439() {
		@Pc(4) int local4 = this.anInt1502 * -241175639;
		if (this.aClass599_1 != null) {
			@Pc(21) Class599 local21 = this.aClass599_1.method32006(Class55.aClass124_1, client.anInt3443 * -1468443459 == 3 ? Class230.anInterface19_3 : Class55.aClass124_1);
			if (local21 == null) {
				this.anInt1502 = -1086873753;
				this.anInt1488 = 0;
				this.anInt1495 = 0;
				this.anInt1505 = 0;
				this.anInt1506 = 0;
				this.anIntArray197 = null;
				this.anInt1504 = 1916307200;
				this.anInt1496 = 665776896;
				this.anInt1503 = 0;
			} else {
				this.anInt1502 = local21.anInt5540 * 1128583165;
				this.anInt1488 = (local21.anInt5541 * 372226515 << 9) * -612932795;
				this.anInt1495 = local21.anInt5543 * 1993106295;
				this.anInt1505 = local21.anInt5523 * 617813239;
				this.anInt1506 = local21.anInt5545 * 1071004077;
				this.anIntArray197 = local21.anIntArray512;
				this.anInt1504 = local21.anInt5547 * -1005766001;
				this.anInt1496 = local21.anInt5514 * -990708005;
			}
		} else if (this.aClass104_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(111) int local111 = Class334.method27667(this.aClass104_Sub1_Sub1_Sub1_Sub1_1);
			if (local4 != local111) {
				this.anInt1502 = local111 * 1086873753;
				@Pc(123) Class333 local123 = this.aClass104_Sub1_Sub1_Sub1_Sub1_1.aClass333_1;
				if (local123.anIntArray437 != null) {
					local123 = local123.method27642(Class55.aClass124_1, Class55.aClass124_1);
				}
				if (local123 == null) {
					this.anInt1503 = 0;
					this.anInt1488 = 0;
					this.anInt1495 = 0;
					this.anInt1504 = 1916307200;
					this.anInt1496 = 665776896;
				} else {
					this.anInt1488 = (local123.anInt4121 * -869231065 << 9) * -612932795;
					this.anInt1503 = (local123.anInt4102 * -1156607845 << 9) * -2034082261;
					this.anInt1495 = local123.anInt4122 * 1689126761;
					this.anInt1504 = local123.anInt4127 * 932822485;
					this.anInt1496 = local123.anInt4126 * -32158863;
				}
			}
		} else if (this.aClass104_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1502 = Class110.method9160(this.aClass104_Sub1_Sub1_Sub1_Sub2_1) * 1086873753;
			this.anInt1488 = (this.aClass104_Sub1_Sub1_Sub1_Sub2_1.anInt2914 * -785793877 << 9) * -612932795;
			this.anInt1503 = 0;
			this.anInt1495 = this.aClass104_Sub1_Sub1_Sub1_Sub2_1.anInt2905 * -908420807;
			this.anInt1504 = 1916307200;
			this.anInt1496 = 665776896;
		}
		if (this.anInt1502 * -241175639 != local4 && this.aClass496_3 != null && this.aClass496_3 != null) {
			this.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(this.aClass496_3);
			this.aClass496_3 = null;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "h", descriptor = "(IIIILclient!vm;Lclient!apo;Lclient!apv;)V", line = 166)
	public static void method13440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class599 arg4, @OriginalArg(5) Class104_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class104_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(3) Class77_Sub16 local3 = new Class77_Sub16();
		local3.anInt1489 = arg0 * -1178810913;
		local3.anInt1490 = (arg1 << 9) * -973592293;
		local3.anInt1491 = (arg2 << 9) * -1604946927;
		if (arg4 != null) {
			local3.aClass599_1 = arg4;
			@Pc(32) int local32 = arg4.anInt5516 * -1082258489;
			@Pc(37) int local37 = arg4.anInt5529 * -1990374967;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg4.anInt5529 * -1990374967;
				local37 = arg4.anInt5516 * -1082258489;
			}
			local3.anInt1492 = (local32 + arg1 << 9) * -800010841;
			local3.anInt1493 = (local37 + arg2 << 9) * 1156683381;
			local3.anInt1502 = arg4.anInt5540 * 1128583165;
			local3.anInt1488 = (arg4.anInt5541 * 372226515 << 9) * -612932795;
			local3.anInt1495 = arg4.anInt5543 * 1993106295;
			local3.anInt1505 = arg4.anInt5523 * 617813239;
			local3.anInt1506 = arg4.anInt5545 * 1071004077;
			local3.anIntArray197 = arg4.anIntArray512;
			local3.anInt1504 = arg4.anInt5547 * -1005766001;
			local3.anInt1496 = arg4.anInt5514 * -990708005;
			local3.anInt1503 = (arg4.anInt5542 * 925162477 << 9) * -2034082261;
			if (arg4.anIntArray511 != null) {
				local3.aBoolean328 = true;
				local3.method13438();
			}
			if (local3.anIntArray197 != null) {
				local3.anInt1501 = (local3.anInt1505 * -1089168257 + (int) (Math.random() * (double) (local3.anInt1506 * 1512108791 - local3.anInt1505 * -1089168257))) * 835810559;
			}
			aClass695_20.method36383(local3);
			Class94_Sub4.aClass261_1.method26315(local3.anInt1502 * -241175639);
			Class94_Sub4.aClass261_1.method26314(local3.anIntArray197);
		} else if (arg5 != null) {
			local3.aClass104_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(192) Class333 local192 = arg5.aClass333_1;
			if (local192.anIntArray437 != null) {
				local3.aBoolean328 = true;
				local192 = local192.method27642(Class55.aClass124_1, Class55.aClass124_1);
			}
			if (local192 != null) {
				local3.anInt1492 = (local192.anInt4117 * -1821838479 + arg1 << 9) * -800010841;
				local3.anInt1493 = (local192.anInt4117 * -1821838479 + arg2 << 9) * 1156683381;
				local3.anInt1502 = Class334.method27667(arg5) * 1086873753;
				local3.anInt1488 = (local192.anInt4121 * -869231065 << 9) * -612932795;
				local3.anInt1495 = local192.anInt4122 * 1689126761;
				local3.anInt1504 = local192.anInt4127 * 932822485;
				local3.anInt1496 = local192.anInt4126 * -32158863;
				local3.anInt1503 = (local192.anInt4102 * -1156607845 << 9) * -2034082261;
				Class94_Sub4.aClass261_1.method26315(local192.anInt4108 * 1315529581);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4118 * 1912925203);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4119 * 1144816973);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4120 * -306882215);
			}
			aClass695_21.method36383(local3);
		} else if (arg6 != null) {
			local3.aClass104_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1492 = (arg1 + arg6.method21095() << 9) * -800010841;
			local3.anInt1493 = (arg2 + arg6.method21095() << 9) * 1156683381;
			local3.anInt1502 = Class110.method9160(arg6) * 1086873753;
			local3.anInt1488 = (arg6.anInt2914 * -785793877 << 9) * -612932795;
			local3.anInt1495 = arg6.anInt2905 * -908420807;
			local3.anInt1504 = 1916307200;
			local3.anInt1496 = 665776896;
			local3.anInt1503 = 0;
			aClass12_12.method184(local3, (long) (arg6.anInt2867 * 1126388985));
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2915 * -729876395);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2909 * -2046269725);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2913 * 1734964233);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2916 * -510526957);
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ai", descriptor = "(IIIILclient!vm;Lclient!apo;Lclient!apv;)V", line = 166)
	public static void method13441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class599 arg4, @OriginalArg(5) Class104_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class104_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(3) Class77_Sub16 local3 = new Class77_Sub16();
		local3.anInt1489 = arg0 * -1178810913;
		local3.anInt1490 = (arg1 << 9) * -973592293;
		local3.anInt1491 = (arg2 << 9) * -1604946927;
		if (arg4 != null) {
			local3.aClass599_1 = arg4;
			@Pc(32) int local32 = arg4.anInt5516 * -1082258489;
			@Pc(37) int local37 = arg4.anInt5529 * -1990374967;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg4.anInt5529 * -1990374967;
				local37 = arg4.anInt5516 * -1082258489;
			}
			local3.anInt1492 = (local32 + arg1 << 9) * -800010841;
			local3.anInt1493 = (local37 + arg2 << 9) * 1156683381;
			local3.anInt1502 = arg4.anInt5540 * 1128583165;
			local3.anInt1488 = (arg4.anInt5541 * 372226515 << 9) * -612932795;
			local3.anInt1495 = arg4.anInt5543 * 1993106295;
			local3.anInt1505 = arg4.anInt5523 * 617813239;
			local3.anInt1506 = arg4.anInt5545 * 1071004077;
			local3.anIntArray197 = arg4.anIntArray512;
			local3.anInt1504 = arg4.anInt5547 * -1005766001;
			local3.anInt1496 = arg4.anInt5514 * -990708005;
			local3.anInt1503 = (arg4.anInt5542 * 925162477 << 9) * -2034082261;
			if (arg4.anIntArray511 != null) {
				local3.aBoolean328 = true;
				local3.method13438();
			}
			if (local3.anIntArray197 != null) {
				local3.anInt1501 = (local3.anInt1505 * -1089168257 + (int) (Math.random() * (double) (local3.anInt1506 * 1512108791 - local3.anInt1505 * -1089168257))) * 835810559;
			}
			aClass695_20.method36383(local3);
			Class94_Sub4.aClass261_1.method26315(local3.anInt1502 * -241175639);
			Class94_Sub4.aClass261_1.method26314(local3.anIntArray197);
		} else if (arg5 != null) {
			local3.aClass104_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(192) Class333 local192 = arg5.aClass333_1;
			if (local192.anIntArray437 != null) {
				local3.aBoolean328 = true;
				local192 = local192.method27642(Class55.aClass124_1, Class55.aClass124_1);
			}
			if (local192 != null) {
				local3.anInt1492 = (local192.anInt4117 * -1821838479 + arg1 << 9) * -800010841;
				local3.anInt1493 = (local192.anInt4117 * -1821838479 + arg2 << 9) * 1156683381;
				local3.anInt1502 = Class334.method27667(arg5) * 1086873753;
				local3.anInt1488 = (local192.anInt4121 * -869231065 << 9) * -612932795;
				local3.anInt1495 = local192.anInt4122 * 1689126761;
				local3.anInt1504 = local192.anInt4127 * 932822485;
				local3.anInt1496 = local192.anInt4126 * -32158863;
				local3.anInt1503 = (local192.anInt4102 * -1156607845 << 9) * -2034082261;
				Class94_Sub4.aClass261_1.method26315(local192.anInt4108 * 1315529581);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4118 * 1912925203);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4119 * 1144816973);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4120 * -306882215);
			}
			aClass695_21.method36383(local3);
		} else if (arg6 != null) {
			local3.aClass104_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1492 = (arg1 + arg6.method21095() << 9) * -800010841;
			local3.anInt1493 = (arg2 + arg6.method21095() << 9) * 1156683381;
			local3.anInt1502 = Class110.method9160(arg6) * 1086873753;
			local3.anInt1488 = (arg6.anInt2914 * -785793877 << 9) * -612932795;
			local3.anInt1495 = arg6.anInt2905 * -908420807;
			local3.anInt1504 = 1916307200;
			local3.anInt1496 = 665776896;
			local3.anInt1503 = 0;
			aClass12_12.method184(local3, (long) (arg6.anInt2867 * 1126388985));
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2915 * -729876395);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2909 * -2046269725);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2913 * 1734964233);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2916 * -510526957);
		}
	}

	@OriginalMember(owner = "client!ajo", name = "aj", descriptor = "(IIIILclient!vm;Lclient!apo;Lclient!apv;)V", line = 166)
	public static void method13442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class599 arg4, @OriginalArg(5) Class104_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class104_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(3) Class77_Sub16 local3 = new Class77_Sub16();
		local3.anInt1489 = arg0 * -1178810913;
		local3.anInt1490 = (arg1 << 9) * -973592293;
		local3.anInt1491 = (arg2 << 9) * -1604946927;
		if (arg4 != null) {
			local3.aClass599_1 = arg4;
			@Pc(32) int local32 = arg4.anInt5516 * -1082258489;
			@Pc(37) int local37 = arg4.anInt5529 * -1990374967;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg4.anInt5529 * -1990374967;
				local37 = arg4.anInt5516 * -1082258489;
			}
			local3.anInt1492 = (local32 + arg1 << 9) * -800010841;
			local3.anInt1493 = (local37 + arg2 << 9) * 1156683381;
			local3.anInt1502 = arg4.anInt5540 * 1128583165;
			local3.anInt1488 = (arg4.anInt5541 * 372226515 << 9) * -612932795;
			local3.anInt1495 = arg4.anInt5543 * 1993106295;
			local3.anInt1505 = arg4.anInt5523 * 617813239;
			local3.anInt1506 = arg4.anInt5545 * 1071004077;
			local3.anIntArray197 = arg4.anIntArray512;
			local3.anInt1504 = arg4.anInt5547 * -1005766001;
			local3.anInt1496 = arg4.anInt5514 * -990708005;
			local3.anInt1503 = (arg4.anInt5542 * 925162477 << 9) * -2034082261;
			if (arg4.anIntArray511 != null) {
				local3.aBoolean328 = true;
				local3.method13438();
			}
			if (local3.anIntArray197 != null) {
				local3.anInt1501 = (local3.anInt1505 * -1089168257 + (int) (Math.random() * (double) (local3.anInt1506 * 1512108791 - local3.anInt1505 * -1089168257))) * 835810559;
			}
			aClass695_20.method36383(local3);
			Class94_Sub4.aClass261_1.method26315(local3.anInt1502 * -241175639);
			Class94_Sub4.aClass261_1.method26314(local3.anIntArray197);
		} else if (arg5 != null) {
			local3.aClass104_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(192) Class333 local192 = arg5.aClass333_1;
			if (local192.anIntArray437 != null) {
				local3.aBoolean328 = true;
				local192 = local192.method27642(Class55.aClass124_1, Class55.aClass124_1);
			}
			if (local192 != null) {
				local3.anInt1492 = (local192.anInt4117 * -1821838479 + arg1 << 9) * -800010841;
				local3.anInt1493 = (local192.anInt4117 * -1821838479 + arg2 << 9) * 1156683381;
				local3.anInt1502 = Class334.method27667(arg5) * 1086873753;
				local3.anInt1488 = (local192.anInt4121 * -869231065 << 9) * -612932795;
				local3.anInt1495 = local192.anInt4122 * 1689126761;
				local3.anInt1504 = local192.anInt4127 * 932822485;
				local3.anInt1496 = local192.anInt4126 * -32158863;
				local3.anInt1503 = (local192.anInt4102 * -1156607845 << 9) * -2034082261;
				Class94_Sub4.aClass261_1.method26315(local192.anInt4108 * 1315529581);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4118 * 1912925203);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4119 * 1144816973);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4120 * -306882215);
			}
			aClass695_21.method36383(local3);
		} else if (arg6 != null) {
			local3.aClass104_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1492 = (arg1 + arg6.method21095() << 9) * -800010841;
			local3.anInt1493 = (arg2 + arg6.method21095() << 9) * 1156683381;
			local3.anInt1502 = Class110.method9160(arg6) * 1086873753;
			local3.anInt1488 = (arg6.anInt2914 * -785793877 << 9) * -612932795;
			local3.anInt1495 = arg6.anInt2905 * -908420807;
			local3.anInt1504 = 1916307200;
			local3.anInt1496 = 665776896;
			local3.anInt1503 = 0;
			aClass12_12.method184(local3, (long) (arg6.anInt2867 * 1126388985));
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2915 * -729876395);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2909 * -2046269725);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2913 * 1734964233);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2916 * -510526957);
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ag", descriptor = "(IIILclient!vm;)V", line = 240)
	public static void method13443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class599 arg3) {
		for (@Pc(4) Class77_Sub16 local4 = (Class77_Sub16) aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_20.method36406()) {
			if (local4.anInt1489 * 377042463 == arg0 && arg1 << 9 == local4.anInt1490 * 1285097747 && arg2 << 9 == local4.anInt1491 * -1700987663 && arg3.anInt5510 * -1562722583 == local4.aClass599_1.anInt5510 * -1562722583) {
				if (local4.aClass496_3 != null) {
					local4.aClass496_3.method30100(100);
					Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
					local4.aClass496_3 = null;
				}
				local4.method24063();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ajo", name = "al", descriptor = "(IIILclient!vm;)V", line = 240)
	public static void method13444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class599 arg3) {
		for (@Pc(4) Class77_Sub16 local4 = (Class77_Sub16) aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_20.method36406()) {
			if (local4.anInt1489 * 377042463 == arg0 && arg1 << 9 == local4.anInt1490 * 1285097747 && arg2 << 9 == local4.anInt1491 * -1700987663 && arg3.anInt5510 * -1562722583 == local4.aClass599_1.anInt5510 * -1562722583) {
				if (local4.aClass496_3 != null) {
					local4.aClass496_3.method30100(100);
					Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
					local4.aClass496_3 = null;
				}
				local4.method24063();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ao", descriptor = "(IIILclient!vm;)V", line = 240)
	public static void method13445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class599 arg3) {
		for (@Pc(4) Class77_Sub16 local4 = (Class77_Sub16) aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_20.method36406()) {
			if (local4.anInt1489 * 377042463 == arg0 && arg1 << 9 == local4.anInt1490 * 1285097747 && arg2 << 9 == local4.anInt1491 * -1700987663 && arg3.anInt5510 * -1562722583 == local4.aClass599_1.anInt5510 * -1562722583) {
				if (local4.aClass496_3 != null) {
					local4.aClass496_3.method30100(100);
					Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
					local4.aClass496_3 = null;
				}
				local4.method24063();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ax", descriptor = "(Lclient!apo;)V", line = 254)
	public static void method13446(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class77_Sub16 local4 = (Class77_Sub16) aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_21.method36406()) {
			if (local4.aClass104_Sub1_Sub1_Sub1_Sub1_1 == arg0) {
				if (local4.aClass496_3 != null) {
					local4.aClass496_3.method30100(100);
					Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
					local4.aClass496_3 = null;
				}
				local4.method24063();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ak", descriptor = "(Lclient!apo;)V", line = 254)
	public static void method13447(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class77_Sub16 local4 = (Class77_Sub16) aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_21.method36406()) {
			if (local4.aClass104_Sub1_Sub1_Sub1_Sub1_1 == arg0) {
				if (local4.aClass496_3 != null) {
					local4.aClass496_3.method30100(100);
					Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
					local4.aClass496_3 = null;
				}
				local4.method24063();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ajo", name = "au", descriptor = "(Lclient!apo;)V", line = 254)
	public static void method13448(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class77_Sub16 local4 = (Class77_Sub16) aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_21.method36406()) {
			if (local4.aClass104_Sub1_Sub1_Sub1_Sub1_1 == arg0) {
				if (local4.aClass496_3 != null) {
					local4.aClass496_3.method30100(100);
					Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
					local4.aClass496_3 = null;
				}
				local4.method24063();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ar", descriptor = "(Lclient!apv;)V", line = 268)
	public static void method13449(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class77_Sub16 local8 = (Class77_Sub16) aClass12_12.method173((long) (arg0.anInt2867 * 1126388985));
		if (local8 == null) {
			return;
		}
		if (local8.aClass496_3 != null) {
			local8.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(local8.aClass496_3);
			local8.aClass496_3 = null;
		}
		local8.method24063();
	}

	@OriginalMember(owner = "client!ajo", name = "ad", descriptor = "(Lclient!apv;)V", line = 268)
	public static void method13450(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class77_Sub16 local8 = (Class77_Sub16) aClass12_12.method173((long) (arg0.anInt2867 * 1126388985));
		if (local8 == null) {
			return;
		}
		if (local8.aClass496_3 != null) {
			local8.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(local8.aClass496_3);
			local8.aClass496_3 = null;
		}
		local8.method24063();
	}

	@OriginalMember(owner = "client!ajo", name = "ac", descriptor = "(Lclient!apv;)V", line = 280)
	public static void method13451(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class77_Sub16 local8 = (Class77_Sub16) aClass12_12.method173((long) (arg0.anInt2867 * 1126388985));
		if (local8 == null) {
			Class458.method29495(arg0.aByte100, arg0.anIntArray274[0], arg0.anIntArray275[0], 0, null, null, arg0);
		} else {
			local8.method13438();
		}
	}

	@OriginalMember(owner = "client!ajo", name = "av", descriptor = "(Lclient!apo;)I", line = 286)
	static int method13452(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class333 local2 = arg0.aClass333_1;
		if (local2.anIntArray437 != null) {
			local2 = local2.method27642(Class55.aClass124_1, Class55.aClass124_1);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(20) int local20 = local2.anInt4119 * 1144816973;
		@Pc(24) Class570 local24 = arg0.method21105();
		@Pc(29) int local29 = arg0.aClass151_Sub1_3.method23399();
		if (local29 == -1 || arg0.aClass151_Sub1_3.aBoolean363) {
			local20 = local2.anInt4108 * 1315529581;
		} else if (local29 == local24.anInt5365 * 1074876801 || local24.anInt5356 * 421310407 == local29 || local29 == local24.anInt5358 * 541177679 || local24.anInt5357 * -921167219 == local29) {
			local20 = local2.anInt4120 * -306882215;
		} else if (local24.anInt5359 * 1846476627 == local29 || local29 == local24.anInt5362 * -63558043 || local24.anInt5370 * -1045334803 == local29 || local29 == local24.anInt5360 * 630970333) {
			local20 = local2.anInt4118 * 1912925203;
		}
		return local20;
	}

	@OriginalMember(owner = "client!ajo", name = "at", descriptor = "(Lclient!apv;)I", line = 301)
	static int method13453(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt2913 * 1734964233;
		@Pc(8) Class570 local8 = arg0.method21105();
		@Pc(13) int local13 = arg0.aClass151_Sub1_3.method23399();
		if (local13 == -1 || arg0.aClass151_Sub1_3.aBoolean363) {
			local4 = arg0.anInt2915 * -729876395;
		} else if (local8.anInt5365 * 1074876801 == local13 || local8.anInt5356 * 421310407 == local13 || local13 == local8.anInt5358 * 541177679 || local8.anInt5357 * -921167219 == local13) {
			local4 = arg0.anInt2916 * -510526957;
		} else if (local13 == local8.anInt5359 * 1846476627 || local8.anInt5362 * -63558043 == local13 || local8.anInt5370 * -1045334803 == local13 || local8.anInt5360 * 630970333 == local13) {
			local4 = arg0.anInt2909 * -2046269725;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ajo", name = "ae", descriptor = "(IIII)V", line = 311)
	public static void method13454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub16 local4;
		for (local4 = (Class77_Sub16) aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_20.method36406()) {
			Class273.method26541(local4, arg0, arg1, arg2, arg3);
		}
		@Pc(29) byte local29;
		@Pc(34) Class570 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(219) Class447 local219;
		for (local4 = (Class77_Sub16) aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) aClass695_21.method36406()) {
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
		for (local4 = (Class77_Sub16) aClass12_12.method190(); local4 != null; local4 = (Class77_Sub16) aClass12_12.method192()) {
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

	@OriginalMember(owner = "client!ajo", name = "ah", descriptor = "(Lclient!ajo;IIII)V", line = 405)
	static void method13455(@OriginalArg(0) Class77_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		if (-241175639 * arg0.anInt1502 == -1 && arg0.anIntArray197 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1495 * 63994171;
		if (arg0.anInt1488 * 984135565 != 0 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() != 0 && arg0.anInt1489 * 377042463 == arg1) {
			if (arg0.aClass496_3 != null && (arg0.aClass496_3.method30110() == Class486.aClass486_3 || arg0.aClass496_3.method30110() == Class486.aClass486_7)) {
				Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
				arg0.aClass496_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(203) int local203;
			if (arg0.aClass496_3 != null) {
				local203 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F + (float) (arg0.anInt1491 * -1700987663));
				arg0.aClass447_45.aFloat277 = local203;
				arg0.aClass447_45.aFloat278 = local102;
			} else if (arg0.anInt1502 * -241175639 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local122 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_45.aFloat277 = local102;
				arg0.aClass447_45.aFloat278 = local122;
				arg0.aClass496_3 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_2, arg0, arg0.anInt1502 * -241175639, -1, 0, Class220.aClass220_10.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565), arg0.aClass447_45, 0, local82, false);
				if (arg0.aClass496_3 != null) {
					@Pc(172) float local172 = (float) local14 / 255.0F;
					arg0.aClass496_3.method30155(local172, 150);
					arg0.aClass496_3.method30099();
				}
			}
			if (arg0.aClass496_4 != null) {
				local203 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local102 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local203;
				arg0.aClass447_46.aFloat278 = local102;
				if (arg0.aClass496_4.method30110() == Class486.aClass486_3 || arg0.aClass496_4.method30110() == Class486.aClass486_7) {
					Class94_Sub4.aClass261_1.method26325(arg0.aClass496_4);
					arg0.aClass496_4 = null;
				}
			} else if (arg0.anIntArray197 != null && (arg0.anInt1501 -= arg2 * 835810559) * 1102416639 <= 0) {
				local203 = arg0.anInt1504 * -1536094921 == 256 && arg0.anInt1496 * 1762794043 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1504 * -1536094921 - arg0.anInt1496 * 1762794043)) + arg0.anInt1496 * 1762794043;
				local102 = (int) (Math.random() * (double) arg0.anIntArray197.length);
				local122 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				@Pc(332) int local332 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local122;
				arg0.aClass447_46.aFloat278 = local332;
				arg0.aClass496_4 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_3, arg0, arg0.anIntArray197[local102], 0, local14, Class220.aClass220_1.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565 + arg0.anInt1503 * -1081773949), arg0.aClass447_46, 0, local203, false);
				if (arg0.aClass496_4 != null) {
					arg0.aClass496_4.method30099();
				}
				arg0.anInt1501 = (arg0.anInt1505 * -1089168257 + (int) (Math.random() * (double) (arg0.anInt1506 * 1512108791 - arg0.anInt1505 * -1089168257))) * 835810559;
			}
		} else if (arg0.aClass496_3 != null) {
			arg0.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
			arg0.aClass496_3 = null;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "aq", descriptor = "(Lclient!ajo;IIII)V", line = 405)
	static void method13456(@OriginalArg(0) Class77_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		if (-241175639 * arg0.anInt1502 == -1 && arg0.anIntArray197 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1495 * 63994171;
		if (arg0.anInt1488 * 984135565 != 0 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() != 0 && arg0.anInt1489 * 377042463 == arg1) {
			if (arg0.aClass496_3 != null && (arg0.aClass496_3.method30110() == Class486.aClass486_3 || arg0.aClass496_3.method30110() == Class486.aClass486_7)) {
				Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
				arg0.aClass496_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(203) int local203;
			if (arg0.aClass496_3 != null) {
				local203 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F + (float) (arg0.anInt1491 * -1700987663));
				arg0.aClass447_45.aFloat277 = local203;
				arg0.aClass447_45.aFloat278 = local102;
			} else if (arg0.anInt1502 * -241175639 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local122 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_45.aFloat277 = local102;
				arg0.aClass447_45.aFloat278 = local122;
				arg0.aClass496_3 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_2, arg0, arg0.anInt1502 * -241175639, -1, 0, Class220.aClass220_10.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565), arg0.aClass447_45, 0, local82, false);
				if (arg0.aClass496_3 != null) {
					@Pc(172) float local172 = (float) local14 / 255.0F;
					arg0.aClass496_3.method30155(local172, 150);
					arg0.aClass496_3.method30099();
				}
			}
			if (arg0.aClass496_4 != null) {
				local203 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local102 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local203;
				arg0.aClass447_46.aFloat278 = local102;
				if (arg0.aClass496_4.method30110() == Class486.aClass486_3 || arg0.aClass496_4.method30110() == Class486.aClass486_7) {
					Class94_Sub4.aClass261_1.method26325(arg0.aClass496_4);
					arg0.aClass496_4 = null;
				}
			} else if (arg0.anIntArray197 != null && (arg0.anInt1501 -= arg2 * 835810559) * 1102416639 <= 0) {
				local203 = arg0.anInt1504 * -1536094921 == 256 && arg0.anInt1496 * 1762794043 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1504 * -1536094921 - arg0.anInt1496 * 1762794043)) + arg0.anInt1496 * 1762794043;
				local102 = (int) (Math.random() * (double) arg0.anIntArray197.length);
				local122 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				@Pc(332) int local332 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local122;
				arg0.aClass447_46.aFloat278 = local332;
				arg0.aClass496_4 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_3, arg0, arg0.anIntArray197[local102], 0, local14, Class220.aClass220_1.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565 + arg0.anInt1503 * -1081773949), arg0.aClass447_46, 0, local203, false);
				if (arg0.aClass496_4 != null) {
					arg0.aClass496_4.method30099();
				}
				arg0.anInt1501 = (arg0.anInt1505 * -1089168257 + (int) (Math.random() * (double) (arg0.anInt1506 * 1512108791 - arg0.anInt1505 * -1089168257))) * 835810559;
			}
		} else if (arg0.aClass496_3 != null) {
			arg0.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
			arg0.aClass496_3 = null;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "as", descriptor = "(Lclient!ajo;IIII)V", line = 405)
	static void method13457(@OriginalArg(0) Class77_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		if (-241175639 * arg0.anInt1502 == -1 && arg0.anIntArray197 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1495 * 63994171;
		if (arg0.anInt1488 * 984135565 != 0 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() != 0 && arg0.anInt1489 * 377042463 == arg1) {
			if (arg0.aClass496_3 != null && (arg0.aClass496_3.method30110() == Class486.aClass486_3 || arg0.aClass496_3.method30110() == Class486.aClass486_7)) {
				Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
				arg0.aClass496_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(203) int local203;
			if (arg0.aClass496_3 != null) {
				local203 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F + (float) (arg0.anInt1491 * -1700987663));
				arg0.aClass447_45.aFloat277 = local203;
				arg0.aClass447_45.aFloat278 = local102;
			} else if (arg0.anInt1502 * -241175639 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local122 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_45.aFloat277 = local102;
				arg0.aClass447_45.aFloat278 = local122;
				arg0.aClass496_3 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_2, arg0, arg0.anInt1502 * -241175639, -1, 0, Class220.aClass220_10.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565), arg0.aClass447_45, 0, local82, false);
				if (arg0.aClass496_3 != null) {
					@Pc(172) float local172 = (float) local14 / 255.0F;
					arg0.aClass496_3.method30155(local172, 150);
					arg0.aClass496_3.method30099();
				}
			}
			if (arg0.aClass496_4 != null) {
				local203 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local102 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local203;
				arg0.aClass447_46.aFloat278 = local102;
				if (arg0.aClass496_4.method30110() == Class486.aClass486_3 || arg0.aClass496_4.method30110() == Class486.aClass486_7) {
					Class94_Sub4.aClass261_1.method26325(arg0.aClass496_4);
					arg0.aClass496_4 = null;
				}
			} else if (arg0.anIntArray197 != null && (arg0.anInt1501 -= arg2 * 835810559) * 1102416639 <= 0) {
				local203 = arg0.anInt1504 * -1536094921 == 256 && arg0.anInt1496 * 1762794043 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1504 * -1536094921 - arg0.anInt1496 * 1762794043)) + arg0.anInt1496 * 1762794043;
				local102 = (int) (Math.random() * (double) arg0.anIntArray197.length);
				local122 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				@Pc(332) int local332 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local122;
				arg0.aClass447_46.aFloat278 = local332;
				arg0.aClass496_4 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_3, arg0, arg0.anIntArray197[local102], 0, local14, Class220.aClass220_1.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565 + arg0.anInt1503 * -1081773949), arg0.aClass447_46, 0, local203, false);
				if (arg0.aClass496_4 != null) {
					arg0.aClass496_4.method30099();
				}
				arg0.anInt1501 = (arg0.anInt1505 * -1089168257 + (int) (Math.random() * (double) (arg0.anInt1506 * 1512108791 - arg0.anInt1505 * -1089168257))) * 835810559;
			}
		} else if (arg0.aClass496_3 != null) {
			arg0.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
			arg0.aClass496_3 = null;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ay", descriptor = "(Lclient!ajo;IIII)V", line = 405)
	static void method13458(@OriginalArg(0) Class77_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		if (-241175639 * arg0.anInt1502 == -1 && arg0.anIntArray197 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1495 * 63994171;
		if (arg0.anInt1488 * 984135565 != 0 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() != 0 && arg0.anInt1489 * 377042463 == arg1) {
			if (arg0.aClass496_3 != null && (arg0.aClass496_3.method30110() == Class486.aClass486_3 || arg0.aClass496_3.method30110() == Class486.aClass486_7)) {
				Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
				arg0.aClass496_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(203) int local203;
			if (arg0.aClass496_3 != null) {
				local203 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F + (float) (arg0.anInt1491 * -1700987663));
				arg0.aClass447_45.aFloat277 = local203;
				arg0.aClass447_45.aFloat278 = local102;
			} else if (arg0.anInt1502 * -241175639 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local122 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_45.aFloat277 = local102;
				arg0.aClass447_45.aFloat278 = local122;
				arg0.aClass496_3 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_2, arg0, arg0.anInt1502 * -241175639, -1, 0, Class220.aClass220_10.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565), arg0.aClass447_45, 0, local82, false);
				if (arg0.aClass496_3 != null) {
					@Pc(172) float local172 = (float) local14 / 255.0F;
					arg0.aClass496_3.method30155(local172, 150);
					arg0.aClass496_3.method30099();
				}
			}
			if (arg0.aClass496_4 != null) {
				local203 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local102 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local203;
				arg0.aClass447_46.aFloat278 = local102;
				if (arg0.aClass496_4.method30110() == Class486.aClass486_3 || arg0.aClass496_4.method30110() == Class486.aClass486_7) {
					Class94_Sub4.aClass261_1.method26325(arg0.aClass496_4);
					arg0.aClass496_4 = null;
				}
			} else if (arg0.anIntArray197 != null && (arg0.anInt1501 -= arg2 * 835810559) * 1102416639 <= 0) {
				local203 = arg0.anInt1504 * -1536094921 == 256 && arg0.anInt1496 * 1762794043 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1504 * -1536094921 - arg0.anInt1496 * 1762794043)) + arg0.anInt1496 * 1762794043;
				local102 = (int) (Math.random() * (double) arg0.anIntArray197.length);
				local122 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				@Pc(332) int local332 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local122;
				arg0.aClass447_46.aFloat278 = local332;
				arg0.aClass496_4 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_3, arg0, arg0.anIntArray197[local102], 0, local14, Class220.aClass220_1.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565 + arg0.anInt1503 * -1081773949), arg0.aClass447_46, 0, local203, false);
				if (arg0.aClass496_4 != null) {
					arg0.aClass496_4.method30099();
				}
				arg0.anInt1501 = (arg0.anInt1505 * -1089168257 + (int) (Math.random() * (double) (arg0.anInt1506 * 1512108791 - arg0.anInt1505 * -1089168257))) * 835810559;
			}
		} else if (arg0.aClass496_3 != null) {
			arg0.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
			arg0.aClass496_3 = null;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "am", descriptor = "(Lclient!ajo;IIII)V", line = 405)
	static void method13459(@OriginalArg(0) Class77_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		if (-241175639 * arg0.anInt1502 == -1 && arg0.anIntArray197 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1495 * 63994171;
		if (arg0.anInt1488 * 984135565 != 0 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() != 0 && arg0.anInt1489 * 377042463 == arg1) {
			if (arg0.aClass496_3 != null && (arg0.aClass496_3.method30110() == Class486.aClass486_3 || arg0.aClass496_3.method30110() == Class486.aClass486_7)) {
				Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
				arg0.aClass496_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(203) int local203;
			if (arg0.aClass496_3 != null) {
				local203 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F + (float) (arg0.anInt1491 * -1700987663));
				arg0.aClass447_45.aFloat277 = local203;
				arg0.aClass447_45.aFloat278 = local102;
			} else if (arg0.anInt1502 * -241175639 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local122 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_45.aFloat277 = local102;
				arg0.aClass447_45.aFloat278 = local122;
				arg0.aClass496_3 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_2, arg0, arg0.anInt1502 * -241175639, -1, 0, Class220.aClass220_10.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565), arg0.aClass447_45, 0, local82, false);
				if (arg0.aClass496_3 != null) {
					@Pc(172) float local172 = (float) local14 / 255.0F;
					arg0.aClass496_3.method30155(local172, 150);
					arg0.aClass496_3.method30099();
				}
			}
			if (arg0.aClass496_4 != null) {
				local203 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local102 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local203;
				arg0.aClass447_46.aFloat278 = local102;
				if (arg0.aClass496_4.method30110() == Class486.aClass486_3 || arg0.aClass496_4.method30110() == Class486.aClass486_7) {
					Class94_Sub4.aClass261_1.method26325(arg0.aClass496_4);
					arg0.aClass496_4 = null;
				}
			} else if (arg0.anIntArray197 != null && (arg0.anInt1501 -= arg2 * 835810559) * 1102416639 <= 0) {
				local203 = arg0.anInt1504 * -1536094921 == 256 && arg0.anInt1496 * 1762794043 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1504 * -1536094921 - arg0.anInt1496 * 1762794043)) + arg0.anInt1496 * 1762794043;
				local102 = (int) (Math.random() * (double) arg0.anIntArray197.length);
				local122 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				@Pc(332) int local332 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local122;
				arg0.aClass447_46.aFloat278 = local332;
				arg0.aClass496_4 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_3, arg0, arg0.anIntArray197[local102], 0, local14, Class220.aClass220_1.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565 + arg0.anInt1503 * -1081773949), arg0.aClass447_46, 0, local203, false);
				if (arg0.aClass496_4 != null) {
					arg0.aClass496_4.method30099();
				}
				arg0.anInt1501 = (arg0.anInt1505 * -1089168257 + (int) (Math.random() * (double) (arg0.anInt1506 * 1512108791 - arg0.anInt1505 * -1089168257))) * 835810559;
			}
		} else if (arg0.aClass496_3 != null) {
			arg0.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
			arg0.aClass496_3 = null;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "mt", descriptor = "(Lclient!yf;I)V", line = 6796)
	static final void method13460(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class419.method28689(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ajo", name = "api", descriptor = "(Lclient!yf;B)V", line = 12268)
	static final void method13461(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(17) int local17 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_5.method15901();
		if (local17 != local12) {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_5, local12);
			Class667.method33150();
			client.aBoolean593 = false;
		}
	}
}
