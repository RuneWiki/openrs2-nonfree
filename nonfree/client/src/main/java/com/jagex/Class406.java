package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public class Class406 {

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "Lclient!eb;")
	Class240 aClass240_81 = new Class240(10485760, 256);

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_38;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "Lclient!es;")
	final Interface24 anInterface24_9;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!afc;Lclient!es;)V", line = 13)
	Class406(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Interface24 arg1) {
		this.aClass104_Sub2_38 = arg0;
		this.anInterface24_9 = arg1;
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(Lclient!dv;)Lclient!lz;", line = 19)
	Interface38 method28562(@OriginalArg(0) Class235 arg0) {
		return this.method28568(arg0, arg0.anInt3806 * -923926085);
	}

	@OriginalMember(owner = "client!lu", name = "w", descriptor = "(Lclient!dv;)Lclient!lz;", line = 19)
	Interface38 method28563(@OriginalArg(0) Class235 arg0) {
		return this.method28568(arg0, arg0.anInt3806 * -923926085);
	}

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "(Lclient!dv;)Lclient!lz;", line = 19)
	Interface38 method28564(@OriginalArg(0) Class235 arg0) {
		return this.method28568(arg0, arg0.anInt3806 * -923926085);
	}

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "(Lclient!dv;)Lclient!lz;", line = 19)
	Interface38 method28569(@OriginalArg(0) Class235 arg0) {
		return this.method28568(arg0, arg0.anInt3806 * -923926085);
	}

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "(Lclient!dv;I)Lclient!lz;", line = 23)
	Interface38 method28568(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3787 * 595186169);
		@Pc(15) Interface38 local15 = (Interface38) this.aClass240_81.method25839(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method28565(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3806 * -923926085;
			}
			@Pc(91) Interface38 local91;
			if (arg0.aBoolean655 && this.aClass104_Sub2_38.method20541()) {
				@Pc(110) float[] local110 = this.anInterface24_9.method6766(Class616.aClass616_2, arg0.anInt3788 * -1747960127, arg0.anInt3769 * -764718997, 0.7F, arg1, arg1);
				local91 = this.aClass104_Sub2_38.method20920(Class206.aClass206_22, arg1, arg1, true, local110);
			} else {
				@Pc(64) int[] local64;
				if (arg0.aClass618_2 == Class618.aClass618_5 && Class588.method31649(arg0.aByte114)) {
					local64 = this.anInterface24_9.method6764(Class616.aClass616_2, arg0.anInt3788 * -1747960127, 0.7F, arg1, arg1);
				} else {
					local64 = this.anInterface24_9.method6780(Class616.aClass616_2, arg0.anInt3788 * -1747960127, 0.7F, arg1, arg1);
				}
				if (local64 == null) {
					return null;
				}
				local91 = this.aClass104_Sub2_38.method21133(arg1, arg1, true, local64);
			}
			local91.method11344(arg0.aByte113 == 1, arg0.aByte120 == 1);
			this.aClass240_81.method25831(local91, local9, arg1 * arg1);
			return local91;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "z", descriptor = "(Lclient!dv;I)Lclient!lz;", line = 23)
	Interface38 method28575(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3787 * 595186169);
		@Pc(15) Interface38 local15 = (Interface38) this.aClass240_81.method25839(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method28565(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3806 * -923926085;
			}
			@Pc(91) Interface38 local91;
			if (arg0.aBoolean655 && this.aClass104_Sub2_38.method20541()) {
				@Pc(110) float[] local110 = this.anInterface24_9.method6766(Class616.aClass616_2, arg0.anInt3788 * -1747960127, arg0.anInt3769 * -764718997, 0.7F, arg1, arg1);
				local91 = this.aClass104_Sub2_38.method20920(Class206.aClass206_22, arg1, arg1, true, local110);
			} else {
				@Pc(64) int[] local64;
				if (arg0.aClass618_2 == Class618.aClass618_5 && Class588.method31649(arg0.aByte114)) {
					local64 = this.anInterface24_9.method6764(Class616.aClass616_2, arg0.anInt3788 * -1747960127, 0.7F, arg1, arg1);
				} else {
					local64 = this.anInterface24_9.method6780(Class616.aClass616_2, arg0.anInt3788 * -1747960127, 0.7F, arg1, arg1);
				}
				if (local64 == null) {
					return null;
				}
				local91 = this.aClass104_Sub2_38.method21133(arg1, arg1, true, local64);
			}
			local91.method11344(arg0.aByte113 == 1, arg0.aByte120 == 1);
			this.aClass240_81.method25831(local91, local9, arg1 * arg1);
			return local91;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "(Lclient!dv;I)Z", line = 50)
	boolean method28565(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3806 * -923926085;
		}
		if (arg0.aBoolean655 && this.aClass104_Sub2_38.method20541()) {
			return this.anInterface24_9.method6765(Class616.aClass616_2, arg0.anInt3788 * -1747960127, arg0.anInt3769 * -764718997, Class609.aClass609_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass618_2 == Class618.aClass618_5 && Class588.method31649(arg0.aByte114)) {
			return this.anInterface24_9.method6765(Class616.aClass616_2, arg0.anInt3788 * -1747960127, -1, Class609.aClass609_1, 0.7F, arg1, arg1);
		} else {
			return this.anInterface24_9.method6765(Class616.aClass616_2, arg0.anInt3788 * -1747960127, -1, Class609.aClass609_2, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "(Lclient!dv;I)Z", line = 50)
	boolean method28571(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3806 * -923926085;
		}
		if (arg0.aBoolean655 && this.aClass104_Sub2_38.method20541()) {
			return this.anInterface24_9.method6765(Class616.aClass616_2, arg0.anInt3788 * -1747960127, arg0.anInt3769 * -764718997, Class609.aClass609_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass618_2 == Class618.aClass618_5 && Class588.method31649(arg0.aByte114)) {
			return this.anInterface24_9.method6765(Class616.aClass616_2, arg0.anInt3788 * -1747960127, -1, Class609.aClass609_1, 0.7F, arg1, arg1);
		} else {
			return this.anInterface24_9.method6765(Class616.aClass616_2, arg0.anInt3788 * -1747960127, -1, Class609.aClass609_2, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(Lclient!dv;I)Z", line = 50)
	boolean method28572(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3806 * -923926085;
		}
		if (arg0.aBoolean655 && this.aClass104_Sub2_38.method20541()) {
			return this.anInterface24_9.method6765(Class616.aClass616_2, arg0.anInt3788 * -1747960127, arg0.anInt3769 * -764718997, Class609.aClass609_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass618_2 == Class618.aClass618_5 && Class588.method31649(arg0.aByte114)) {
			return this.anInterface24_9.method6765(Class616.aClass616_2, arg0.anInt3788 * -1747960127, -1, Class609.aClass609_1, 0.7F, arg1, arg1);
		} else {
			return this.anInterface24_9.method6765(Class616.aClass616_2, arg0.anInt3788 * -1747960127, -1, Class609.aClass609_2, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "()V", line = 61)
	void method28566() {
		this.aClass240_81.method25832(5);
	}

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "()V", line = 61)
	void method28570() {
		this.aClass240_81.method25832(5);
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "()V", line = 61)
	void method28573() {
		this.aClass240_81.method25832(5);
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "()V", line = 65)
	void method28567() {
		this.aClass240_81.method25833();
	}

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "()V", line = 65)
	void method28574() {
		this.aClass240_81.method25833();
	}

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "()V", line = 65)
	void method28576() {
		this.aClass240_81.method25833();
	}

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "()V", line = 65)
	void method28577() {
		this.aClass240_81.method25833();
	}
}
