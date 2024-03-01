package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qx")
class Class420 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!qx", name = "this$0", descriptor = "Lclient!aew;")
	final Class48_Sub2 this$0;

	@OriginalMember(owner = "client!qx", name = "<init>", descriptor = "(Lclient!aew;)V", line = 35)
	Class420(@OriginalArg(0) Class48_Sub2 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!qx", name = "n", descriptor = "()V", line = 39)
	public void method27842() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean229) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class422 local16 = (Class422) local9.next();
						local16.method27854();
					}
					@Pc(25) HashMap local25 = this.this$0.method9537();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class357 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class422 local72 = (Class422) local29.next();
									local72.method27867();
								}
								Class60_Sub11.method13407(6L);
								continue label54;
							}
							local36 = (Class357) local29.next();
						} while (local36.aBoolean722);
						@Pc(46) Class371[] local46 = (Class371[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method27111();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class27_Sub1.method7214(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qx", name = "run", descriptor = "()V", line = 39)
	@Override
	public void run() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean229) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class422 local16 = (Class422) local9.next();
						local16.method27854();
					}
					@Pc(25) HashMap local25 = this.this$0.method9537();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class357 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class422 local72 = (Class422) local29.next();
									local72.method27867();
								}
								Class60_Sub11.method13407(6L);
								continue label54;
							}
							local36 = (Class357) local29.next();
						} while (local36.aBoolean722);
						@Pc(46) Class371[] local46 = (Class371[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method27111();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class27_Sub1.method7214(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qx", name = "j", descriptor = "()V", line = 39)
	public void method27843() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean229) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class422 local16 = (Class422) local9.next();
						local16.method27854();
					}
					@Pc(25) HashMap local25 = this.this$0.method9537();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class357 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class422 local72 = (Class422) local29.next();
									local72.method27867();
								}
								Class60_Sub11.method13407(6L);
								continue label54;
							}
							local36 = (Class357) local29.next();
						} while (local36.aBoolean722);
						@Pc(46) Class371[] local46 = (Class371[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method27111();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class27_Sub1.method7214(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qx", name = "ae", descriptor = "(Lclient!vs;I)V", line = 4153)
	static final void method27846(@OriginalArg(0) Class536 arg0) {
		arg0.aLongArray17[arg0.anIntArray497[arg0.anInt5318 * -2140198955]] = arg0.aLongArray18[(arg0.anInt5316 -= 2125691367) * 196643287];
	}

	@OriginalMember(owner = "client!qx", name = "akn", descriptor = "(Lclient!vs;I)V", line = 11034)
	static final void method27845(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class198 local16 = Class532.method32501(local12);
		if (local16 == null) {
			throw new RuntimeException();
		}
		Class80.aClass23_Sub1_1.method5858(local16);
	}

	@OriginalMember(owner = "client!qx", name = "apr", descriptor = "(Lclient!vs;I)V", line = 11743)
	static final void method27844(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(42) long local42 = Class546.method32646(0, 0, 12, local13, local23, local33);
		@Pc(45) int local45 = Class156.method23185(local42);
		if (local33 < 1970) {
			local45--;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local45;
	}
}
