package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amn")
public class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amn", name = "y", descriptor = "I")
	int anInt2669;

	@OriginalMember(owner = "client!amn", name = "s", descriptor = "Ljava/lang/String;")
	final String aString112;

	@OriginalMember(owner = "client!amn", name = "u", descriptor = "Lclient!wc;")
	final Class546 aClass546_9;

	@OriginalMember(owner = "client!amn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 1967)
	Class3_Sub1_Sub9(@OriginalArg(0) String arg0) {
		this.aString112 = arg0;
		this.aClass546_9 = new Class546();
	}

	@OriginalMember(owner = "client!amn", name = "p", descriptor = "(B)I", line = 1973)
	int method19051() {
		return this.aClass546_9.aClass3_Sub1_62 == this.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66 ? -1 : ((Class3_Sub1_Sub7) this.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66).anInt2664 * 296027207;
	}

	@OriginalMember(owner = "client!amn", name = "l", descriptor = "()I", line = 1973)
	int method19054() {
		return this.aClass546_9.aClass3_Sub1_62 == this.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66 ? -1 : ((Class3_Sub1_Sub7) this.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66).anInt2664 * 296027207;
	}

	@OriginalMember(owner = "client!amn", name = "x", descriptor = "()I", line = 1973)
	int method19056() {
		return this.aClass546_9.aClass3_Sub1_62 == this.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66 ? -1 : ((Class3_Sub1_Sub7) this.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66).anInt2664 * 296027207;
	}

	@OriginalMember(owner = "client!amn", name = "h", descriptor = "()I", line = 1973)
	int method19057() {
		return this.aClass546_9.aClass3_Sub1_62 == this.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66 ? -1 : ((Class3_Sub1_Sub7) this.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66).anInt2664 * 296027207;
	}

	@OriginalMember(owner = "client!amn", name = "a", descriptor = "(Lclient!aml;I)Z", line = 1978)
	boolean method19052(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		@Pc(1) boolean local1 = true;
		arg0.method33669();
		@Pc(10) Class3_Sub1_Sub7 local10 = (Class3_Sub1_Sub7) this.aClass546_9.method32623();
		while (local10 != null) {
			if (Class472.method28776(arg0.anInt2664 * 296027207, local10.anInt2664 * 296027207)) {
				Class425.method27900(arg0, local10);
				this.anInt2669 += 1264749909;
				return !local1;
			}
			local10 = (Class3_Sub1_Sub7) this.aClass546_9.method32645();
			local1 = false;
		}
		this.aClass546_9.method32621(arg0);
		this.anInt2669 += 1264749909;
		return local1;
	}

	@OriginalMember(owner = "client!amn", name = "s", descriptor = "(Lclient!aml;)Z", line = 1978)
	boolean method19058(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		@Pc(1) boolean local1 = true;
		arg0.method33669();
		@Pc(10) Class3_Sub1_Sub7 local10 = (Class3_Sub1_Sub7) this.aClass546_9.method32623();
		while (local10 != null) {
			if (Class472.method28776(arg0.anInt2664 * 296027207, local10.anInt2664 * 296027207)) {
				Class425.method27900(arg0, local10);
				this.anInt2669 += 1264749909;
				return !local1;
			}
			local10 = (Class3_Sub1_Sub7) this.aClass546_9.method32645();
			local1 = false;
		}
		this.aClass546_9.method32621(arg0);
		this.anInt2669 += 1264749909;
		return local1;
	}

	@OriginalMember(owner = "client!amn", name = "y", descriptor = "(Lclient!aml;)Z", line = 1993)
	boolean method19050(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method19051();
		arg0.method33669();
		this.anInt2669 -= 1264749909;
		if (this.anInt2669 * 2127103997 != 0) {
			return local3 != this.method19051();
		}
		this.method33656();
		this.method33669();
		Class250.anInt3812 -= -1096261629;
		Class250.aClass161_29.method23222(this, arg0.aLong155 * 4089614541957148765L);
		return false;
	}

	@OriginalMember(owner = "client!amn", name = "g", descriptor = "(Lclient!aml;B)Z", line = 1993)
	boolean method19053(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method19051();
		arg0.method33669();
		this.anInt2669 -= 1264749909;
		if (this.anInt2669 * 2127103997 != 0) {
			return local3 != this.method19051();
		}
		this.method33656();
		this.method33669();
		Class250.anInt3812 -= -1096261629;
		Class250.aClass161_29.method23222(this, arg0.aLong155 * 4089614541957148765L);
		return false;
	}

	@OriginalMember(owner = "client!amn", name = "u", descriptor = "(Lclient!aml;)Z", line = 1993)
	boolean method19055(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method19051();
		arg0.method33669();
		this.anInt2669 -= 1264749909;
		if (this.anInt2669 * 2127103997 != 0) {
			return local3 != this.method19051();
		}
		this.method33656();
		this.method33669();
		Class250.anInt3812 -= -1096261629;
		Class250.aClass161_29.method23222(this, arg0.aLong155 * 4089614541957148765L);
		return false;
	}
}
