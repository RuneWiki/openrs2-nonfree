package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alz")
public class Class147_Sub2 extends Class147 {

	@OriginalMember(owner = "client!alz", name = "<init>", descriptor = "()V", line = 11)
	Class147_Sub2() {
	}

	@OriginalMember(owner = "client!alz", name = "t", descriptor = "(B)V", line = 14)
	@Override
	void method15642() {
		@Pc(3) Class77_Sub42 local3 = this.method15644();
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12 = this.method15617(local3, 32767);
		@Pc(16) int local16 = local3.method22717();
		if (local16 < 0) {
			local16 = 0;
		} else if (local16 > 65535) {
			local16 = 65535;
		}
		@Pc(30) int local30 = local3.method22716();
		if (local30 < 0) {
			local30 = 0;
		} else if (local30 > 65535) {
			local30 = 65535;
		}
		@Pc(42) byte local42 = 0;
		if (local3.method22715() == 2) {
			local42 = 1;
		}
		@Pc(55) Class77_Sub20 local55 = Class365.method28132(Class414.aClass414_35, client.aClass82_2.aClass16_1);
		local55.aClass77_Sub39_Sub1_2.method22605(local12 | local42 << 15);
		local55.aClass77_Sub39_Sub1_2.method22638(local30 | local16 << 16);
		client.aClass82_2.method2004(local55);
	}

	@OriginalMember(owner = "client!alz", name = "d", descriptor = "()V", line = 14)
	@Override
	void method15631() {
		@Pc(3) Class77_Sub42 local3 = this.method15644();
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12 = this.method15617(local3, 32767);
		@Pc(16) int local16 = local3.method22717();
		if (local16 < 0) {
			local16 = 0;
		} else if (local16 > 65535) {
			local16 = 65535;
		}
		@Pc(30) int local30 = local3.method22716();
		if (local30 < 0) {
			local30 = 0;
		} else if (local30 > 65535) {
			local30 = 65535;
		}
		@Pc(42) byte local42 = 0;
		if (local3.method22715() == 2) {
			local42 = 1;
		}
		@Pc(55) Class77_Sub20 local55 = Class365.method28132(Class414.aClass414_35, client.aClass82_2.aClass16_1);
		local55.aClass77_Sub39_Sub1_2.method22605(local12 | local42 << 15);
		local55.aClass77_Sub39_Sub1_2.method22638(local30 | local16 << 16);
		client.aClass82_2.method2004(local55);
	}

	@OriginalMember(owner = "client!alz", name = "r", descriptor = "()V", line = 14)
	@Override
	void method15632() {
		@Pc(3) Class77_Sub42 local3 = this.method15644();
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12 = this.method15617(local3, 32767);
		@Pc(16) int local16 = local3.method22717();
		if (local16 < 0) {
			local16 = 0;
		} else if (local16 > 65535) {
			local16 = 65535;
		}
		@Pc(30) int local30 = local3.method22716();
		if (local30 < 0) {
			local30 = 0;
		} else if (local30 > 65535) {
			local30 = 65535;
		}
		@Pc(42) byte local42 = 0;
		if (local3.method22715() == 2) {
			local42 = 1;
		}
		@Pc(55) Class77_Sub20 local55 = Class365.method28132(Class414.aClass414_35, client.aClass82_2.aClass16_1);
		local55.aClass77_Sub39_Sub1_2.method22605(local12 | local42 << 15);
		local55.aClass77_Sub39_Sub1_2.method22638(local30 | local16 << 16);
		client.aClass82_2.method2004(local55);
	}

	@OriginalMember(owner = "client!alz", name = "s", descriptor = "()V", line = 14)
	@Override
	void method15627() {
		@Pc(3) Class77_Sub42 local3 = this.method15644();
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12 = this.method15617(local3, 32767);
		@Pc(16) int local16 = local3.method22717();
		if (local16 < 0) {
			local16 = 0;
		} else if (local16 > 65535) {
			local16 = 65535;
		}
		@Pc(30) int local30 = local3.method22716();
		if (local30 < 0) {
			local30 = 0;
		} else if (local30 > 65535) {
			local30 = 65535;
		}
		@Pc(42) byte local42 = 0;
		if (local3.method22715() == 2) {
			local42 = 1;
		}
		@Pc(55) Class77_Sub20 local55 = Class365.method28132(Class414.aClass414_35, client.aClass82_2.aClass16_1);
		local55.aClass77_Sub39_Sub1_2.method22605(local12 | local42 << 15);
		local55.aClass77_Sub39_Sub1_2.method22638(local30 | local16 << 16);
		client.aClass82_2.method2004(local55);
	}

	@OriginalMember(owner = "client!alz", name = "q", descriptor = "(B)Z", line = 34)
	@Override
	boolean method15629() {
		return this.method15644() != null || this.aLong110 * 1164426520149525653L < Class280.method26667() - 2000L;
	}

	@OriginalMember(owner = "client!alz", name = "g", descriptor = "()Z", line = 34)
	@Override
	boolean method15633() {
		return this.method15644() != null || this.aLong110 * 1164426520149525653L < Class280.method26667() - 2000L;
	}

	@OriginalMember(owner = "client!alz", name = "ad", descriptor = "(I)Lclient!akz;", line = 38)
	Class77_Sub42 method15644() {
		return (Class77_Sub42) client.aClass695_44.method36395();
	}

	@OriginalMember(owner = "client!alz", name = "av", descriptor = "()Lclient!akz;", line = 38)
	Class77_Sub42 method15645() {
		return (Class77_Sub42) client.aClass695_44.method36395();
	}

	@OriginalMember(owner = "client!alz", name = "ac", descriptor = "()Lclient!akz;", line = 38)
	Class77_Sub42 method15646() {
		return (Class77_Sub42) client.aClass695_44.method36395();
	}

	@OriginalMember(owner = "client!alz", name = "x", descriptor = "(I)Lclient!ajt;", line = 43)
	@Override
	Class77_Sub20 method15643() {
		return Class365.method28132(Class414.aClass414_77, client.aClass82_2.aClass16_1);
	}

	@OriginalMember(owner = "client!alz", name = "z", descriptor = "()Lclient!ajt;", line = 43)
	@Override
	Class77_Sub20 method15634() {
		return Class365.method28132(Class414.aClass414_77, client.aClass82_2.aClass16_1);
	}

	@OriginalMember(owner = "client!alz", name = "i", descriptor = "()Lclient!ajt;", line = 43)
	@Override
	Class77_Sub20 method15636() {
		return Class365.method28132(Class414.aClass414_77, client.aClass82_2.aClass16_1);
	}

	@OriginalMember(owner = "client!alz", name = "j", descriptor = "()Lclient!ajt;", line = 43)
	@Override
	Class77_Sub20 method15635() {
		return Class365.method28132(Class414.aClass414_77, client.aClass82_2.aClass16_1);
	}

	@OriginalMember(owner = "client!alz", name = "w", descriptor = "(Lclient!akv;Lclient!akz;B)V", line = 46)
	@Override
	void method15628(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42 arg1) {
	}

	@OriginalMember(owner = "client!alz", name = "f", descriptor = "(Lclient!akv;Lclient!akz;)V", line = 46)
	@Override
	void method15639(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42 arg1) {
	}

	@OriginalMember(owner = "client!alz", name = "o", descriptor = "(Lclient!akv;Lclient!akz;)V", line = 46)
	@Override
	void method15640(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42 arg1) {
	}

	@OriginalMember(owner = "client!alz", name = "y", descriptor = "(I)I", line = 49)
	@Override
	int method15641() {
		return 0;
	}

	@OriginalMember(owner = "client!alz", name = "k", descriptor = "()I", line = 49)
	@Override
	int method15630() {
		return 0;
	}

	@OriginalMember(owner = "client!alz", name = "u", descriptor = "()I", line = 49)
	@Override
	int method15637() {
		return 0;
	}

	@OriginalMember(owner = "client!alz", name = "e", descriptor = "()I", line = 49)
	@Override
	int method15638() {
		return 0;
	}
}
