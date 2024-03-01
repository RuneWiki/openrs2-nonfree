package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public class Class183 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
	static final int anInt3592 = 8192;

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "I")
	static final int anInt3593 = 4096;

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
	static final int anInt3594 = 4096;

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
	static final int anInt3595 = 0;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "I")
	static final int anInt3596 = 16384;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
	static final int anInt3599 = 16384;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
	static final int anInt3601 = 8192;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
	int anInt3591;

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "Lclient!ew;")
	Class161 aClass161_21;

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "Z")
	boolean aBoolean648;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Lclient!ew;")
	Class161 aClass161_22;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
	int anInt3597;

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "Lclient!mh;")
	Class320 aClass320_60;

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
	int anInt3598;

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "Lclient!oh;")
	Class366 aClass366_5;

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
	int anInt3600;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Z")
	boolean aBoolean650;

	@OriginalMember(owner = "client!ft", name = "n", descriptor = "Lclient!ew;")
	Class161 aClass161_23;

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "Ljava/util/List;")
	List aList5 = new ArrayList();

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "Ljava/util/List;")
	List aList4 = new ArrayList();

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap6 = new HashMap();

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap7 = new HashMap();

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "Ljava/util/List;")
	List aList6 = new ArrayList();

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap8 = new HashMap();

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "Lclient!oh;")
	Class366 aClass366_6 = null;

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "Z")
	boolean aBoolean649 = false;

	@OriginalMember(owner = "client!ft", name = "at", descriptor = "Lclient!os;")
	Interface41 anInterface41_3 = new Class144(this);

	@OriginalMember(owner = "client!ft", name = "af", descriptor = "Lclient!os;")
	Interface41 anInterface41_4 = new Class155(this);

	@OriginalMember(owner = "client!ft", name = "ak", descriptor = "Lclient!os;")
	Interface41 anInterface41_1 = new Class149(this);

	@OriginalMember(owner = "client!ft", name = "aa", descriptor = "Lclient!os;")
	Interface41 anInterface41_2 = new Class156(this);

	@OriginalMember(owner = "client!ft", name = "al", descriptor = "()Ljava/util/List;", line = 241)
	List method23603() {
		return this.aList4;
	}

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "(B)Ljava/util/List;", line = 241)
	List method23627() {
		return this.aList4;
	}

	@OriginalMember(owner = "client!ft", name = "ao", descriptor = "()Ljava/util/List;", line = 241)
	List method23649() {
		return this.aList4;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Ljava/util/List;", line = 245)
	List method23564() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!ft", name = "ab", descriptor = "()Ljava/util/List;", line = 245)
	List method23584() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!ft", name = "ap", descriptor = "()Ljava/util/List;", line = 245)
	List method23605() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!ft", name = "au", descriptor = "()Lclient!ew;", line = 249)
	Class161 method23607() {
		return this.aClass161_23;
	}

	@OriginalMember(owner = "client!ft", name = "ay", descriptor = "()Lclient!ew;", line = 249)
	Class161 method23608() {
		return this.aClass161_23;
	}

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)Lclient!ew;", line = 249)
	Class161 method23662() {
		return this.aClass161_23;
	}

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "(I)Lclient!ew;", line = 253)
	Class161 method23566() {
		return this.aClass161_22;
	}

	@OriginalMember(owner = "client!ft", name = "ag", descriptor = "()Lclient!ew;", line = 253)
	Class161 method23609() {
		return this.aClass161_22;
	}

	@OriginalMember(owner = "client!ft", name = "am", descriptor = "()Lclient!ew;", line = 253)
	Class161 method23610() {
		return this.aClass161_22;
	}

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)Lclient!mh;", line = 257)
	Class320 method23567() {
		return this.aClass320_60;
	}

	@OriginalMember(owner = "client!ft", name = "ar", descriptor = "()Lclient!mh;", line = 257)
	Class320 method23611() {
		return this.aClass320_60;
	}

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "(III)V", line = 263)
	public void method23655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean648) {
			return;
		}
		this.anInt3597 = arg0 * 1151960251;
		this.aClass161_23 = new Class161(arg1, 100);
		this.aClass161_22 = new Class161(10);
		this.aClass161_23.method23230(new Class143(this));
		@Pc(34) Class511 local34 = new Class511(Class265.aClass265_2);
		Class53_Sub5.method10322(local34);
		this.method23685();
		this.anInt3598 = 1563954703;
		this.aBoolean648 = true;
	}

	@OriginalMember(owner = "client!ft", name = "ae", descriptor = "()V", line = 291)
	public void method23612() {
		if (!this.aBoolean648) {
			return;
		}
		Class298.method25634();
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 != null && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431() != null) {
			if (this.aClass320_60 == null) {
				this.aClass320_60 = new Class320();
			}
			this.aClass320_60.aFloat259 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61.aFloat259;
			this.aClass320_60.aFloat260 = 0.0F;
			this.aClass320_60.aFloat261 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61.aFloat261;
		}
		@Pc(42) Iterator local42 = this.aHashMap6.values().iterator();
		@Pc(49) Interface52 local49;
		while (local42.hasNext()) {
			local49 = (Interface52) local42.next();
			local49.method29116();
		}
		local42 = this.aHashMap7.values().iterator();
		while (local42.hasNext()) {
			local49 = (Interface52) local42.next();
			local49.method29116();
		}
		local42 = this.aList6.iterator();
		while (local42.hasNext()) {
			local49 = (Interface52) local42.next();
			if (local49.method29115()) {
				this.aHashMap7.remove(local49.method29120());
			} else {
				this.aHashMap6.remove(local49.method29120());
			}
		}
		this.aList6.clear();
		if (this.aClass366_6 != null && this.aClass366_6.method26844() == Class378.aClass378_5 && !this.aBoolean649 && client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(135) Class3_Sub23 local135 = Class269.method25284(Class311.aClass311_120, client.aClass82_2.aClass577_2);
			local135.aClass3_Sub41_Sub1_1.method20254(this.aClass366_6.method26832().method29120());
			client.aClass82_2.method21601(local135);
			this.aBoolean649 = true;
		}
		local42 = this.aList5.iterator();
		while (true) {
			label162: while (true) {
				@Pc(173) Class378 local173;
				@Pc(163) Class366 local163;
				do {
					if (!local42.hasNext()) {
						return;
					}
					local163 = (Class366) local42.next();
					local163.method26841();
					local163.method26823();
					local173 = local163.method26844();
				} while (local163.method26826() != this);
				if (Class378.aClass378_2 == local173 || local173 == Class378.aClass378_8) {
					if (local163.method26881() != Class160.aClass160_11 && local163.method26881() != Class160.aClass160_12) {
						@Pc(382) Iterator local382 = this.aHashMap8.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class147 local397 = (Class147) this.aHashMap8.get(local390);
							if (local397.method23090().contains(local163)) {
								local397.method23087(local163);
								break;
							}
						}
						local163.method26816();
						this.aList4.remove(local163);
					} else if (this.aClass366_6 == local163) {
						this.aBoolean649 = false;
						this.aClass366_6 = null;
						local163.method26816();
						this.aList4.remove(local163);
					} else {
						@Pc(219) int local219 = local163.method26832().method29120();
						@Pc(232) boolean local232 = this.method23604(Class141.aClass141_9.method23024()) > 0.0F;
						if (!this.aBoolean650 && local232) {
							if (this.anInt3598 * 1551425297 == local219) {
								this.method23594(local219);
								this.anInt3598 = 1563954703;
							}
							local163.method26816();
							this.aList4.remove(local163);
						} else if (this.anInt3591 * -1736019917 == local219) {
							this.anInt3591 = 688256261;
							this.aBoolean650 = false;
							local163.method26816();
							this.aList4.remove(local163);
							@Pc(283) Iterator local283 = this.aList5.iterator();
							@Pc(290) Class366 local290;
							@Pc(301) int local301;
							do {
								do {
									if (!local283.hasNext()) {
										continue label162;
									}
									local290 = (Class366) local283.next();
								} while (local290.method26881() != Class160.aClass160_11);
								local301 = local290.method26832().method29120();
							} while ((this.anInt3598 * 1551425297 != local301 || local290.method26844() != Class378.aClass378_2) && local290.method26844() != Class378.aClass378_3 && local290.method26844() != Class378.aClass378_4 && local290.method26844() != Class378.aClass378_5);
							if (local290.method26844() == Class378.aClass378_2) {
								local290.method26821();
							} else {
								local290.method26818();
							}
						} else if (local232) {
							if (!this.aBoolean650 || local219 != this.anInt3598 * 1551425297) {
								local163.method26816();
								this.aList4.remove(local163);
							}
							if (!this.aBoolean650 && this.anInt3598 * 1551425297 == local219) {
								this.anInt3598 = 1563954703;
								this.aClass366_5 = null;
							}
						}
					}
				} else if (local163.method26844() != Class378.aClass378_7 && local163.method26829() == Class141.aClass141_9.method23024()) {
					@Pc(443) boolean local443 = this.method23604(Class141.aClass141_9.method23024()) > 1.0E-4F;
					if (!local443) {
						local163.method26819(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "(B)V", line = 291)
	public void method23624() {
		if (!this.aBoolean648) {
			return;
		}
		Class298.method25634();
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 != null && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431() != null) {
			if (this.aClass320_60 == null) {
				this.aClass320_60 = new Class320();
			}
			this.aClass320_60.aFloat259 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61.aFloat259;
			this.aClass320_60.aFloat260 = 0.0F;
			this.aClass320_60.aFloat261 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61.aFloat261;
		}
		@Pc(42) Iterator local42 = this.aHashMap6.values().iterator();
		@Pc(49) Interface52 local49;
		while (local42.hasNext()) {
			local49 = (Interface52) local42.next();
			local49.method29116();
		}
		local42 = this.aHashMap7.values().iterator();
		while (local42.hasNext()) {
			local49 = (Interface52) local42.next();
			local49.method29116();
		}
		local42 = this.aList6.iterator();
		while (local42.hasNext()) {
			local49 = (Interface52) local42.next();
			if (local49.method29115()) {
				this.aHashMap7.remove(local49.method29120());
			} else {
				this.aHashMap6.remove(local49.method29120());
			}
		}
		this.aList6.clear();
		if (this.aClass366_6 != null && this.aClass366_6.method26844() == Class378.aClass378_5 && !this.aBoolean649 && client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(135) Class3_Sub23 local135 = Class269.method25284(Class311.aClass311_120, client.aClass82_2.aClass577_2);
			local135.aClass3_Sub41_Sub1_1.method20254(this.aClass366_6.method26832().method29120());
			client.aClass82_2.method21601(local135);
			this.aBoolean649 = true;
		}
		local42 = this.aList5.iterator();
		while (true) {
			label162: while (true) {
				@Pc(173) Class378 local173;
				@Pc(163) Class366 local163;
				do {
					if (!local42.hasNext()) {
						return;
					}
					local163 = (Class366) local42.next();
					local163.method26841();
					local163.method26823();
					local173 = local163.method26844();
				} while (local163.method26826() != this);
				if (Class378.aClass378_2 == local173 || local173 == Class378.aClass378_8) {
					if (local163.method26881() != Class160.aClass160_11 && local163.method26881() != Class160.aClass160_12) {
						@Pc(382) Iterator local382 = this.aHashMap8.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class147 local397 = (Class147) this.aHashMap8.get(local390);
							if (local397.method23090().contains(local163)) {
								local397.method23087(local163);
								break;
							}
						}
						local163.method26816();
						this.aList4.remove(local163);
					} else if (this.aClass366_6 == local163) {
						this.aBoolean649 = false;
						this.aClass366_6 = null;
						local163.method26816();
						this.aList4.remove(local163);
					} else {
						@Pc(219) int local219 = local163.method26832().method29120();
						@Pc(232) boolean local232 = this.method23604(Class141.aClass141_9.method23024()) > 0.0F;
						if (!this.aBoolean650 && local232) {
							if (this.anInt3598 * 1551425297 == local219) {
								this.method23594(local219);
								this.anInt3598 = 1563954703;
							}
							local163.method26816();
							this.aList4.remove(local163);
						} else if (this.anInt3591 * -1736019917 == local219) {
							this.anInt3591 = 688256261;
							this.aBoolean650 = false;
							local163.method26816();
							this.aList4.remove(local163);
							@Pc(283) Iterator local283 = this.aList5.iterator();
							@Pc(290) Class366 local290;
							@Pc(301) int local301;
							do {
								do {
									if (!local283.hasNext()) {
										continue label162;
									}
									local290 = (Class366) local283.next();
								} while (local290.method26881() != Class160.aClass160_11);
								local301 = local290.method26832().method29120();
							} while ((this.anInt3598 * 1551425297 != local301 || local290.method26844() != Class378.aClass378_2) && local290.method26844() != Class378.aClass378_3 && local290.method26844() != Class378.aClass378_4 && local290.method26844() != Class378.aClass378_5);
							if (local290.method26844() == Class378.aClass378_2) {
								local290.method26821();
							} else {
								local290.method26818();
							}
						} else if (local232) {
							if (!this.aBoolean650 || local219 != this.anInt3598 * 1551425297) {
								local163.method26816();
								this.aList4.remove(local163);
							}
							if (!this.aBoolean650 && this.anInt3598 * 1551425297 == local219) {
								this.anInt3598 = 1563954703;
								this.aClass366_5 = null;
							}
						}
					}
				} else if (local163.method26844() != Class378.aClass378_7 && local163.method26829() == Class141.aClass141_9.method23024()) {
					@Pc(443) boolean local443 = this.method23604(Class141.aClass141_9.method23024()) > 1.0E-4F;
					if (!local443) {
						local163.method26819(150);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "(I)V", line = 411)
	public void method23571() {
		Class126.method22877();
	}

	@OriginalMember(owner = "client!ft", name = "ad", descriptor = "()V", line = 411)
	public void method23579() {
		Class126.method22877();
	}

	@OriginalMember(owner = "client!ft", name = "aw", descriptor = "()V", line = 411)
	public void method23664() {
		Class126.method22877();
	}

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "(Lclient!oh;IIB)V", line = 415)
	public void method23597(@OriginalArg(0) Class366 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(10) Class147 local10 = (Class147) this.aHashMap8.get(arg1);
		if (local10 == null) {
			local10 = new Class147(this);
			this.aHashMap8.put(arg1, local10);
		}
		if (!local10.method23089(arg0)) {
			arg0.method26839(arg2, true);
			local10.method23088(arg0);
		}
	}

	@OriginalMember(owner = "client!ft", name = "ac", descriptor = "(Lclient!oh;II)V", line = 415)
	public void method23613(@OriginalArg(0) Class366 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(10) Class147 local10 = (Class147) this.aHashMap8.get(arg1);
		if (local10 == null) {
			local10 = new Class147(this);
			this.aHashMap8.put(arg1, local10);
		}
		if (!local10.method23089(arg0)) {
			arg0.method26839(arg2, true);
			local10.method23088(arg0);
		}
	}

	@OriginalMember(owner = "client!ft", name = "bw", descriptor = "(Lclient!oh;II)V", line = 415)
	public void method23616(@OriginalArg(0) Class366 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(10) Class147 local10 = (Class147) this.aHashMap8.get(arg1);
		if (local10 == null) {
			local10 = new Class147(this);
			this.aHashMap8.put(arg1, local10);
		}
		if (!local10.method23089(arg0)) {
			arg0.method26839(arg2, true);
			local10.method23088(arg0);
		}
	}

	@OriginalMember(owner = "client!ft", name = "bp", descriptor = "(Lclient!oh;II)V", line = 415)
	public void method23617(@OriginalArg(0) Class366 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(10) Class147 local10 = (Class147) this.aHashMap8.get(arg1);
		if (local10 == null) {
			local10 = new Class147(this);
			this.aHashMap8.put(arg1, local10);
		}
		if (!local10.method23089(arg0)) {
			arg0.method26839(arg2, true);
			local10.method23088(arg0);
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)V", line = 428)
	public void method23588(@OriginalArg(0) int arg0) {
		@Pc(6) Class147 local6 = (Class147) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method23090();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class366 local24 = (Class366) local17.next();
			if (!local24.method26840()) {
				local24.method26818();
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "bd", descriptor = "(I)V", line = 428)
	public void method23618(@OriginalArg(0) int arg0) {
		@Pc(6) Class147 local6 = (Class147) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method23090();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class366 local24 = (Class366) local17.next();
			if (!local24.method26840()) {
				local24.method26818();
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "bs", descriptor = "(I)V", line = 428)
	public void method23619(@OriginalArg(0) int arg0) {
		@Pc(6) Class147 local6 = (Class147) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method23090();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class366 local24 = (Class366) local17.next();
			if (!local24.method26840()) {
				local24.method26818();
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(IS)V", line = 442)
	public void method23606(@OriginalArg(0) int arg0) {
		@Pc(6) Class147 local6 = (Class147) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method23090();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class366 local24 = (Class366) local17.next();
			local24.method26819(50);
		}
	}

	@OriginalMember(owner = "client!ft", name = "bm", descriptor = "(I)V", line = 442)
	public void method23620(@OriginalArg(0) int arg0) {
		@Pc(6) Class147 local6 = (Class147) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method23090();
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class366 local24 = (Class366) local17.next();
			local24.method26819(50);
		}
	}

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "(IB)V", line = 456)
	public void method23575(@OriginalArg(0) int arg0) {
		@Pc(6) Class147 local6 = (Class147) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method23090();
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class366 local23 = (Class366) local16.next();
			local23.method26817();
		}
	}

	@OriginalMember(owner = "client!ft", name = "bf", descriptor = "(I)V", line = 456)
	public void method23621(@OriginalArg(0) int arg0) {
		@Pc(6) Class147 local6 = (Class147) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method23090();
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class366 local23 = (Class366) local16.next();
			local23.method26817();
		}
	}

	@OriginalMember(owner = "client!ft", name = "bt", descriptor = "(I)V", line = 456)
	public void method23622(@OriginalArg(0) int arg0) {
		@Pc(6) Class147 local6 = (Class147) this.aHashMap8.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(13) List local13 = local6.method23090();
		@Pc(16) Iterator local16 = local13.iterator();
		while (local16.hasNext()) {
			@Pc(23) Class366 local23 = (Class366) local16.next();
			local23.method26817();
		}
	}

	@OriginalMember(owner = "client!ft", name = "bk", descriptor = "()V", line = 470)
	void method23623() {
		@Pc(4) Class154 local4 = new Class154(this);
		@Pc(9) Class151 local9 = new Class151(this);
		@Pc(14) Class159 local14 = new Class159(this);
		@Pc(19) Class157 local19 = new Class157(this);
		@Pc(24) Class152 local24 = new Class152(this);
		Class410.method27676(Class164.aClass164_2.method23300(), Class164.aClass164_3.method23300(), 0.2F, local4);
		Class410.method27676(Class164.aClass164_1.method23300(), Class164.aClass164_3.method23300(), 1.0F, local9);
		Class410.method27676(Class164.aClass164_4.method23300(), Class164.aClass164_3.method23300(), 1.0F, local14);
		Class410.method27676(Class164.aClass164_5.method23300(), Class164.aClass164_3.method23300(), 0.8F, local19);
		Class410.method27676(Class164.aClass164_6.method23300(), Class164.aClass164_3.method23300(), 1.0F, local24);
		Class410.method27676(Class141.aClass141_9.method23024(), Class164.aClass164_1.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_2.method23024(), Class164.aClass164_6.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_3.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_10.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_1.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_4.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_6.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_7.method23024(), Class164.aClass164_5.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_5.method23024(), Class141.aClass141_7.method23024(), 1.0F, null);
		Class410.method27676(Class141.aClass141_8.method23024(), Class141.aClass141_7.method23024(), 1.0F, null);
		Class498.method29362(Class141.aClass141_9.method23024()).method25364(0.75F);
	}

	@OriginalMember(owner = "client!ft", name = "br", descriptor = "()V", line = 470)
	void method23625() {
		@Pc(4) Class154 local4 = new Class154(this);
		@Pc(9) Class151 local9 = new Class151(this);
		@Pc(14) Class159 local14 = new Class159(this);
		@Pc(19) Class157 local19 = new Class157(this);
		@Pc(24) Class152 local24 = new Class152(this);
		Class410.method27676(Class164.aClass164_2.method23300(), Class164.aClass164_3.method23300(), 0.2F, local4);
		Class410.method27676(Class164.aClass164_1.method23300(), Class164.aClass164_3.method23300(), 1.0F, local9);
		Class410.method27676(Class164.aClass164_4.method23300(), Class164.aClass164_3.method23300(), 1.0F, local14);
		Class410.method27676(Class164.aClass164_5.method23300(), Class164.aClass164_3.method23300(), 0.8F, local19);
		Class410.method27676(Class164.aClass164_6.method23300(), Class164.aClass164_3.method23300(), 1.0F, local24);
		Class410.method27676(Class141.aClass141_9.method23024(), Class164.aClass164_1.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_2.method23024(), Class164.aClass164_6.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_3.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_10.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_1.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_4.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_6.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_7.method23024(), Class164.aClass164_5.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_5.method23024(), Class141.aClass141_7.method23024(), 1.0F, null);
		Class410.method27676(Class141.aClass141_8.method23024(), Class141.aClass141_7.method23024(), 1.0F, null);
		Class498.method29362(Class141.aClass141_9.method23024()).method25364(0.75F);
	}

	@OriginalMember(owner = "client!ft", name = "bg", descriptor = "()V", line = 470)
	void method23656() {
		@Pc(4) Class154 local4 = new Class154(this);
		@Pc(9) Class151 local9 = new Class151(this);
		@Pc(14) Class159 local14 = new Class159(this);
		@Pc(19) Class157 local19 = new Class157(this);
		@Pc(24) Class152 local24 = new Class152(this);
		Class410.method27676(Class164.aClass164_2.method23300(), Class164.aClass164_3.method23300(), 0.2F, local4);
		Class410.method27676(Class164.aClass164_1.method23300(), Class164.aClass164_3.method23300(), 1.0F, local9);
		Class410.method27676(Class164.aClass164_4.method23300(), Class164.aClass164_3.method23300(), 1.0F, local14);
		Class410.method27676(Class164.aClass164_5.method23300(), Class164.aClass164_3.method23300(), 0.8F, local19);
		Class410.method27676(Class164.aClass164_6.method23300(), Class164.aClass164_3.method23300(), 1.0F, local24);
		Class410.method27676(Class141.aClass141_9.method23024(), Class164.aClass164_1.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_2.method23024(), Class164.aClass164_6.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_3.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_10.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_1.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_4.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_6.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_7.method23024(), Class164.aClass164_5.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_5.method23024(), Class141.aClass141_7.method23024(), 1.0F, null);
		Class410.method27676(Class141.aClass141_8.method23024(), Class141.aClass141_7.method23024(), 1.0F, null);
		Class498.method29362(Class141.aClass141_9.method23024()).method25364(0.75F);
	}

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "(I)V", line = 470)
	void method23685() {
		@Pc(4) Class154 local4 = new Class154(this);
		@Pc(9) Class151 local9 = new Class151(this);
		@Pc(14) Class159 local14 = new Class159(this);
		@Pc(19) Class157 local19 = new Class157(this);
		@Pc(24) Class152 local24 = new Class152(this);
		Class410.method27676(Class164.aClass164_2.method23300(), Class164.aClass164_3.method23300(), 0.2F, local4);
		Class410.method27676(Class164.aClass164_1.method23300(), Class164.aClass164_3.method23300(), 1.0F, local9);
		Class410.method27676(Class164.aClass164_4.method23300(), Class164.aClass164_3.method23300(), 1.0F, local14);
		Class410.method27676(Class164.aClass164_5.method23300(), Class164.aClass164_3.method23300(), 0.8F, local19);
		Class410.method27676(Class164.aClass164_6.method23300(), Class164.aClass164_3.method23300(), 1.0F, local24);
		Class410.method27676(Class141.aClass141_9.method23024(), Class164.aClass164_1.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_2.method23024(), Class164.aClass164_6.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_3.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_10.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_1.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_4.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_6.method23024(), Class164.aClass164_2.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_7.method23024(), Class164.aClass164_5.method23300(), 1.0F, null);
		Class410.method27676(Class141.aClass141_5.method23024(), Class141.aClass141_7.method23024(), 1.0F, null);
		Class410.method27676(Class141.aClass141_8.method23024(), Class141.aClass141_7.method23024(), 1.0F, null);
		Class498.method29362(Class141.aClass141_9.method23024()).method25364(0.75F);
	}

	@OriginalMember(owner = "client!ft", name = "n", descriptor = "(IIII)V", line = 514)
	public void method23577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class164.aClass164_3.method23300();
		if (Class498.method29362(arg0) == null && (arg1 == local3 || Class498.method29362(arg1) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class410.method27676(arg0, arg1 == local3 ? -1 : arg1, local20, null);
		}
	}

	@OriginalMember(owner = "client!ft", name = "bb", descriptor = "(III)V", line = 514)
	public void method23626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class164.aClass164_3.method23300();
		if (Class498.method29362(arg0) == null && (arg1 == local3 || Class498.method29362(arg1) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class410.method27676(arg0, arg1 == local3 ? -1 : arg1, local20, null);
		}
	}

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(III)V", line = 523)
	public void method23570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class275 local3 = Class498.method29362(arg0);
		if (local3 != null) {
			@Pc(10) float local10 = (float) arg1 * 1.5258789E-5F;
			local3.method25364(local10);
		}
	}

	@OriginalMember(owner = "client!ft", name = "bl", descriptor = "(II)V", line = 523)
	public void method23628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class275 local3 = Class498.method29362(arg0);
		if (local3 != null) {
			@Pc(10) float local10 = (float) arg1 * 1.5258789E-5F;
			local3.method25364(local10);
		}
	}

	@OriginalMember(owner = "client!ft", name = "by", descriptor = "(II)V", line = 523)
	public void method23677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class275 local3 = Class498.method29362(arg0);
		if (local3 != null) {
			@Pc(10) float local10 = (float) arg1 * 1.5258789E-5F;
			local3.method25364(local10);
		}
	}

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "(II)F", line = 531)
	float method23604(@OriginalArg(0) int arg0) {
		@Pc(3) Class275 local3 = Class498.method29362(arg0);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method25370();
			local3 = local3.method25361();
		}
		return local5;
	}

	@OriginalMember(owner = "client!ft", name = "bi", descriptor = "(I)F", line = 531)
	float method23629(@OriginalArg(0) int arg0) {
		@Pc(3) Class275 local3 = Class498.method29362(arg0);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method25370();
			local3 = local3.method25361();
		}
		return local5;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(II)V", line = 541)
	public void method23580(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class366 local10 = (Class366) local3.next();
			@Pc(14) int local14 = local10.method26829();
			@Pc(19) boolean local19 = Class379.method27273(local14, arg0);
			if (local19) {
				local10.method26819(50);
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "bu", descriptor = "(I)V", line = 541)
	public void method23630(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class366 local10 = (Class366) local3.next();
			@Pc(14) int local14 = local10.method26829();
			@Pc(19) boolean local19 = Class379.method27273(local14, arg0);
			if (local19) {
				local10.method26819(50);
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "ba", descriptor = "([I)V", line = 553)
	void method23569(@OriginalArg(0) int[] arg0) {
		if (!this.aBoolean648 || arg0 == null) {
			return;
		}
		@Pc(8) int[] local8 = arg0;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) int local18 = local8[local10];
			this.method23582(local18);
		}
	}

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "([II)V", line = 553)
	void method23581(@OriginalArg(0) int[] arg0) {
		if (!this.aBoolean648 || arg0 == null) {
			return;
		}
		@Pc(8) int[] local8 = arg0;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) int local18 = local8[local10];
			this.method23582(local18);
		}
	}

	@OriginalMember(owner = "client!ft", name = "bo", descriptor = "([I)V", line = 553)
	void method23632(@OriginalArg(0) int[] arg0) {
		if (!this.aBoolean648 || arg0 == null) {
			return;
		}
		@Pc(8) int[] local8 = arg0;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) int local18 = local8[local10];
			this.method23582(local18);
		}
	}

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "(IB)V", line = 567)
	public void method23582(@OriginalArg(0) int arg0) {
		if (this.aBoolean648 && arg0 >= 0) {
			this.method23578(arg0, false);
		}
	}

	@OriginalMember(owner = "client!ft", name = "bc", descriptor = "(I)V", line = 567)
	public void method23633(@OriginalArg(0) int arg0) {
		if (this.aBoolean648 && arg0 >= 0) {
			this.method23578(arg0, false);
		}
	}

	@OriginalMember(owner = "client!ft", name = "bn", descriptor = "(I)V", line = 567)
	public void method23634(@OriginalArg(0) int arg0) {
		if (this.aBoolean648 && arg0 >= 0) {
			this.method23578(arg0, false);
		}
	}

	@OriginalMember(owner = "client!ft", name = "be", descriptor = "(IZ)Lclient!tn;", line = 573)
	Interface52 method23565(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(19) Interface52 local19 = (Interface52) (arg1 ? this.aClass161_22.method23219((long) arg0) : this.aClass161_23.method23219((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface52) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface52) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "(IZI)Lclient!tn;", line = 573)
	Interface52 method23583(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(19) Interface52 local19 = (Interface52) (arg1 ? this.aClass161_22.method23219((long) arg0) : this.aClass161_23.method23219((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface52) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface52) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ft", name = "bx", descriptor = "(IZ)Lclient!tn;", line = 573)
	Interface52 method23636(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(19) Interface52 local19 = (Interface52) (arg1 ? this.aClass161_22.method23219((long) arg0) : this.aClass161_23.method23219((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface52) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface52) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ft", name = "bh", descriptor = "(IZ)Lclient!tn;", line = 573)
	Interface52 method23637(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(19) Interface52 local19 = (Interface52) (arg1 ? this.aClass161_22.method23219((long) arg0) : this.aClass161_23.method23219((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface52) this.aHashMap7.get(arg0);
			} else {
				local19 = (Interface52) this.aHashMap6.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ft", name = "bj", descriptor = "(IZ)Lclient!tn;", line = 583)
	Interface52 method23568(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(10) Interface52 local10 = this.method23583(arg0, arg1);
		if (local10 == null) {
			@Pc(18) Class148 local18 = new Class148(this);
			local10 = Class270.method25287(arg1 ? Class427.aClass359_71 : Class462.aClass359_82, arg0, local18, arg1, this.aClass161_21);
			if (arg1) {
				this.aHashMap7.put(arg0, local10);
			} else {
				this.aHashMap6.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "(IZB)Lclient!tn;", line = 583)
	Interface52 method23578(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(10) Interface52 local10 = this.method23583(arg0, arg1);
		if (local10 == null) {
			@Pc(18) Class148 local18 = new Class148(this);
			local10 = Class270.method25287(arg1 ? Class427.aClass359_71 : Class462.aClass359_82, arg0, local18, arg1, this.aClass161_21);
			if (arg1) {
				this.aHashMap7.put(arg0, local10);
			} else {
				this.aHashMap6.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ft", name = "bv", descriptor = "(IZ)Lclient!tn;", line = 583)
	Interface52 method23587(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(10) Interface52 local10 = this.method23583(arg0, arg1);
		if (local10 == null) {
			@Pc(18) Class148 local18 = new Class148(this);
			local10 = Class270.method25287(arg1 ? Class427.aClass359_71 : Class462.aClass359_82, arg0, local18, arg1, this.aClass161_21);
			if (arg1) {
				this.aHashMap7.put(arg0, local10);
			} else {
				this.aHashMap6.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ft", name = "bq", descriptor = "(IZ)Lclient!tn;", line = 583)
	Interface52 method23639(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(10) Interface52 local10 = this.method23583(arg0, arg1);
		if (local10 == null) {
			@Pc(18) Class148 local18 = new Class148(this);
			local10 = Class270.method25287(arg1 ? Class427.aClass359_71 : Class462.aClass359_82, arg0, local18, arg1, this.aClass161_21);
			if (arg1) {
				this.aHashMap7.put(arg0, local10);
			} else {
				this.aHashMap6.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "(Lclient!tn;B)Lclient!oh;", line = 610)
	Class366 method23585(@OriginalArg(0) Interface52 arg0) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class366 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3597 * 1386618995) {
					return null;
				}
				@Pc(42) Class366 local42 = arg0.method29122();
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class366) local10.next();
			local6++;
		} while (local17.method26844() != Class378.aClass378_11);
		local17.method26815(arg0);
		return local17;
	}

	@OriginalMember(owner = "client!ft", name = "bz", descriptor = "(Lclient!tn;)Lclient!oh;", line = 610)
	Class366 method23641(@OriginalArg(0) Interface52 arg0) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class366 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3597 * 1386618995) {
					return null;
				}
				@Pc(42) Class366 local42 = arg0.method29122();
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class366) local10.next();
			local6++;
		} while (local17.method26844() != Class378.aClass378_11);
		local17.method26815(arg0);
		return local17;
	}

	@OriginalMember(owner = "client!ft", name = "ck", descriptor = "(Lclient!tn;)Lclient!oh;", line = 610)
	Class366 method23642(@OriginalArg(0) Interface52 arg0) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class366 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3597 * 1386618995) {
					return null;
				}
				@Pc(42) Class366 local42 = arg0.method29122();
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class366) local10.next();
			local6++;
		} while (local17.method26844() != Class378.aClass378_11);
		local17.method26815(arg0);
		return local17;
	}

	@OriginalMember(owner = "client!ft", name = "cm", descriptor = "(Lclient!tn;)Lclient!oh;", line = 610)
	Class366 method23643(@OriginalArg(0) Interface52 arg0) {
		if (!this.aBoolean648) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class366 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3597 * 1386618995) {
					return null;
				}
				@Pc(42) Class366 local42 = arg0.method29122();
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class366) local10.next();
			local6++;
		} while (local17.method26844() != Class378.aClass378_11);
		local17.method26815(arg0);
		return local17;
	}

	@OriginalMember(owner = "client!ft", name = "cj", descriptor = "(Lclient!oh;)V", line = 631)
	public void method23644(@OriginalArg(0) Class366 arg0) {
		arg0.method26886(this);
		this.aList4.add(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "cu", descriptor = "(Lclient!oh;)V", line = 631)
	public void method23645(@OriginalArg(0) Class366 arg0) {
		arg0.method26886(this);
		this.aList4.add(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "(Lclient!oh;S)V", line = 631)
	public void method23684(@OriginalArg(0) Class366 arg0) {
		arg0.method26886(this);
		this.aList4.add(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "cv", descriptor = "(Lclient!mh;Lclient!mh;F)Z", line = 636)
	boolean method23646(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class320 local3 = Class320.method25928(arg1, arg0);
		return !(local3.method25861() >= arg2);
	}

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "(Lclient!mh;Lclient!mh;FI)Z", line = 636)
	boolean method23659(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class320 local3 = Class320.method25928(arg1, arg0);
		return !(local3.method25861() >= arg2);
	}

	@OriginalMember(owner = "client!ft", name = "cg", descriptor = "(Lclient!ev;Ljava/lang/Object;IIIILclient!et;FFLclient!mh;IIZ)Lclient!oh;", line = 642)
	public Class366 method23576(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class158 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class320 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!this.aBoolean648) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg10 = Math.max(0, arg10);
			if (Class158.aClass158_1 != arg6 && !this.method23659(this.aClass320_60, arg9, arg8)) {
				return null;
			}
			if (arg10 <= 0) {
				arg10 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg10 / 255.0F;
			@Pc(52) Interface52 local52 = this.method23578(arg2, arg11);
			@Pc(57) Class366 local57 = this.method23585(local52);
			if (local57 == null) {
				return null;
			}
			local57.method26886(arg1);
			local57.method26876(arg5);
			if (Class158.aClass158_1 != arg6) {
				local57.method26831();
				local57.method26833(arg9);
				local57.method26837(arg7);
				local57.method26838(arg8);
				if (Class158.aClass158_2 == arg6) {
					local57.method26822(this.anInterface41_4);
				} else if (arg6 == Class158.aClass158_4) {
					local57.method26822(this.anInterface41_2);
				} else if (arg6 == Class158.aClass158_5) {
					local57.method26822(this.anInterface41_3);
				} else if (Class158.aClass158_3 == arg6) {
					local57.method26822(this.anInterface41_1);
				} else {
					local57.method26831();
				}
			}
			local57.method26828(local41, 0);
			local57.method26843(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local57.method26898(local46);
			local57.method26820(arg0);
			return local57;
		}
	}

	@OriginalMember(owner = "client!ft", name = "cl", descriptor = "(Lclient!ev;Ljava/lang/Object;IIIILclient!et;FFLclient!mh;IIZ)Lclient!oh;", line = 642)
	public Class366 method23647(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class158 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class320 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!this.aBoolean648) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg10 = Math.max(0, arg10);
			if (Class158.aClass158_1 != arg6 && !this.method23659(this.aClass320_60, arg9, arg8)) {
				return null;
			}
			if (arg10 <= 0) {
				arg10 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg10 / 255.0F;
			@Pc(52) Interface52 local52 = this.method23578(arg2, arg11);
			@Pc(57) Class366 local57 = this.method23585(local52);
			if (local57 == null) {
				return null;
			}
			local57.method26886(arg1);
			local57.method26876(arg5);
			if (Class158.aClass158_1 != arg6) {
				local57.method26831();
				local57.method26833(arg9);
				local57.method26837(arg7);
				local57.method26838(arg8);
				if (Class158.aClass158_2 == arg6) {
					local57.method26822(this.anInterface41_4);
				} else if (arg6 == Class158.aClass158_4) {
					local57.method26822(this.anInterface41_2);
				} else if (arg6 == Class158.aClass158_5) {
					local57.method26822(this.anInterface41_3);
				} else if (Class158.aClass158_3 == arg6) {
					local57.method26822(this.anInterface41_1);
				} else {
					local57.method26831();
				}
			}
			local57.method26828(local41, 0);
			local57.method26843(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local57.method26898(local46);
			local57.method26820(arg0);
			return local57;
		}
	}

	@OriginalMember(owner = "client!ft", name = "cq", descriptor = "(Lclient!ev;Ljava/lang/Object;IIIILclient!et;FFLclient!mh;IIZ)Lclient!oh;", line = 642)
	public Class366 method23648(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class158 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class320 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!this.aBoolean648) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg10 = Math.max(0, arg10);
			if (Class158.aClass158_1 != arg6 && !this.method23659(this.aClass320_60, arg9, arg8)) {
				return null;
			}
			if (arg10 <= 0) {
				arg10 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg10 / 255.0F;
			@Pc(52) Interface52 local52 = this.method23578(arg2, arg11);
			@Pc(57) Class366 local57 = this.method23585(local52);
			if (local57 == null) {
				return null;
			}
			local57.method26886(arg1);
			local57.method26876(arg5);
			if (Class158.aClass158_1 != arg6) {
				local57.method26831();
				local57.method26833(arg9);
				local57.method26837(arg7);
				local57.method26838(arg8);
				if (Class158.aClass158_2 == arg6) {
					local57.method26822(this.anInterface41_4);
				} else if (arg6 == Class158.aClass158_4) {
					local57.method26822(this.anInterface41_2);
				} else if (arg6 == Class158.aClass158_5) {
					local57.method26822(this.anInterface41_3);
				} else if (Class158.aClass158_3 == arg6) {
					local57.method26822(this.anInterface41_1);
				} else {
					local57.method26831();
				}
			}
			local57.method26828(local41, 0);
			local57.method26843(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local57.method26898(local46);
			local57.method26820(arg0);
			return local57;
		}
	}

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(Lclient!ev;Ljava/lang/Object;IIIILclient!et;FFLclient!mh;IIZI)Lclient!oh;", line = 642)
	public Class366 method23686(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class158 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class320 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		if (!this.aBoolean648) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg11 = Math.max(0, arg11);
			if (Class158.aClass158_1 != arg6 && !this.method23659(this.aClass320_60, arg9, arg8)) {
				return null;
			}
			if (arg11 <= 0) {
				arg11 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg11 / 255.0F;
			@Pc(52) Interface52 local52 = this.method23578(arg2, arg12);
			@Pc(57) Class366 local57 = this.method23585(local52);
			if (local57 == null) {
				return null;
			}
			local57.method26886(arg1);
			local57.method26876(arg5);
			if (Class158.aClass158_1 != arg6) {
				local57.method26831();
				local57.method26833(arg9);
				local57.method26837(arg7);
				local57.method26838(arg8);
				if (Class158.aClass158_2 == arg6) {
					local57.method26822(this.anInterface41_4);
				} else if (arg6 == Class158.aClass158_4) {
					local57.method26822(this.anInterface41_2);
				} else if (arg6 == Class158.aClass158_5) {
					local57.method26822(this.anInterface41_3);
				} else if (Class158.aClass158_3 == arg6) {
					local57.method26822(this.anInterface41_1);
				} else {
					local57.method26831();
				}
			}
			local57.method26828(local41, 0);
			local57.method26843(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3);
			local57.method26898(local46);
			local57.method26820(arg0);
			return local57;
		}
	}

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "(Lclient!ev;IIIILclient!et;FFLclient!mh;IIII)V", line = 690)
	public void method23589(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class158 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class320 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean648) {
			return;
		}
		@Pc(20) Class366 local20 = this.method23686(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method26818();
		} else {
			local20.method26839(arg11, false);
		}
		this.method23684(local20);
	}

	@OriginalMember(owner = "client!ft", name = "cp", descriptor = "(Lclient!ev;IIIILclient!et;FFLclient!mh;III)V", line = 690)
	public void method23650(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class158 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class320 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean648) {
			return;
		}
		@Pc(20) Class366 local20 = this.method23686(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method26818();
		} else {
			local20.method26839(arg11, false);
		}
		this.method23684(local20);
	}

	@OriginalMember(owner = "client!ft", name = "cc", descriptor = "(Lclient!ev;IIIILclient!et;FFLclient!mh;III)V", line = 690)
	public void method23651(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class158 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class320 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean648) {
			return;
		}
		@Pc(20) Class366 local20 = this.method23686(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method26818();
		} else {
			local20.method26839(arg11, false);
		}
		this.method23684(local20);
	}

	@OriginalMember(owner = "client!ft", name = "cs", descriptor = "(Lclient!ev;IIIILclient!et;FFLclient!mh;III)V", line = 690)
	public void method23652(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class158 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class320 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean648) {
			return;
		}
		@Pc(20) Class366 local20 = this.method23686(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method26818();
		} else {
			local20.method26839(arg11, false);
		}
		this.method23684(local20);
	}

	@OriginalMember(owner = "client!ft", name = "ct", descriptor = "(Lclient!ev;IIIILclient!et;FFLclient!mh;III)V", line = 690)
	public void method23653(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class158 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class320 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean648) {
			return;
		}
		@Pc(20) Class366 local20 = this.method23686(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method26818();
		} else {
			local20.method26839(arg11, false);
		}
		this.method23684(local20);
	}

	@OriginalMember(owner = "client!ft", name = "cx", descriptor = "(II)V", line = 700)
	public void method23563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3598 * 1551425297 == arg0) {
			return;
		}
		if (this.aClass366_6 != null) {
			this.aClass366_6.method26819(0);
			this.method23684(this.aClass366_6);
			this.aClass366_6 = null;
		}
		@Pc(42) Class366 local42 = this.method23686(Class160.aClass160_11, this, arg0, 0, arg1, Class141.aClass141_9.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, 255, true);
		if (local42 != null) {
			local42.method26817();
			this.aClass366_6 = local42;
		}
		this.aBoolean649 = false;
	}

	@OriginalMember(owner = "client!ft", name = "at", descriptor = "(IIB)V", line = 700)
	public void method23590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3598 * 1551425297 == arg0) {
			return;
		}
		if (this.aClass366_6 != null) {
			this.aClass366_6.method26819(0);
			this.method23684(this.aClass366_6);
			this.aClass366_6 = null;
		}
		@Pc(42) Class366 local42 = this.method23686(Class160.aClass160_11, this, arg0, 0, arg1, Class141.aClass141_9.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, 255, true);
		if (local42 != null) {
			local42.method26817();
			this.aClass366_6 = local42;
		}
		this.aBoolean649 = false;
	}

	@OriginalMember(owner = "client!ft", name = "cb", descriptor = "()I", line = 717)
	public int method23572() {
		return this.anInt3598 * 1551425297;
	}

	@OriginalMember(owner = "client!ft", name = "af", descriptor = "(I)I", line = 717)
	public int method23591() {
		return this.anInt3598 * 1551425297;
	}

	@OriginalMember(owner = "client!ft", name = "cy", descriptor = "()I", line = 717)
	public int method23654() {
		return this.anInt3598 * 1551425297;
	}

	@OriginalMember(owner = "client!ft", name = "ak", descriptor = "(II)V", line = 721)
	public void method23592(@OriginalArg(0) int arg0) {
		this.anInt3600 = arg0 * -2133526025;
	}

	@OriginalMember(owner = "client!ft", name = "co", descriptor = "(I)V", line = 721)
	public void method23631(@OriginalArg(0) int arg0) {
		this.anInt3600 = arg0 * -2133526025;
	}

	@OriginalMember(owner = "client!ft", name = "cz", descriptor = "(I)V", line = 721)
	public void method23657(@OriginalArg(0) int arg0) {
		this.anInt3600 = arg0 * -2133526025;
	}

	@OriginalMember(owner = "client!ft", name = "cn", descriptor = "(I)V", line = 721)
	public void method23658(@OriginalArg(0) int arg0) {
		this.anInt3600 = arg0 * -2133526025;
	}

	@OriginalMember(owner = "client!ft", name = "aa", descriptor = "(I)I", line = 725)
	public int method23638() {
		return this.anInt3600 * 1959237575;
	}

	@OriginalMember(owner = "client!ft", name = "cd", descriptor = "()I", line = 725)
	public int method23660() {
		return this.anInt3600 * 1959237575;
	}

	@OriginalMember(owner = "client!ft", name = "ah", descriptor = "(II)V", line = 729)
	void method23594(@OriginalArg(0) int arg0) {
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(16) Class3_Sub23 local16 = Class269.method25284(Class311.aClass311_37, client.aClass82_2.aClass577_2);
			local16.aClass3_Sub41_Sub1_1.method20254(arg0);
			client.aClass82_2.method21601(local16);
		}
	}

	@OriginalMember(owner = "client!ft", name = "cr", descriptor = "(I)V", line = 729)
	void method23596(@OriginalArg(0) int arg0) {
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(16) Class3_Sub23 local16 = Class269.method25284(Class311.aClass311_37, client.aClass82_2.aClass577_2);
			local16.aClass3_Sub41_Sub1_1.method20254(arg0);
			client.aClass82_2.method21601(local16);
		}
	}

	@OriginalMember(owner = "client!ft", name = "ce", descriptor = "(I)V", line = 729)
	void method23601(@OriginalArg(0) int arg0) {
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(16) Class3_Sub23 local16 = Class269.method25284(Class311.aClass311_37, client.aClass82_2.aClass577_2);
			local16.aClass3_Sub41_Sub1_1.method20254(arg0);
			client.aClass82_2.method21601(local16);
		}
	}

	@OriginalMember(owner = "client!ft", name = "ch", descriptor = "(I)V", line = 729)
	void method23661(@OriginalArg(0) int arg0) {
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(16) Class3_Sub23 local16 = Class269.method25284(Class311.aClass311_37, client.aClass82_2.aClass577_2);
			local16.aClass3_Sub41_Sub1_1.method20254(arg0);
			client.aClass82_2.method21601(local16);
		}
	}

	@OriginalMember(owner = "client!ft", name = "ca", descriptor = "(I)V", line = 729)
	void method23663(@OriginalArg(0) int arg0) {
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(16) Class3_Sub23 local16 = Class269.method25284(Class311.aClass311_37, client.aClass82_2.aClass577_2);
			local16.aClass3_Sub41_Sub1_1.method20254(arg0);
			client.aClass82_2.method21601(local16);
		}
	}

	@OriginalMember(owner = "client!ft", name = "cw", descriptor = "(I)V", line = 729)
	void method23666(@OriginalArg(0) int arg0) {
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(16) Class3_Sub23 local16 = Class269.method25284(Class311.aClass311_37, client.aClass82_2.aClass577_2);
			local16.aClass3_Sub41_Sub1_1.method20254(arg0);
			client.aClass82_2.method21601(local16);
		}
	}

	@OriginalMember(owner = "client!ft", name = "ci", descriptor = "(I)V", line = 729)
	void method23679(@OriginalArg(0) int arg0) {
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(16) Class3_Sub23 local16 = Class269.method25284(Class311.aClass311_37, client.aClass82_2.aClass577_2);
			local16.aClass3_Sub41_Sub1_1.method20254(arg0);
			client.aClass82_2.method21601(local16);
		}
	}

	@OriginalMember(owner = "client!ft", name = "an", descriptor = "(IB)V", line = 737)
	public void method23595(@OriginalArg(0) int arg0) {
		this.method23573(arg0, 255);
	}

	@OriginalMember(owner = "client!ft", name = "cf", descriptor = "(I)V", line = 737)
	public void method23667(@OriginalArg(0) int arg0) {
		this.method23573(arg0, 255);
	}

	@OriginalMember(owner = "client!ft", name = "dv", descriptor = "(I)V", line = 737)
	public void method23668(@OriginalArg(0) int arg0) {
		this.method23573(arg0, 255);
	}

	@OriginalMember(owner = "client!ft", name = "aj", descriptor = "(IIB)V", line = 741)
	public void method23573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23675(arg0, arg1, false, 0, 0, 0, 0, 0);
	}

	@OriginalMember(owner = "client!ft", name = "df", descriptor = "(II)V", line = 741)
	public void method23669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23675(arg0, arg1, false, 0, 0, 0, 0, 0);
	}

	@OriginalMember(owner = "client!ft", name = "dh", descriptor = "(II)V", line = 741)
	public void method23670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23675(arg0, arg1, false, 0, 0, 0, 0, 0);
	}

	@OriginalMember(owner = "client!ft", name = "db", descriptor = "(II)V", line = 741)
	public void method23671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23675(arg0, arg1, false, 0, 0, 0, 0, 0);
	}

	@OriginalMember(owner = "client!ft", name = "dp", descriptor = "(IIZIIIII)V", line = 745)
	public void method23672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean648 || this.anInt3598 * 1551425297 == arg0) {
			return;
		}
		@Pc(14) Class366 local14 = this.method23598();
		if (local14 != null && local14.method26832().method29120() == arg0) {
			this.aClass366_5 = local14;
			this.anInt3598 = local14.method26832().method29120() * -1563954703;
			return;
		}
		@Pc(38) boolean local38 = false;
		if (this.anInt3598 * 1551425297 >= 0) {
			@Pc(47) Iterator local47 = this.aList4.iterator();
			while (local47.hasNext()) {
				@Pc(54) Class366 local54 = (Class366) local47.next();
				if (local54.method26881() == Class160.aClass160_11) {
					local54.method26819(2000);
					local38 = true;
				}
			}
		}
		this.aClass366_5 = null;
		this.anInt3598 = 1563954703;
		@Pc(74) Class366 local74 = null;
		if (this.aClass366_6 != null && this.aClass366_6.method26832() != null && this.aClass366_6.method26832().method29120() == arg0 && this.aClass366_6.method26844() == Class378.aClass378_5) {
			local74 = this.aClass366_6;
			this.aClass366_6 = null;
			this.aBoolean649 = false;
		}
		@Pc(113) float local113;
		if (local74 == null) {
			if (arg2) {
				local113 = arg6;
				@Pc(116) float local116 = (float) arg7;
				@Pc(125) Class320 local125 = new Class320((float) arg4, 0.0F, (float) arg5);
				local74 = this.method23686(Class160.aClass160_11, this, arg0, 0, local38 ? 0 : arg1, this.anInt3600 * 1959237575 == arg0 ? Class164.aClass164_4.method23300() : Class141.aClass141_9.method23024(), Class158.aClass158_3, local113, local116, local125, arg3, 255, true);
			} else {
				local74 = this.method23686(Class160.aClass160_11, this, arg0, 0, local38 ? 0 : arg1, this.anInt3600 * 1959237575 == arg0 ? Class164.aClass164_4.method23300() : Class141.aClass141_9.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local74 == null) {
			return;
		}
		if (!this.aBoolean650) {
			if (local38) {
				local113 = (float) arg1 / 255.0F;
				local74.method26828(local113, 2000);
			}
			local74.method26818();
		} else if (local74.method26844().anInt4702 * -1084743407 < Class378.aClass378_5.anInt4702 * -1084743407) {
			local74.method26817();
		}
		this.method23684(local74);
		this.aClass366_5 = local74;
		this.anInt3598 = arg0 * -1563954703;
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(255) Class3_Sub23 local255 = Class269.method25284(Class311.aClass311_120, client.aClass82_2.aClass577_2);
			local255.aClass3_Sub41_Sub1_1.method20254(this.anInt3598 * 1551425297);
			client.aClass82_2.method21601(local255);
		}
	}

	@OriginalMember(owner = "client!ft", name = "dk", descriptor = "(IIZIIIII)V", line = 745)
	public void method23673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean648 || this.anInt3598 * 1551425297 == arg0) {
			return;
		}
		@Pc(14) Class366 local14 = this.method23598();
		if (local14 != null && local14.method26832().method29120() == arg0) {
			this.aClass366_5 = local14;
			this.anInt3598 = local14.method26832().method29120() * -1563954703;
			return;
		}
		@Pc(38) boolean local38 = false;
		if (this.anInt3598 * 1551425297 >= 0) {
			@Pc(47) Iterator local47 = this.aList4.iterator();
			while (local47.hasNext()) {
				@Pc(54) Class366 local54 = (Class366) local47.next();
				if (local54.method26881() == Class160.aClass160_11) {
					local54.method26819(2000);
					local38 = true;
				}
			}
		}
		this.aClass366_5 = null;
		this.anInt3598 = 1563954703;
		@Pc(74) Class366 local74 = null;
		if (this.aClass366_6 != null && this.aClass366_6.method26832() != null && this.aClass366_6.method26832().method29120() == arg0 && this.aClass366_6.method26844() == Class378.aClass378_5) {
			local74 = this.aClass366_6;
			this.aClass366_6 = null;
			this.aBoolean649 = false;
		}
		@Pc(113) float local113;
		if (local74 == null) {
			if (arg2) {
				local113 = arg6;
				@Pc(116) float local116 = (float) arg7;
				@Pc(125) Class320 local125 = new Class320((float) arg4, 0.0F, (float) arg5);
				local74 = this.method23686(Class160.aClass160_11, this, arg0, 0, local38 ? 0 : arg1, this.anInt3600 * 1959237575 == arg0 ? Class164.aClass164_4.method23300() : Class141.aClass141_9.method23024(), Class158.aClass158_3, local113, local116, local125, arg3, 255, true);
			} else {
				local74 = this.method23686(Class160.aClass160_11, this, arg0, 0, local38 ? 0 : arg1, this.anInt3600 * 1959237575 == arg0 ? Class164.aClass164_4.method23300() : Class141.aClass141_9.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local74 == null) {
			return;
		}
		if (!this.aBoolean650) {
			if (local38) {
				local113 = (float) arg1 / 255.0F;
				local74.method26828(local113, 2000);
			}
			local74.method26818();
		} else if (local74.method26844().anInt4702 * -1084743407 < Class378.aClass378_5.anInt4702 * -1084743407) {
			local74.method26817();
		}
		this.method23684(local74);
		this.aClass366_5 = local74;
		this.anInt3598 = arg0 * -1563954703;
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(255) Class3_Sub23 local255 = Class269.method25284(Class311.aClass311_120, client.aClass82_2.aClass577_2);
			local255.aClass3_Sub41_Sub1_1.method20254(this.anInt3598 * 1551425297);
			client.aClass82_2.method21601(local255);
		}
	}

	@OriginalMember(owner = "client!ft", name = "dy", descriptor = "(IIZIIIII)V", line = 745)
	public void method23674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean648 || this.anInt3598 * 1551425297 == arg0) {
			return;
		}
		@Pc(14) Class366 local14 = this.method23598();
		if (local14 != null && local14.method26832().method29120() == arg0) {
			this.aClass366_5 = local14;
			this.anInt3598 = local14.method26832().method29120() * -1563954703;
			return;
		}
		@Pc(38) boolean local38 = false;
		if (this.anInt3598 * 1551425297 >= 0) {
			@Pc(47) Iterator local47 = this.aList4.iterator();
			while (local47.hasNext()) {
				@Pc(54) Class366 local54 = (Class366) local47.next();
				if (local54.method26881() == Class160.aClass160_11) {
					local54.method26819(2000);
					local38 = true;
				}
			}
		}
		this.aClass366_5 = null;
		this.anInt3598 = 1563954703;
		@Pc(74) Class366 local74 = null;
		if (this.aClass366_6 != null && this.aClass366_6.method26832() != null && this.aClass366_6.method26832().method29120() == arg0 && this.aClass366_6.method26844() == Class378.aClass378_5) {
			local74 = this.aClass366_6;
			this.aClass366_6 = null;
			this.aBoolean649 = false;
		}
		@Pc(113) float local113;
		if (local74 == null) {
			if (arg2) {
				local113 = arg6;
				@Pc(116) float local116 = (float) arg7;
				@Pc(125) Class320 local125 = new Class320((float) arg4, 0.0F, (float) arg5);
				local74 = this.method23686(Class160.aClass160_11, this, arg0, 0, local38 ? 0 : arg1, this.anInt3600 * 1959237575 == arg0 ? Class164.aClass164_4.method23300() : Class141.aClass141_9.method23024(), Class158.aClass158_3, local113, local116, local125, arg3, 255, true);
			} else {
				local74 = this.method23686(Class160.aClass160_11, this, arg0, 0, local38 ? 0 : arg1, this.anInt3600 * 1959237575 == arg0 ? Class164.aClass164_4.method23300() : Class141.aClass141_9.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local74 == null) {
			return;
		}
		if (!this.aBoolean650) {
			if (local38) {
				local113 = (float) arg1 / 255.0F;
				local74.method26828(local113, 2000);
			}
			local74.method26818();
		} else if (local74.method26844().anInt4702 * -1084743407 < Class378.aClass378_5.anInt4702 * -1084743407) {
			local74.method26817();
		}
		this.method23684(local74);
		this.aClass366_5 = local74;
		this.anInt3598 = arg0 * -1563954703;
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(255) Class3_Sub23 local255 = Class269.method25284(Class311.aClass311_120, client.aClass82_2.aClass577_2);
			local255.aClass3_Sub41_Sub1_1.method20254(this.anInt3598 * 1551425297);
			client.aClass82_2.method21601(local255);
		}
	}

	@OriginalMember(owner = "client!ft", name = "as", descriptor = "(IIZIIIIIS)V", line = 745)
	public void method23675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean648 || this.anInt3598 * 1551425297 == arg0) {
			return;
		}
		@Pc(14) Class366 local14 = this.method23598();
		if (local14 != null && local14.method26832().method29120() == arg0) {
			this.aClass366_5 = local14;
			this.anInt3598 = local14.method26832().method29120() * -1563954703;
			return;
		}
		@Pc(38) boolean local38 = false;
		if (this.anInt3598 * 1551425297 >= 0) {
			@Pc(47) Iterator local47 = this.aList4.iterator();
			while (local47.hasNext()) {
				@Pc(54) Class366 local54 = (Class366) local47.next();
				if (local54.method26881() == Class160.aClass160_11) {
					local54.method26819(2000);
					local38 = true;
				}
			}
		}
		this.aClass366_5 = null;
		this.anInt3598 = 1563954703;
		@Pc(74) Class366 local74 = null;
		if (this.aClass366_6 != null && this.aClass366_6.method26832() != null && this.aClass366_6.method26832().method29120() == arg0 && this.aClass366_6.method26844() == Class378.aClass378_5) {
			local74 = this.aClass366_6;
			this.aClass366_6 = null;
			this.aBoolean649 = false;
		}
		@Pc(113) float local113;
		if (local74 == null) {
			if (arg2) {
				local113 = arg6;
				@Pc(116) float local116 = (float) arg7;
				@Pc(125) Class320 local125 = new Class320((float) arg4, 0.0F, (float) arg5);
				local74 = this.method23686(Class160.aClass160_11, this, arg0, 0, local38 ? 0 : arg1, this.anInt3600 * 1959237575 == arg0 ? Class164.aClass164_4.method23300() : Class141.aClass141_9.method23024(), Class158.aClass158_3, local113, local116, local125, arg3, 255, true);
			} else {
				local74 = this.method23686(Class160.aClass160_11, this, arg0, 0, local38 ? 0 : arg1, this.anInt3600 * 1959237575 == arg0 ? Class164.aClass164_4.method23300() : Class141.aClass141_9.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, 255, true);
			}
		}
		if (local74 == null) {
			return;
		}
		if (!this.aBoolean650) {
			if (local38) {
				local113 = (float) arg1 / 255.0F;
				local74.method26828(local113, 2000);
			}
			local74.method26818();
		} else if (local74.method26844().anInt4702 * -1084743407 < Class378.aClass378_5.anInt4702 * -1084743407) {
			local74.method26817();
		}
		this.method23684(local74);
		this.aClass366_5 = local74;
		this.anInt3598 = arg0 * -1563954703;
		if (client.aClass82_2.aClass577_2 != null && Class594.method33424(client.anInt3039 * 1115111877)) {
			@Pc(255) Class3_Sub23 local255 = Class269.method25284(Class311.aClass311_120, client.aClass82_2.aClass577_2);
			local255.aClass3_Sub41_Sub1_1.method20254(this.anInt3598 * 1551425297);
			client.aClass82_2.method21601(local255);
		}
	}

	@OriginalMember(owner = "client!ft", name = "dg", descriptor = "()Lclient!oh;", line = 810)
	Class366 method23593() {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		@Pc(10) Class366 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class366) local3.next();
		} while (local10.method26881() != Class160.aClass160_11 || local10.method26844() != Class378.aClass378_10);
		return local10;
	}

	@OriginalMember(owner = "client!ft", name = "ai", descriptor = "(B)Lclient!oh;", line = 810)
	Class366 method23598() {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		@Pc(10) Class366 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class366) local3.next();
		} while (local10.method26881() != Class160.aClass160_11 || local10.method26844() != Class378.aClass378_10);
		return local10;
	}

	@OriginalMember(owner = "client!ft", name = "ds", descriptor = "()Lclient!oh;", line = 810)
	Class366 method23615() {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		@Pc(10) Class366 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class366) local3.next();
		} while (local10.method26881() != Class160.aClass160_11 || local10.method26844() != Class378.aClass378_10);
		return local10;
	}

	@OriginalMember(owner = "client!ft", name = "dq", descriptor = "()Lclient!oh;", line = 810)
	Class366 method23676() {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		@Pc(10) Class366 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class366) local3.next();
		} while (local10.method26881() != Class160.aClass160_11 || local10.method26844() != Class378.aClass378_10);
		return local10;
	}

	@OriginalMember(owner = "client!ft", name = "dr", descriptor = "()Lclient!oh;", line = 810)
	Class366 method23680() {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		@Pc(10) Class366 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class366) local3.next();
		} while (local10.method26881() != Class160.aClass160_11 || local10.method26844() != Class378.aClass378_10);
		return local10;
	}

	@OriginalMember(owner = "client!ft", name = "dt", descriptor = "()V", line = 821)
	public void method23586() {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class366 local10 = (Class366) local3.next();
			if (local10.method26881() == Class160.aClass160_11) {
				local10.method26819(500);
				if (local10.method26832().method29120() == this.anInt3598 * 1551425297) {
					this.method23594(this.anInt3598 * 1551425297);
					break;
				}
			}
		}
		this.aClass366_5 = null;
		this.anInt3598 = 1563954703;
	}

	@OriginalMember(owner = "client!ft", name = "aq", descriptor = "(I)V", line = 821)
	public void method23599() {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class366 local10 = (Class366) local3.next();
			if (local10.method26881() == Class160.aClass160_11) {
				local10.method26819(500);
				if (local10.method26832().method29120() == this.anInt3598 * 1551425297) {
					this.method23594(this.anInt3598 * 1551425297);
					break;
				}
			}
		}
		this.aClass366_5 = null;
		this.anInt3598 = 1563954703;
	}

	@OriginalMember(owner = "client!ft", name = "dd", descriptor = "()V", line = 821)
	public void method23640() {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class366 local10 = (Class366) local3.next();
			if (local10.method26881() == Class160.aClass160_11) {
				local10.method26819(500);
				if (local10.method26832().method29120() == this.anInt3598 * 1551425297) {
					this.method23594(this.anInt3598 * 1551425297);
					break;
				}
			}
		}
		this.aClass366_5 = null;
		this.anInt3598 = 1563954703;
	}

	@OriginalMember(owner = "client!ft", name = "dc", descriptor = "()V", line = 821)
	public void method23678() {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class366 local10 = (Class366) local3.next();
			if (local10.method26881() == Class160.aClass160_11) {
				local10.method26819(500);
				if (local10.method26832().method29120() == this.anInt3598 * 1551425297) {
					this.method23594(this.anInt3598 * 1551425297);
					break;
				}
			}
		}
		this.aClass366_5 = null;
		this.anInt3598 = 1563954703;
	}

	@OriginalMember(owner = "client!ft", name = "da", descriptor = "()V", line = 821)
	public void method23681() {
		@Pc(3) Iterator local3 = this.aList4.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class366 local10 = (Class366) local3.next();
			if (local10.method26881() == Class160.aClass160_11) {
				local10.method26819(500);
				if (local10.method26832().method29120() == this.anInt3598 * 1551425297) {
					this.method23594(this.anInt3598 * 1551425297);
					break;
				}
			}
		}
		this.aClass366_5 = null;
		this.anInt3598 = 1563954703;
	}

	@OriginalMember(owner = "client!ft", name = "av", descriptor = "(III)V", line = 837)
	public void method23600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean648 || (this.aBoolean650 || (arg1 == 0 || arg0 == -1))) {
			return;
		}
		if (!this.aBoolean650 && this.aClass366_5 != null) {
			this.aClass366_5.method26848();
		}
		@Pc(42) Class366 local42 = this.method23686(Class160.aClass160_12, this, arg0, 0, arg1, Class141.aClass141_9.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, 255, true);
		if (local42 != null) {
			local42.method26818();
			this.method23684(local42);
			this.aBoolean650 = true;
			this.anInt3591 = arg0 * -688256261;
		}
	}

	@OriginalMember(owner = "client!ft", name = "dz", descriptor = "(II)V", line = 837)
	public void method23682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean648 || (this.aBoolean650 || (arg1 == 0 || arg0 == -1))) {
			return;
		}
		if (!this.aBoolean650 && this.aClass366_5 != null) {
			this.aClass366_5.method26848();
		}
		@Pc(42) Class366 local42 = this.method23686(Class160.aClass160_12, this, arg0, 0, arg1, Class141.aClass141_9.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, 255, true);
		if (local42 != null) {
			local42.method26818();
			this.method23684(local42);
			this.aBoolean650 = true;
			this.anInt3591 = arg0 * -688256261;
		}
	}

	@OriginalMember(owner = "client!ft", name = "de", descriptor = "(II)V", line = 837)
	public void method23683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean648 || (this.aBoolean650 || (arg1 == 0 || arg0 == -1))) {
			return;
		}
		if (!this.aBoolean650 && this.aClass366_5 != null) {
			this.aClass366_5.method26848();
		}
		@Pc(42) Class366 local42 = this.method23686(Class160.aClass160_12, this, arg0, 0, arg1, Class141.aClass141_9.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, 255, true);
		if (local42 != null) {
			local42.method26818();
			this.method23684(local42);
			this.aBoolean650 = true;
			this.anInt3591 = arg0 * -688256261;
		}
	}

	@OriginalMember(owner = "client!ft", name = "dl", descriptor = "(Lclient!rs;ILclient!ahn;)V", line = 852)
	public void method23614(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray54 == null || arg1 >= arg0.anIntArrayArray54.length || arg0.anIntArrayArray54[arg1] == null || (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != arg2.aByte101 || !arg2.method21477())) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray54[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray54[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray54[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray54[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray444 != null && arg0.anIntArray445 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray445[arg1] - arg0.anIntArray444[arg1])) + arg0.anIntArray444[arg1];
		}
		@Pc(114) int local114 = arg0.anIntArray443 == null ? 255 : arg0.anIntArray443[arg1];
		if (local48 != 0) {
			if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class510.aClass3_Sub45_37.aClass60_Sub33_3.method14179() == 0) {
					return;
				}
			} else if (Class510.aClass3_Sub45_37.aClass60_Sub33_4.method14179() == 0) {
				return;
			}
			if (-1823261769 * arg0.anInt4938 != -1) {
				@Pc(161) int local161 = 0;
				if (arg2 instanceof Class26_Sub1_Sub1_Sub1) {
					local161 = ((Class26_Sub1_Sub1_Sub1) arg2).method16726();
				} else if (arg2 instanceof Class26_Sub1_Sub1_Sub4) {
					local161 = ((Class26_Sub1_Sub1_Sub4) arg2).method20599();
				} else if (arg2 instanceof Class26_Sub1_Sub1_Sub5) {
					local161 = ((Class26_Sub1_Sub1_Sub5) arg2).method21043();
				}
				if (local161 != 0 && local161 != Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16726() && local161 != client.anInt3038 * -1628906843) {
					local114 = arg0.anInt4938 * -1823261769 * local114 / 100;
					if (local114 < 0) {
						local114 = 0;
					} else if (local114 > 255) {
						local114 = 255;
					}
				}
			}
			@Pc(223) Class320 local223 = arg2.method21431().aClass320_61;
			@Pc(231) int local231 = (int) local223.aFloat259 - 256 >> 9;
			@Pc(239) int local239 = (int) local223.aFloat261 - 256 >> 9;
			@Pc(252) Class320 local252 = new Class320((float) (local231 << 9), 0.0F, (float) (local239 << 9));
			@Pc(257) int local257 = arg2.aByte101 << 24;
			this.method23589(Class160.aClass160_7, local38, local44, local114, Class141.aClass141_1.method23024(), arg2 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 ? Class158.aClass158_1 : Class158.aClass158_5, 0.0F, (float) (local48 << 9), local252, local257, local65, 0);
		} else if (arg2 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3) {
			this.method23589(Class160.aClass160_6, local38, local44, local114, Class141.aClass141_10.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, arg2.aByte101, local65, 0);
		}
	}

	@OriginalMember(owner = "client!ft", name = "ax", descriptor = "(Lclient!rs;ILclient!ahn;B)V", line = 852)
	public void method23635(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray54 == null || arg1 >= arg0.anIntArrayArray54.length || arg0.anIntArrayArray54[arg1] == null || (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != arg2.aByte101 || !arg2.method21477())) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray54[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray54[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray54[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray54[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray444 != null && arg0.anIntArray445 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray445[arg1] - arg0.anIntArray444[arg1])) + arg0.anIntArray444[arg1];
		}
		@Pc(114) int local114 = arg0.anIntArray443 == null ? 255 : arg0.anIntArray443[arg1];
		if (local48 != 0) {
			if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class510.aClass3_Sub45_37.aClass60_Sub33_3.method14179() == 0) {
					return;
				}
			} else if (Class510.aClass3_Sub45_37.aClass60_Sub33_4.method14179() == 0) {
				return;
			}
			if (-1823261769 * arg0.anInt4938 != -1) {
				@Pc(161) int local161 = 0;
				if (arg2 instanceof Class26_Sub1_Sub1_Sub1) {
					local161 = ((Class26_Sub1_Sub1_Sub1) arg2).method16726();
				} else if (arg2 instanceof Class26_Sub1_Sub1_Sub4) {
					local161 = ((Class26_Sub1_Sub1_Sub4) arg2).method20599();
				} else if (arg2 instanceof Class26_Sub1_Sub1_Sub5) {
					local161 = ((Class26_Sub1_Sub1_Sub5) arg2).method21043();
				}
				if (local161 != 0 && local161 != Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16726() && local161 != client.anInt3038 * -1628906843) {
					local114 = arg0.anInt4938 * -1823261769 * local114 / 100;
					if (local114 < 0) {
						local114 = 0;
					} else if (local114 > 255) {
						local114 = 255;
					}
				}
			}
			@Pc(223) Class320 local223 = arg2.method21431().aClass320_61;
			@Pc(231) int local231 = (int) local223.aFloat259 - 256 >> 9;
			@Pc(239) int local239 = (int) local223.aFloat261 - 256 >> 9;
			@Pc(252) Class320 local252 = new Class320((float) (local231 << 9), 0.0F, (float) (local239 << 9));
			@Pc(257) int local257 = arg2.aByte101 << 24;
			this.method23589(Class160.aClass160_7, local38, local44, local114, Class141.aClass141_1.method23024(), arg2 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 ? Class158.aClass158_1 : Class158.aClass158_5, 0.0F, (float) (local48 << 9), local252, local257, local65, 0);
		} else if (arg2 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3) {
			this.method23589(Class160.aClass160_6, local38, local44, local114, Class141.aClass141_10.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, arg2.aByte101, local65, 0);
		}
	}

	@OriginalMember(owner = "client!ft", name = "dj", descriptor = "(Lclient!rs;ILclient!ahn;)V", line = 852)
	public void method23665(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray54 == null || arg1 >= arg0.anIntArrayArray54.length || arg0.anIntArrayArray54[arg1] == null || (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != arg2.aByte101 || !arg2.method21477())) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray54[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray54[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray54[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray54[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray444 != null && arg0.anIntArray445 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray445[arg1] - arg0.anIntArray444[arg1])) + arg0.anIntArray444[arg1];
		}
		@Pc(114) int local114 = arg0.anIntArray443 == null ? 255 : arg0.anIntArray443[arg1];
		if (local48 != 0) {
			if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class510.aClass3_Sub45_37.aClass60_Sub33_3.method14179() == 0) {
					return;
				}
			} else if (Class510.aClass3_Sub45_37.aClass60_Sub33_4.method14179() == 0) {
				return;
			}
			if (-1823261769 * arg0.anInt4938 != -1) {
				@Pc(161) int local161 = 0;
				if (arg2 instanceof Class26_Sub1_Sub1_Sub1) {
					local161 = ((Class26_Sub1_Sub1_Sub1) arg2).method16726();
				} else if (arg2 instanceof Class26_Sub1_Sub1_Sub4) {
					local161 = ((Class26_Sub1_Sub1_Sub4) arg2).method20599();
				} else if (arg2 instanceof Class26_Sub1_Sub1_Sub5) {
					local161 = ((Class26_Sub1_Sub1_Sub5) arg2).method21043();
				}
				if (local161 != 0 && local161 != Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16726() && local161 != client.anInt3038 * -1628906843) {
					local114 = arg0.anInt4938 * -1823261769 * local114 / 100;
					if (local114 < 0) {
						local114 = 0;
					} else if (local114 > 255) {
						local114 = 255;
					}
				}
			}
			@Pc(223) Class320 local223 = arg2.method21431().aClass320_61;
			@Pc(231) int local231 = (int) local223.aFloat259 - 256 >> 9;
			@Pc(239) int local239 = (int) local223.aFloat261 - 256 >> 9;
			@Pc(252) Class320 local252 = new Class320((float) (local231 << 9), 0.0F, (float) (local239 << 9));
			@Pc(257) int local257 = arg2.aByte101 << 24;
			this.method23589(Class160.aClass160_7, local38, local44, local114, Class141.aClass141_1.method23024(), arg2 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 ? Class158.aClass158_1 : Class158.aClass158_5, 0.0F, (float) (local48 << 9), local252, local257, local65, 0);
		} else if (arg2 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3) {
			this.method23589(Class160.aClass160_6, local38, local44, local114, Class141.aClass141_10.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, arg2.aByte101, local65, 0);
		}
	}

	@OriginalMember(owner = "client!ft", name = "dx", descriptor = "(Lclient!rs;I)V", line = 902)
	public void method23574(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray54 == null || arg1 >= arg0.anIntArrayArray54.length || arg0.anIntArrayArray54[arg1] == null) {
			return;
		}
		@Pc(24) int local24 = arg0.anIntArrayArray54[arg1][0];
		@Pc(28) int local28 = local24 >> 8;
		@Pc(34) int local34 = local24 >> 5 & 0x7;
		@Pc(51) int local51;
		if (arg0.anIntArrayArray54[arg1].length > 1) {
			local51 = (int) (Math.random() * (double) arg0.anIntArrayArray54[arg1].length);
			if (local51 > 0) {
				local28 = arg0.anIntArrayArray54[arg1][local51];
			}
		}
		local51 = 256;
		if (arg0.anIntArray444 != null && arg0.anIntArray445 != null) {
			local51 = (int) ((double) arg0.anIntArray444[arg1] + Math.random() * (double) (arg0.anIntArray445[arg1] - arg0.anIntArray444[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray443 == null ? 255 : arg0.anIntArray443[arg1];
		this.method23589(Class160.aClass160_10, local28, local34, local99, Class141.aClass141_1.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local51, 0);
	}

	@OriginalMember(owner = "client!ft", name = "az", descriptor = "(Lclient!rs;II)V", line = 902)
	public void method23602(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray54 == null || arg1 >= arg0.anIntArrayArray54.length || arg0.anIntArrayArray54[arg1] == null) {
			return;
		}
		@Pc(24) int local24 = arg0.anIntArrayArray54[arg1][0];
		@Pc(28) int local28 = local24 >> 8;
		@Pc(34) int local34 = local24 >> 5 & 0x7;
		@Pc(51) int local51;
		if (arg0.anIntArrayArray54[arg1].length > 1) {
			local51 = (int) (Math.random() * (double) arg0.anIntArrayArray54[arg1].length);
			if (local51 > 0) {
				local28 = arg0.anIntArrayArray54[arg1][local51];
			}
		}
		local51 = 256;
		if (arg0.anIntArray444 != null && arg0.anIntArray445 != null) {
			local51 = (int) ((double) arg0.anIntArray444[arg1] + Math.random() * (double) (arg0.anIntArray445[arg1] - arg0.anIntArray444[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray443 == null ? 255 : arg0.anIntArray443[arg1];
		this.method23589(Class160.aClass160_10, local28, local34, local99, Class141.aClass141_1.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local51, 0);
	}

	@OriginalMember(owner = "client!ft", name = "dm", descriptor = "(Lclient!rs;I)V", line = 902)
	public void method23687(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray54 == null || arg1 >= arg0.anIntArrayArray54.length || arg0.anIntArrayArray54[arg1] == null) {
			return;
		}
		@Pc(24) int local24 = arg0.anIntArrayArray54[arg1][0];
		@Pc(28) int local28 = local24 >> 8;
		@Pc(34) int local34 = local24 >> 5 & 0x7;
		@Pc(51) int local51;
		if (arg0.anIntArrayArray54[arg1].length > 1) {
			local51 = (int) (Math.random() * (double) arg0.anIntArrayArray54[arg1].length);
			if (local51 > 0) {
				local28 = arg0.anIntArrayArray54[arg1][local51];
			}
		}
		local51 = 256;
		if (arg0.anIntArray444 != null && arg0.anIntArray445 != null) {
			local51 = (int) ((double) arg0.anIntArray444[arg1] + Math.random() * (double) (arg0.anIntArray445[arg1] - arg0.anIntArray444[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray443 == null ? 255 : arg0.anIntArray443[arg1];
		this.method23589(Class160.aClass160_10, local28, local34, local99, Class141.aClass141_1.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local51, 0);
	}

	@OriginalMember(owner = "client!ft", name = "bc", descriptor = "(Lclient!vs;I)V", line = 4305)
	static final void method23688(@OriginalArg(0) Class536 arg0) {
		@Pc(16) boolean local16 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] != 0;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 != null) {
			Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1.method29197(local16);
		}
	}

	@OriginalMember(owner = "client!ft", name = "no", descriptor = "(Lclient!vs;B)V", line = 6483)
	static final void method23689(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class51_Sub1.method9865(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ft", name = "nr", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6595)
	static final void method23690(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray35 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!ft", name = "zq", descriptor = "(Lclient!vs;S)V", line = 8649)
	static final void method23691(@OriginalArg(0) Class536 arg0) {
		if (Class68.aClass3_Sub30_2 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
			arg0.aClass3_Sub30_3 = Class68.aClass3_Sub30_2;
		}
	}

	@OriginalMember(owner = "client!ft", name = "abe", descriptor = "(Lclient!vs;B)V", line = 8895)
	static final void method23693(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (local13 > 700 || local23 > 700) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 256;
		}
		@Pc(58) double local58 = (Math.random() * (double) (local13 + local23) - (double) local13 + 800.0D) / 100.0D;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) (Math.pow(2.0D, local58) + 0.5D);
	}

	@OriginalMember(owner = "client!ft", name = "aqd", descriptor = "(Lclient!vs;I)V", line = 11880)
	static final void method23692(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(28) boolean local28 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1;
		@Pc(38) int local38 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(53) boolean local53 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3] == 1;
		Class528.method32449(local13, local28, local38, local53);
	}
}
