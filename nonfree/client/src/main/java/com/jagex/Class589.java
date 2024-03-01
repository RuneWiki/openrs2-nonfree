package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xw")
public class Class589 {

	@OriginalMember(owner = "client!xw", name = "hu", descriptor = "Lclient!tr;")
	public static Class489 aClass489_2;

	@OriginalMember(owner = "client!xw", name = "a", descriptor = "Lclient!ew;")
	final Class161 aClass161_67 = new Class161(128);

	@OriginalMember(owner = "client!xw", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_107;

	@OriginalMember(owner = "client!xw", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;)V", line = 14)
	public Class589(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_107 = arg2;
		if (this.aClass359_107 != null) {
			@Pc(21) int local21 = this.aClass359_107.method26683() - 1;
			Class185.aClass185_49.method23905();
			this.aClass359_107.method26682(local21);
		}
	}

	@OriginalMember(owner = "client!xw", name = "p", descriptor = "(II)Lclient!xf;", line = 26)
	public Class574 method33297(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_67;
		@Pc(11) Class574 local11;
		synchronized (this.aClass161_67) {
			local11 = (Class574) this.aClass161_67.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(37) byte[] local37 = this.aClass359_107.method26713(Class185.aClass185_49.method23906(arg0), Class185.aClass185_49.method23908(arg0));
		local11 = new Class574();
		if (local37 != null) {
			local11.method33082(new Class3_Sub41(local37));
		}
		@Pc(55) Class161 local55 = this.aClass161_67;
		synchronized (this.aClass161_67) {
			this.aClass161_67.method23222(local11, (long) arg0);
			return local11;
		}
	}
}
