package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public class Class264 {

	@OriginalMember(owner = "client!js", name = "s", descriptor = "I")
	static int anInt4207;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "Ljava/util/Map;")
	Map aMap10 = new HashMap();

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Lclient!ju;")
	Class48 aClass48_1;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!ju;)V", line = 10)
	public Class264(@OriginalArg(0) Class48 arg0) {
		this.aClass48_1 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "l", descriptor = "()V", line = 15)
	public void method25227() {
		@Pc(4) Iterator local4 = this.aMap10.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class275 local11 = (Class275) local4.next();
			local11.method25357();
		}
	}

	@OriginalMember(owner = "client!js", name = "p", descriptor = "(B)V", line = 15)
	public void method25230() {
		@Pc(4) Iterator local4 = this.aMap10.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class275 local11 = (Class275) local4.next();
			local11.method25357();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIFLclient!jf;I)Lclient!kf;", line = 22)
	public Class275 method25228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface25 arg3) {
		if (this.method25226(arg0) != null) {
			return null;
		}
		@Pc(8) Class275 local8 = null;
		if (arg1 != -1) {
			local8 = this.method25226(arg1);
		}
		@Pc(22) Object local22 = this.aClass48_1.method9523(local8);
		@Pc(32) Class275 local32 = new Class275(arg0, arg2, local22, this, arg3, local8);
		this.aMap10.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!js", name = "h", descriptor = "(IIFLclient!jf;)Lclient!kf;", line = 22)
	public Class275 method25229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface25 arg3) {
		if (this.method25226(arg0) != null) {
			return null;
		}
		@Pc(8) Class275 local8 = null;
		if (arg1 != -1) {
			local8 = this.method25226(arg1);
		}
		@Pc(22) Object local22 = this.aClass48_1.method9523(local8);
		@Pc(32) Class275 local32 = new Class275(arg0, arg2, local22, this, arg3, local8);
		this.aMap10.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!js", name = "x", descriptor = "(IIFLclient!jf;)Lclient!kf;", line = 22)
	public Class275 method25231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface25 arg3) {
		if (this.method25226(arg0) != null) {
			return null;
		}
		@Pc(8) Class275 local8 = null;
		if (arg1 != -1) {
			local8 = this.method25226(arg1);
		}
		@Pc(22) Object local22 = this.aClass48_1.method9523(local8);
		@Pc(32) Class275 local32 = new Class275(arg0, arg2, local22, this, arg3, local8);
		this.aMap10.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!js", name = "g", descriptor = "(II)Lclient!kf;", line = 34)
	public Class275 method25226(@OriginalArg(0) int arg0) {
		return (Class275) this.aMap10.get(arg0);
	}

	@OriginalMember(owner = "client!js", name = "amz", descriptor = "(Lclient!vs;B)V", line = 11333)
	static final void method25232(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1 ? 2 : 0);
		client.aClass370_1.method26968();
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}

	@OriginalMember(owner = "client!js", name = "asb", descriptor = "(Lclient!vs;I)V", line = 12176)
	static final void method25233(@OriginalArg(0) Class536 arg0) {
		@Pc(2) int local2 = Class338.method26414();
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (Class598.anInt5521 = Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() * 536063707) * 468098387;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local2;
		Class412.method27705();
		client.aClass370_1.method26968();
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
