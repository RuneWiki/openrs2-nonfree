package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
class Class577 implements Runnable {

	@OriginalMember(owner = "client!tp", name = "gp", descriptor = "Lclient!py;")
	public static Class497 aClass497_130;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tp", name = "this$0", descriptor = "Lclient!aiz;")
	final Class146_Sub2 this$0;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!aiz;)V", line = 35)
	Class577(@OriginalArg(0) Class146_Sub2 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "()V", line = 39)
	public void method31352() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean260) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class580 local16 = (Class580) local9.next();
						local16.method31375();
					}
					@Pc(25) HashMap local25 = this.this$0.method11705();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class508 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class580 local72 = (Class580) local29.next();
									local72.method31376();
								}
								Class212.method25439(6L);
								continue label54;
							}
							local36 = (Class508) local29.next();
						} while (local36.aBoolean786);
						@Pc(46) Class535[] local46 = (Class535[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method30658();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class646.method32610(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "run", descriptor = "()V", line = 39)
	@Override
	public void run() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean260) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class580 local16 = (Class580) local9.next();
						local16.method31375();
					}
					@Pc(25) HashMap local25 = this.this$0.method11705();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class508 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class580 local72 = (Class580) local29.next();
									local72.method31376();
								}
								Class212.method25439(6L);
								continue label54;
							}
							local36 = (Class508) local29.next();
						} while (local36.aBoolean786);
						@Pc(46) Class535[] local46 = (Class535[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method30658();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class646.method32610(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "()V", line = 39)
	public void method31353() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean260) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class580 local16 = (Class580) local9.next();
						local16.method31375();
					}
					@Pc(25) HashMap local25 = this.this$0.method11705();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class508 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class580 local72 = (Class580) local29.next();
									local72.method31376();
								}
								Class212.method25439(6L);
								continue label54;
							}
							local36 = (Class508) local29.next();
						} while (local36.aBoolean786);
						@Pc(46) Class535[] local46 = (Class535[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method30658();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class646.method32610(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "()V", line = 39)
	public void method31354() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean260) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class580 local16 = (Class580) local9.next();
						local16.method31375();
					}
					@Pc(25) HashMap local25 = this.this$0.method11705();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class508 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class580 local72 = (Class580) local29.next();
									local72.method31376();
								}
								Class212.method25439(6L);
								continue label54;
							}
							local36 = (Class508) local29.next();
						} while (local36.aBoolean786);
						@Pc(46) Class535[] local46 = (Class535[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method30658();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class646.method32610(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "()V", line = 39)
	public void method31355() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean260) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class580 local16 = (Class580) local9.next();
						local16.method31375();
					}
					@Pc(25) HashMap local25 = this.this$0.method11705();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class508 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class580 local72 = (Class580) local29.next();
									local72.method31376();
								}
								Class212.method25439(6L);
								continue label54;
							}
							local36 = (Class508) local29.next();
						} while (local36.aBoolean786);
						@Pc(46) Class535[] local46 = (Class535[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method30658();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class646.method32610(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "bw", descriptor = "(Lclient!hf;Lclient!yf;I)V", line = 5187)
	static final void method31357(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1) {
		if (client.method25238(arg0).method13618() && client.aClass312_7 == null) {
			Class1.method16(arg0.anInt3953 * -1549590237, arg0.anInt3970 * 532402067);
			client.aClass312_7 = Class124_Sub2.method9308(arg0.anInt3953 * -1549590237, arg0.anInt3970 * 532402067);
			Class354.method27696(client.aClass312_7);
		}
	}

	@OriginalMember(owner = "client!tp", name = "gs", descriptor = "(Lclient!yf;I)V", line = 6150)
	static final void method31358(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class47.method958(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!tp", name = "bff", descriptor = "(Lclient!yf;I)V", line = 15111)
	static final void method31356(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
