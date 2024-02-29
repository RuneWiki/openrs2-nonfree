package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aln")
public class Class146_Sub1 extends Class146 implements Interface5 {

	@OriginalMember(owner = "client!aln", name = "fj", descriptor = "Lclient!pw;")
	public static Class478 aClass478_48;

	@OriginalMember(owner = "client!aln", name = "x", descriptor = "Lclient!pw;")
	final Class478 aClass478_47;

	@OriginalMember(owner = "client!aln", name = "o", descriptor = "(B)V", line = 723)
	public static void method15287() {
		Class277.aClass232_74.method25857();
		Class277.aClass232_72.method25857();
		Class277.aClass232_73.method25857();
		Class277.aClass232_71.method25857();
	}

	@OriginalMember(owner = "client!aln", name = "<init>", descriptor = "(ZLclient!pw;Lclient!yi;Lclient!ym;)V", line = 799)
	Class146_Sub1(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class667 arg2, @OriginalArg(3) Class670 arg3) {
		super(arg0, arg2, arg3);
		this.aClass478_47 = arg1;
	}

	@OriginalMember(owner = "client!aln", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 804)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class599(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!aln", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 804)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class599(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!aln", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 804)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class599(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!aln", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 804)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class599(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!aln", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 804)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class599(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!aln", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 808)
	@Override
	public Class method27822() {
		return Class599.class;
	}

	@OriginalMember(owner = "client!aln", name = "i", descriptor = "()Ljava/lang/Class;", line = 808)
	@Override
	public Class method27824() {
		return Class599.class;
	}

	@OriginalMember(owner = "client!aln", name = "x", descriptor = "(I)[B", line = 812)
	@Override
	byte[] method15276(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_47;
		synchronized (this.aClass478_47) {
			return this.aClass478_47.method29725(arg0, 0);
		}
	}

	@OriginalMember(owner = "client!aln", name = "q", descriptor = "(I)[B", line = 812)
	@Override
	byte[] method15279(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_47;
		synchronized (this.aClass478_47) {
			return this.aClass478_47.method29725(arg0, 0);
		}
	}

	@OriginalMember(owner = "client!aln", name = "k", descriptor = "(I)[B", line = 812)
	@Override
	byte[] method15273(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_47;
		synchronized (this.aClass478_47) {
			return this.aClass478_47.method29725(arg0, 0);
		}
	}

	@OriginalMember(owner = "client!aln", name = "w", descriptor = "(II)[B", line = 812)
	@Override
	byte[] method15274(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_47;
		synchronized (this.aClass478_47) {
			return this.aClass478_47.method29725(arg0, 0);
		}
	}

	@OriginalMember(owner = "client!aln", name = "u", descriptor = "(I)Z", line = 818)
	@Override
	boolean method15277(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_47;
		synchronized (this.aClass478_47) {
			return this.aClass478_47.method29727(arg0, 0);
		}
	}

	@OriginalMember(owner = "client!aln", name = "t", descriptor = "(II)Z", line = 818)
	@Override
	boolean method15275(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_47;
		synchronized (this.aClass478_47) {
			return this.aClass478_47.method29727(arg0, 0);
		}
	}

	@OriginalMember(owner = "client!aln", name = "e", descriptor = "(I)Z", line = 818)
	@Override
	boolean method15278(@OriginalArg(0) int arg0) {
		@Pc(3) Class478 local3 = this.aClass478_47;
		synchronized (this.aClass478_47) {
			return this.aClass478_47.method29727(arg0, 0);
		}
	}
}
