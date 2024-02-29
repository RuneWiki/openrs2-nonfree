package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
class Class555 implements Runnable {

	@OriginalMember(owner = "client!tj", name = "hw", descriptor = "Lclient!anz;")
	public static Class35_Sub17 aClass35_Sub17_3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tj", name = "this$0", descriptor = "Lclient!ahe;")
	final Class117_Sub1 this$0;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!ahe;)V", line = 35)
	Class555(@OriginalArg(0) Class117_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "()V", line = 39)
	public void method31073() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean208) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class568 local16 = (Class568) local9.next();
						local16.method31391();
					}
					@Pc(25) HashMap local25 = this.this$0.method10181();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class501 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class568 local72 = (Class568) local29.next();
									local72.method31397();
								}
								Class281.method26679(6L);
								continue label54;
							}
							local36 = (Class501) local29.next();
						} while (local36.aBoolean770);
						@Pc(46) Class485[] local46 = (Class485[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method29940();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class293.method27014(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "()V", line = 39)
	public void method31074() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean208) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class568 local16 = (Class568) local9.next();
						local16.method31391();
					}
					@Pc(25) HashMap local25 = this.this$0.method10181();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class501 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class568 local72 = (Class568) local29.next();
									local72.method31397();
								}
								Class281.method26679(6L);
								continue label54;
							}
							local36 = (Class501) local29.next();
						} while (local36.aBoolean770);
						@Pc(46) Class485[] local46 = (Class485[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method29940();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class293.method27014(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tj", name = "run", descriptor = "()V", line = 39)
	@Override
	public void run() {
		label54: while (true) {
			try {
				if (!this.this$0.aBoolean208) {
					@Pc(9) Iterator local9 = this.this$0.aList1.iterator();
					while (local9.hasNext()) {
						@Pc(16) Class568 local16 = (Class568) local9.next();
						local16.method31391();
					}
					@Pc(25) HashMap local25 = this.this$0.method10181();
					@Pc(29) Iterator local29 = local25.keySet().iterator();
					while (true) {
						@Pc(36) Class501 local36;
						do {
							if (!local29.hasNext()) {
								local29 = this.this$0.aList1.iterator();
								while (local29.hasNext()) {
									@Pc(72) Class568 local72 = (Class568) local29.next();
									local72.method31397();
								}
								Class281.method26679(6L);
								continue label54;
							}
							local36 = (Class501) local29.next();
						} while (local36.aBoolean770);
						@Pc(46) Class485[] local46 = (Class485[]) local25.get(local36);
						for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
							local46[local48].method29940();
						}
					}
				}
			} catch (@Pc(81) Exception local81) {
				Class293.method27014(null, local81);
				local81.printStackTrace();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "(I)V", line = 321)
	public static void method31075() {
		if (Class354.anInterface32Array1 == null) {
			return;
		}
		@Pc(4) Interface32[] local4 = Class354.anInterface32Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface32 local14 = local4[local6];
			local14.method27482();
		}
	}

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "(III)I", line = 1620)
	static final int method31076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg1 * 57 + arg0;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!tj", name = "ff", descriptor = "(Lclient!yf;I)V", line = 5463)
	static final void method31077(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class670.method33196(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!tj", name = "jw", descriptor = "(Lclient!yf;I)V", line = 6212)
	static final void method31078(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class634.method32667(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!tj", name = "uc", descriptor = "(Lclient!yf;I)V", line = 8246)
	static final void method31079(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1853997378;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(53) int local53 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 4];
		@Pc(63) int local63 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 5];
		@Pc(82) Class496 local82 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_10, Class94_Sub4.aClass261_1, local13, local23, local43, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local53, false);
		if (local82 != null) {
			Class94_Sub4.aClass261_1.method26286(local82, local63, local33);
		}
	}

	@OriginalMember(owner = "client!tj", name = "apz", descriptor = "(Lclient!yf;I)V", line = 12311)
	static final void method31080(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}
}
