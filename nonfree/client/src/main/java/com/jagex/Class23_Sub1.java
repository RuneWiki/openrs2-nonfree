package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acb")
public class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!acb", name = "ax", descriptor = "I")
	int anInt590 = 0;

	@OriginalMember(owner = "client!acb", name = "<init>", descriptor = "(Lclient!gg;)V", line = 26)
	public Class23_Sub1(@OriginalArg(0) Interface15 arg0) {
		super(Class212.aClass212_4, arg0);
	}

	@OriginalMember(owner = "client!acb", name = "ea", descriptor = "(I)I", line = 30)
	public int method5946() {
		this.anInt590 += 188109183;
		if (this.anInt590 * 1232563839 == 126) {
			this.anInt590 = 0;
		}
		return this.anInt590 * 1232563839;
	}

	@OriginalMember(owner = "client!acb", name = "ep", descriptor = "()I", line = 30)
	public int method5947() {
		this.anInt590 += 188109183;
		if (this.anInt590 * 1232563839 == 126) {
			this.anInt590 = 0;
		}
		return this.anInt590 * 1232563839;
	}

	@OriginalMember(owner = "client!acb", name = "ed", descriptor = "()I", line = 30)
	public int method5948() {
		this.anInt590 += 188109183;
		if (this.anInt590 * 1232563839 == 126) {
			this.anInt590 = 0;
		}
		return this.anInt590 * 1232563839;
	}

	@OriginalMember(owner = "client!acb", name = "ez", descriptor = "(Lclient!ahb;II)V", line = 36)
	public void method5945(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.anInt2803 * 62066237;
		@Pc(8) int local8 = arg0.method20269();
		this.method5923(Class3_Sub24_Sub5.method18199(local8 & 0x1));
		if ((local8 & 0x8) != 0) {
			@Pc(26) Class208 local26 = Class608.method33569(arg0.method20269());
			if (local26 != this.aClass208_2) {
				try {
					this.method5802(local26, true);
				} catch (@Pc(38) Exception_Sub4 local38) {
					local38.printStackTrace();
				}
			}
		}
		if ((local8 & 0x10) != 0) {
			@Pc(51) Class204 local51 = Class56_Sub1.method11928(arg0.method20269());
			if (local51 != this.aClass204_2) {
				try {
					this.method5872(local51, true);
				} catch (@Pc(63) Exception_Sub4 local63) {
					local63.printStackTrace();
				}
			}
		}
		if ((local8 >> 7 & 0x1) == 1) {
			@Pc(76) int local76 = arg0.method20271();
			if ((local76 >> Class193.aClass193_15.anInt3682 * -1660983619 & 0x1) == 1) {
				this.aClass320_9.method25866(arg0);
			}
			if ((local76 >> Class193.aClass193_2.anInt3682 * -1660983619 & 0x1) == 1) {
				this.aClass320_10.method25866(arg0);
			}
			if ((local76 >> Class193.aClass193_9.anInt3682 * -1660983619 & 0x1) == 1) {
				this.aClass320_11.method25866(arg0);
			}
			if ((local76 >> Class193.aClass193_4.anInt3682 * -1660983619 & 0x1) == 1) {
				this.aClass320_8.method25866(arg0);
			}
			if ((local76 >> Class193.aClass193_5.anInt3682 * -1660983619 & 0x1) == 1) {
				this.aFloat97 = arg0.method20448();
				this.aFloat108 = arg0.method20448();
			}
			if ((local76 >> Class193.aClass193_6.anInt3682 * -1660983619 & 0x1) == 1) {
				this.aFloat109 = arg0.method20448();
				this.aFloat110 = arg0.method20448();
			}
			if ((local76 >> Class193.aClass193_7.anInt3682 * -1660983619 & 0x1) == 1) {
				this.aClass201_2 = Class52.method9917(arg0.method20269());
			}
			if ((local76 >> Class193.aClass193_8.anInt3682 * -1660983619 & 0x1) == 1) {
				this.anInt586 = arg0.method20273() * -406669235;
				arg0.method20269();
			}
			@Pc(224) int local224;
			if ((local76 >> Class193.aClass193_12.anInt3682 * -1660983619 & 0x1) == 1) {
				local224 = arg0.method20269();
				this.aBoolean142 = (local224 & 0x1) == 1;
				this.aBoolean141 = (local224 & 0x2) == 2;
			}
			if ((local76 >> Class193.aClass193_3.anInt3682 * -1660983619 & 0x1) == 1) {
				local224 = arg0.method20269();
				for (@Pc(260) int local260 = 0; local260 < local224; local260++) {
					@Pc(267) int local267 = arg0.method20269();
					@Pc(271) int local271 = arg0.method20269();
					if (local267 == 0) {
						this.method5822(local271);
					} else {
						@Pc(285) Class199 local285 = Class366.method26903(arg0.method20269());
						@Pc(287) boolean local287 = true;
						@Pc(291) Iterator local291 = this.aClass581_4.iterator();
						while (local291.hasNext()) {
							@Pc(298) Class3_Sub1_Sub2 local298 = (Class3_Sub1_Sub2) local291.next();
							if (local271 == local298.anInt2869 * -36949057) {
								local298.method21212(arg0);
								local287 = false;
								break;
							}
						}
						if (local287) {
							this.method5821(Class272.method25326(local271, local285, arg0));
						}
					}
				}
			}
			if ((local76 >> Class193.aClass193_10.anInt3682 * -1660983619 & 0x1) == 1) {
				this.anInt589 = arg0.method20271() * 1822796449;
				this.aFloat111 = arg0.method20448();
			}
			if ((local76 >> Class193.aClass193_11.anInt3682 * -1660983619 & 0x1) == 1) {
				this.aClass198_2 = Class532.method32501(arg0.method20269());
			}
			if ((local76 >> Class193.aClass193_1.anInt3682 * -1660983619 & 0x1) == 1) {
				this.aClass320_13.method25866(arg0);
				this.aClass320_12.method25866(arg0);
				this.aFloat106 = arg0.method20448();
				this.aFloat105 = arg0.method20448();
			}
			if ((local76 >> Class193.aClass193_13.anInt3682 * -1660983619 & 0x1) == 1) {
				arg0.method20448();
			}
			if ((local76 >> Class193.aClass193_14.anInt3682 * -1660983619 & 0x1) == 1) {
				this.aFloat107 = arg0.method20448();
			}
		}
		if (this.aClass69_2 != null && (local8 >> 5 & 0x1) == 1) {
			this.aClass69_2.method20207(arg0);
		}
		if (this.aClass30_2 != null && (local8 >> 6 & 0x1) == 1) {
			this.aClass30_2.method16431(arg0);
		}
		if (arg1 != arg0.anInt2803 * 62066237 - local4) {
			throw new RuntimeException(arg0.anInt2803 * 62066237 - local4 + "," + arg1);
		}
	}
}
