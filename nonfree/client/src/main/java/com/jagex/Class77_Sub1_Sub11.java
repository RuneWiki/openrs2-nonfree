package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!are")
public class Class77_Sub1_Sub11 extends Class77_Sub1 {

	@OriginalMember(owner = "client!are", name = "x", descriptor = "I")
	int anInt3023;

	@OriginalMember(owner = "client!are", name = "t", descriptor = "Ljava/lang/String;")
	final String aString107;

	@OriginalMember(owner = "client!are", name = "q", descriptor = "Lclient!zi;")
	final Class691 aClass691_11;

	@OriginalMember(owner = "client!are", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 1962)
	Class77_Sub1_Sub11(@OriginalArg(0) String arg0) {
		this.aString107 = arg0;
		this.aClass691_11 = new Class691();
	}

	@OriginalMember(owner = "client!are", name = "p", descriptor = "(B)I", line = 1968)
	int method22225() {
		return this.aClass691_11.aClass77_Sub1_66 == this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62 ? -1 : ((Class77_Sub1_Sub7) this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62).anInt2987 * -1986934021;
	}

	@OriginalMember(owner = "client!are", name = "l", descriptor = "()I", line = 1968)
	int method22226() {
		return this.aClass691_11.aClass77_Sub1_66 == this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62 ? -1 : ((Class77_Sub1_Sub7) this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62).anInt2987 * -1986934021;
	}

	@OriginalMember(owner = "client!are", name = "y", descriptor = "()I", line = 1968)
	int method22227() {
		return this.aClass691_11.aClass77_Sub1_66 == this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62 ? -1 : ((Class77_Sub1_Sub7) this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62).anInt2987 * -1986934021;
	}

	@OriginalMember(owner = "client!are", name = "w", descriptor = "()I", line = 1968)
	int method22228() {
		return this.aClass691_11.aClass77_Sub1_66 == this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62 ? -1 : ((Class77_Sub1_Sub7) this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62).anInt2987 * -1986934021;
	}

	@OriginalMember(owner = "client!are", name = "q", descriptor = "()I", line = 1968)
	int method22229() {
		return this.aClass691_11.aClass77_Sub1_66 == this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62 ? -1 : ((Class77_Sub1_Sub7) this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62).anInt2987 * -1986934021;
	}

	@OriginalMember(owner = "client!are", name = "t", descriptor = "()I", line = 1968)
	int method22230() {
		return this.aClass691_11.aClass77_Sub1_66 == this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62 ? -1 : ((Class77_Sub1_Sub7) this.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62).anInt2987 * -1986934021;
	}

	@OriginalMember(owner = "client!are", name = "c", descriptor = "(Lclient!aqm;I)Z", line = 1973)
	boolean method22231(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		@Pc(1) boolean local1 = true;
		arg0.method24069();
		@Pc(10) Class77_Sub1_Sub7 local10 = (Class77_Sub1_Sub7) this.aClass691_11.method36335();
		while (local10 != null) {
			if (Class290.method26996(arg0.anInt2987 * -1986934021, local10.anInt2987 * -1986934021)) {
				Class276.method26566(arg0, local10);
				this.anInt3023 += -2069883529;
				return !local1;
			}
			local10 = (Class77_Sub1_Sub7) this.aClass691_11.method36340();
			local1 = false;
		}
		this.aClass691_11.method36326(arg0);
		this.anInt3023 += -2069883529;
		return local1;
	}

	@OriginalMember(owner = "client!are", name = "s", descriptor = "(Lclient!aqm;)Z", line = 1988)
	boolean method22232(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method22225();
		arg0.method24069();
		this.anInt3023 -= -2069883529;
		if (this.anInt3023 * -475442105 != 0) {
			return local3 != this.method22225();
		}
		this.method24063();
		this.method24069();
		Class683.anInt5840 -= -210574503;
		Class683.aClass232_93.method25844(this, arg0.aLong150 * -6387465159951953483L);
		return false;
	}

	@OriginalMember(owner = "client!are", name = "v", descriptor = "(Lclient!aqm;I)Z", line = 1988)
	boolean method22233(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method22225();
		arg0.method24069();
		this.anInt3023 -= -2069883529;
		if (this.anInt3023 * -475442105 != 0) {
			return local3 != this.method22225();
		}
		this.method24063();
		this.method24069();
		Class683.anInt5840 -= -210574503;
		Class683.aClass232_93.method25844(this, arg0.aLong150 * -6387465159951953483L);
		return false;
	}

	@OriginalMember(owner = "client!are", name = "x", descriptor = "(Lclient!aqm;)Z", line = 1988)
	boolean method22234(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method22225();
		arg0.method24069();
		this.anInt3023 -= -2069883529;
		if (this.anInt3023 * -475442105 != 0) {
			return local3 != this.method22225();
		}
		this.method24063();
		this.method24069();
		Class683.anInt5840 -= -210574503;
		Class683.aClass232_93.method25844(this, arg0.aLong150 * -6387465159951953483L);
		return false;
	}

	@OriginalMember(owner = "client!are", name = "d", descriptor = "(Lclient!aqm;)Z", line = 1988)
	boolean method22235(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method22225();
		arg0.method24069();
		this.anInt3023 -= -2069883529;
		if (this.anInt3023 * -475442105 != 0) {
			return local3 != this.method22225();
		}
		this.method24063();
		this.method24069();
		Class683.anInt5840 -= -210574503;
		Class683.aClass232_93.method25844(this, arg0.aLong150 * -6387465159951953483L);
		return false;
	}

	@OriginalMember(owner = "client!are", name = "ml", descriptor = "(Lclient!gm;IB)I", line = 12268)
	static int method22236(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1) {
		if (!client.method25376(arg0).method13646(arg1) && arg0.anObjectArray40 == null) {
			return -1;
		} else if (arg0.anIntArray397 == null || arg0.anIntArray397.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray397[arg1];
		}
	}
}
