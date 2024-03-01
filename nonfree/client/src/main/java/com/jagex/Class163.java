package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xb")
public abstract class Class163 {

	@OriginalMember(owner = "client!xb", name = "lr", descriptor = "I")
	public static int anInt2002;

	@OriginalMember(owner = "client!xb", name = "wr", descriptor = "Lclient!x;")
	static Class653 aClass653_3;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "Lclient!aat;")
	final Class22 aClass22_31 = new Class22();

	@OriginalMember(owner = "client!xb", name = "n", descriptor = "J")
	long aLong105 = -8143831586271184505L;

	@OriginalMember(owner = "client!xb", name = "m", descriptor = "J")
	long aLong106 = -8115390464037108609L;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "I")
	int anInt2001 = -1335804931;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	int anInt2000 = 554087135;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "()V", line = 16)
	Class163() {
	}

	@OriginalMember(owner = "client!xb", name = "q", descriptor = "()V", line = 19)
	void method14917() {
		if (this.method14914()) {
			@Pc(5) Class93_Sub22 local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass22_31.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class93_Sub23 local22 = (Class93_Sub23) local15.next();
					if (local5 != null && local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local7 >= 252 - (this.method14905() + 6)) {
						break label100;
					}
					local22.method23969();
					@Pc(47) int local47 = local22.method22874();
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method22873();
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (local62 == this.anInt2001 * 1724450475 && local47 == this.anInt2000 * 1821800161) {
						local22.method22877();
					} else {
						if (local5 == null) {
							local5 = this.method14909();
							local5.aClass93_Sub41_Sub2_1.method22510(0);
							local7 = local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
							local5.aClass93_Sub41_Sub2_1.anInt3070 += 1403713386;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong106 * -1130360274060180351L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt2001 * 1724450475;
							local139 = local47 - this.anInt2000 * 1821800161;
							local151 = (int) ((local22.method22876() - this.aLong106 * -1130360274060180351L) / 20L);
							local9 = (int) ((long) local9 + (local22.method22876() - this.aLong106 * -1130360274060180351L) % 20L);
						}
						this.anInt2001 = local62 * 1335804931;
						this.anInt2000 = local47 * -554087135;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.aClass93_Sub41_Sub2_1.method22454((local132 << 6) + (local151 << 12) + local139);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.aClass93_Sub41_Sub2_1.method22510(local151 + 128);
							local5.aClass93_Sub41_Sub2_1.method22454((local132 << 8) + local139);
						} else if (local151 < 32) {
							local5.aClass93_Sub41_Sub2_1.method22510(local151 + 192);
							if (local62 == -1 || local47 == -1) {
								local5.aClass93_Sub41_Sub2_1.method22395(Integer.MIN_VALUE);
							} else {
								local5.aClass93_Sub41_Sub2_1.method22395(local62 | local47 << 16);
							}
						} else {
							local5.aClass93_Sub41_Sub2_1.method22454((local151 & 0x1FFF) + 57344);
							if (local62 == -1 || local47 == -1) {
								local5.aClass93_Sub41_Sub2_1.method22395(Integer.MIN_VALUE);
							} else {
								local5.aClass93_Sub41_Sub2_1.method22395(local62 | local47 << 16);
							}
						}
						local11++;
						this.method14906(local5.aClass93_Sub41_Sub2_1, local22);
						this.aLong106 = local22.method22876() * 8115390464037108609L;
						local22.method22877();
					}
				}
			}
			if (local5 != null) {
				local5.aClass93_Sub41_Sub2_1.method22537(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local7);
				@Pc(348) int local348 = local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local5.aClass93_Sub41_Sub2_1.anInt3070 = local7 * -1445626955;
				local5.aClass93_Sub41_Sub2_1.method22510(local9 / local11);
				local5.aClass93_Sub41_Sub2_1.method22510(local9 % local11);
				local5.aClass93_Sub41_Sub2_1.anInt3070 = local348 * -1445626955;
				client.aClass175_2.method24351(local5);
			}
		}
		this.method14912();
	}

	@OriginalMember(owner = "client!xb", name = "y", descriptor = "()V", line = 19)
	void method14918() {
		if (this.method14914()) {
			@Pc(5) Class93_Sub22 local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass22_31.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class93_Sub23 local22 = (Class93_Sub23) local15.next();
					if (local5 != null && local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local7 >= 252 - (this.method14905() + 6)) {
						break label100;
					}
					local22.method23969();
					@Pc(47) int local47 = local22.method22874();
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method22873();
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (local62 == this.anInt2001 * 1724450475 && local47 == this.anInt2000 * 1821800161) {
						local22.method22877();
					} else {
						if (local5 == null) {
							local5 = this.method14909();
							local5.aClass93_Sub41_Sub2_1.method22510(0);
							local7 = local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
							local5.aClass93_Sub41_Sub2_1.anInt3070 += 1403713386;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong106 * -1130360274060180351L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt2001 * 1724450475;
							local139 = local47 - this.anInt2000 * 1821800161;
							local151 = (int) ((local22.method22876() - this.aLong106 * -1130360274060180351L) / 20L);
							local9 = (int) ((long) local9 + (local22.method22876() - this.aLong106 * -1130360274060180351L) % 20L);
						}
						this.anInt2001 = local62 * 1335804931;
						this.anInt2000 = local47 * -554087135;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.aClass93_Sub41_Sub2_1.method22454((local132 << 6) + (local151 << 12) + local139);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.aClass93_Sub41_Sub2_1.method22510(local151 + 128);
							local5.aClass93_Sub41_Sub2_1.method22454((local132 << 8) + local139);
						} else if (local151 < 32) {
							local5.aClass93_Sub41_Sub2_1.method22510(local151 + 192);
							if (local62 == -1 || local47 == -1) {
								local5.aClass93_Sub41_Sub2_1.method22395(Integer.MIN_VALUE);
							} else {
								local5.aClass93_Sub41_Sub2_1.method22395(local62 | local47 << 16);
							}
						} else {
							local5.aClass93_Sub41_Sub2_1.method22454((local151 & 0x1FFF) + 57344);
							if (local62 == -1 || local47 == -1) {
								local5.aClass93_Sub41_Sub2_1.method22395(Integer.MIN_VALUE);
							} else {
								local5.aClass93_Sub41_Sub2_1.method22395(local62 | local47 << 16);
							}
						}
						local11++;
						this.method14906(local5.aClass93_Sub41_Sub2_1, local22);
						this.aLong106 = local22.method22876() * 8115390464037108609L;
						local22.method22877();
					}
				}
			}
			if (local5 != null) {
				local5.aClass93_Sub41_Sub2_1.method22537(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local7);
				@Pc(348) int local348 = local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local5.aClass93_Sub41_Sub2_1.anInt3070 = local7 * -1445626955;
				local5.aClass93_Sub41_Sub2_1.method22510(local9 / local11);
				local5.aClass93_Sub41_Sub2_1.method22510(local9 % local11);
				local5.aClass93_Sub41_Sub2_1.anInt3070 = local348 * -1445626955;
				client.aClass175_2.method24351(local5);
			}
		}
		this.method14912();
	}

	@OriginalMember(owner = "client!xb", name = "x", descriptor = "()V", line = 19)
	void method14919() {
		if (this.method14914()) {
			@Pc(5) Class93_Sub22 local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass22_31.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class93_Sub23 local22 = (Class93_Sub23) local15.next();
					if (local5 != null && local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local7 >= 252 - (this.method14905() + 6)) {
						break label100;
					}
					local22.method23969();
					@Pc(47) int local47 = local22.method22874();
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method22873();
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (local62 == this.anInt2001 * 1724450475 && local47 == this.anInt2000 * 1821800161) {
						local22.method22877();
					} else {
						if (local5 == null) {
							local5 = this.method14909();
							local5.aClass93_Sub41_Sub2_1.method22510(0);
							local7 = local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
							local5.aClass93_Sub41_Sub2_1.anInt3070 += 1403713386;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong106 * -1130360274060180351L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt2001 * 1724450475;
							local139 = local47 - this.anInt2000 * 1821800161;
							local151 = (int) ((local22.method22876() - this.aLong106 * -1130360274060180351L) / 20L);
							local9 = (int) ((long) local9 + (local22.method22876() - this.aLong106 * -1130360274060180351L) % 20L);
						}
						this.anInt2001 = local62 * 1335804931;
						this.anInt2000 = local47 * -554087135;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.aClass93_Sub41_Sub2_1.method22454((local132 << 6) + (local151 << 12) + local139);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.aClass93_Sub41_Sub2_1.method22510(local151 + 128);
							local5.aClass93_Sub41_Sub2_1.method22454((local132 << 8) + local139);
						} else if (local151 < 32) {
							local5.aClass93_Sub41_Sub2_1.method22510(local151 + 192);
							if (local62 == -1 || local47 == -1) {
								local5.aClass93_Sub41_Sub2_1.method22395(Integer.MIN_VALUE);
							} else {
								local5.aClass93_Sub41_Sub2_1.method22395(local62 | local47 << 16);
							}
						} else {
							local5.aClass93_Sub41_Sub2_1.method22454((local151 & 0x1FFF) + 57344);
							if (local62 == -1 || local47 == -1) {
								local5.aClass93_Sub41_Sub2_1.method22395(Integer.MIN_VALUE);
							} else {
								local5.aClass93_Sub41_Sub2_1.method22395(local62 | local47 << 16);
							}
						}
						local11++;
						this.method14906(local5.aClass93_Sub41_Sub2_1, local22);
						this.aLong106 = local22.method22876() * 8115390464037108609L;
						local22.method22877();
					}
				}
			}
			if (local5 != null) {
				local5.aClass93_Sub41_Sub2_1.method22537(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local7);
				@Pc(348) int local348 = local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local5.aClass93_Sub41_Sub2_1.anInt3070 = local7 * -1445626955;
				local5.aClass93_Sub41_Sub2_1.method22510(local9 / local11);
				local5.aClass93_Sub41_Sub2_1.method22510(local9 % local11);
				local5.aClass93_Sub41_Sub2_1.anInt3070 = local348 * -1445626955;
				client.aClass175_2.method24351(local5);
			}
		}
		this.method14912();
	}

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "(S)V", line = 19)
	void method14922() {
		if (this.method14914()) {
			@Pc(5) Class93_Sub22 local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass22_31.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class93_Sub23 local22 = (Class93_Sub23) local15.next();
					if (local5 != null && local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local7 >= 252 - (this.method14905() + 6)) {
						break label100;
					}
					local22.method23969();
					@Pc(47) int local47 = local22.method22874();
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method22873();
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (local62 == this.anInt2001 * 1724450475 && local47 == this.anInt2000 * 1821800161) {
						local22.method22877();
					} else {
						if (local5 == null) {
							local5 = this.method14909();
							local5.aClass93_Sub41_Sub2_1.method22510(0);
							local7 = local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
							local5.aClass93_Sub41_Sub2_1.anInt3070 += 1403713386;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong106 * -1130360274060180351L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt2001 * 1724450475;
							local139 = local47 - this.anInt2000 * 1821800161;
							local151 = (int) ((local22.method22876() - this.aLong106 * -1130360274060180351L) / 20L);
							local9 = (int) ((long) local9 + (local22.method22876() - this.aLong106 * -1130360274060180351L) % 20L);
						}
						this.anInt2001 = local62 * 1335804931;
						this.anInt2000 = local47 * -554087135;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.aClass93_Sub41_Sub2_1.method22454((local132 << 6) + (local151 << 12) + local139);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.aClass93_Sub41_Sub2_1.method22510(local151 + 128);
							local5.aClass93_Sub41_Sub2_1.method22454((local132 << 8) + local139);
						} else if (local151 < 32) {
							local5.aClass93_Sub41_Sub2_1.method22510(local151 + 192);
							if (local62 == -1 || local47 == -1) {
								local5.aClass93_Sub41_Sub2_1.method22395(Integer.MIN_VALUE);
							} else {
								local5.aClass93_Sub41_Sub2_1.method22395(local62 | local47 << 16);
							}
						} else {
							local5.aClass93_Sub41_Sub2_1.method22454((local151 & 0x1FFF) + 57344);
							if (local62 == -1 || local47 == -1) {
								local5.aClass93_Sub41_Sub2_1.method22395(Integer.MIN_VALUE);
							} else {
								local5.aClass93_Sub41_Sub2_1.method22395(local62 | local47 << 16);
							}
						}
						local11++;
						this.method14906(local5.aClass93_Sub41_Sub2_1, local22);
						this.aLong106 = local22.method22876() * 8115390464037108609L;
						local22.method22877();
					}
				}
			}
			if (local5 != null) {
				local5.aClass93_Sub41_Sub2_1.method22537(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local7);
				@Pc(348) int local348 = local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local5.aClass93_Sub41_Sub2_1.anInt3070 = local7 * -1445626955;
				local5.aClass93_Sub41_Sub2_1.method22510(local9 / local11);
				local5.aClass93_Sub41_Sub2_1.method22510(local9 % local11);
				local5.aClass93_Sub41_Sub2_1.anInt3070 = local348 * -1445626955;
				client.aClass175_2.method24351(local5);
			}
		}
		this.method14912();
	}

	@OriginalMember(owner = "client!xb", name = "n", descriptor = "(I)V", line = 104)
	void method14902() {
		this.aClass22_31.method406();
		this.aLong105 = -8143831586271184505L;
		this.aLong106 = -8115390464037108609L;
		this.anInt2001 = -1335804931;
		this.anInt2000 = 554087135;
	}

	@OriginalMember(owner = "client!xb", name = "m", descriptor = "(Lclient!akm;I)V", line = 112)
	void method14903(@OriginalArg(0) Class93_Sub23 arg0) {
		this.aClass22_31.method407(arg0);
	}

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "(Lclient!akm;)V", line = 112)
	void method14920(@OriginalArg(0) Class93_Sub23 arg0) {
		this.aClass22_31.method407(arg0);
	}

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "(Lclient!akm;)V", line = 112)
	void method14921(@OriginalArg(0) Class93_Sub23 arg0) {
		this.aClass22_31.method407(arg0);
	}

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "(Lclient!akm;II)I", line = 117)
	int method14904(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong105 * -3676464144319855671L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22876() - this.aLong105 * -3676464144319855671L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong105 = arg0.method22876() * 8143831586271184505L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Lclient!akm;I)I", line = 117)
	int method14907(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong105 * -3676464144319855671L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22876() - this.aLong105 * -3676464144319855671L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong105 = arg0.method22876() * 8143831586271184505L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "(Lclient!akm;I)I", line = 117)
	int method14908(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong105 * -3676464144319855671L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22876() - this.aLong105 * -3676464144319855671L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong105 = arg0.method22876() * 8143831586271184505L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xb", name = "ah", descriptor = "(I)V", line = 1046)
	static void method14924() {
		Class63.method1162();
	}

	@OriginalMember(owner = "client!xb", name = "kn", descriptor = "(Lclient!yf;S)V", line = 6878)
	static final void method14923(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class266.method26227(local11, arg0);
	}

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "()Z")
	abstract boolean method14900();

	@OriginalMember(owner = "client!xb", name = "v", descriptor = "()I")
	abstract int method14901();

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "(I)I")
	abstract int method14905();

	@OriginalMember(owner = "client!xb", name = "w", descriptor = "(Lclient!alw;Lclient!akm;I)V")
	abstract void method14906(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1);

	@OriginalMember(owner = "client!xb", name = "z", descriptor = "(S)Lclient!akl;")
	abstract Class93_Sub22 method14909();

	@OriginalMember(owner = "client!xb", name = "p", descriptor = "()V")
	abstract void method14910();

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "()V")
	abstract void method14911();

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "(I)V")
	abstract void method14912();

	@OriginalMember(owner = "client!xb", name = "r", descriptor = "()Lclient!akl;")
	abstract Class93_Sub22 method14913();

	@OriginalMember(owner = "client!xb", name = "u", descriptor = "(I)Z")
	abstract boolean method14914();

	@OriginalMember(owner = "client!xb", name = "o", descriptor = "(Lclient!alw;Lclient!akm;)V")
	abstract void method14915(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1);

	@OriginalMember(owner = "client!xb", name = "s", descriptor = "(Lclient!alw;Lclient!akm;)V")
	abstract void method14916(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1);
}
