package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yv")
public class Class609 {

	@OriginalMember(owner = "client!yv", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_113;

	@OriginalMember(owner = "client!yv", name = "a", descriptor = "I")
	int anInt5535;

	@OriginalMember(owner = "client!yv", name = "g", descriptor = "[Lclient!ami;")
	Class3_Sub1_Sub5[] aClass3_Sub1_Sub5Array1;

	@OriginalMember(owner = "client!yv", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Z)V", line = 14)
	public Class609(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) boolean arg3) {
		this.aClass359_113 = arg2;
		@Pc(11) int local11 = this.aClass359_113.method26683() - 1;
		this.anInt5535 = (local11 * Class185.aClass185_29.method23905() + this.aClass359_113.method26682(local11)) * -1625010329;
		if (arg3) {
			this.aClass3_Sub1_Sub5Array1 = new Class3_Sub1_Sub5[this.anInt5535 * -52405161];
			for (@Pc(37) int local37 = 0; local37 < this.anInt5535 * -52405161; local37++) {
				@Pc(47) Class359 local47 = this.aClass359_113;
				@Pc(61) byte[] local61;
				synchronized (this.aClass359_113) {
					local61 = this.aClass359_113.method26713(Class185.aClass185_29.method23906(local37), Class185.aClass185_29.method23908(local37));
				}
				@Pc(73) Class3_Sub1_Sub5 local73 = new Class3_Sub1_Sub5();
				if (local61 != null) {
					local73.method18927(new Class3_Sub41(local61));
				}
				this.aClass3_Sub1_Sub5Array1[local37] = local73;
			}
		}
	}

	@OriginalMember(owner = "client!yv", name = "a", descriptor = "(I)Lclient!ami;", line = 33)
	public Class3_Sub1_Sub5 method33570(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? new Class3_Sub1_Sub5() : this.aClass3_Sub1_Sub5Array1[arg0];
	}

	@OriginalMember(owner = "client!yv", name = "p", descriptor = "(IB)Lclient!ami;", line = 33)
	public Class3_Sub1_Sub5 method33571(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? new Class3_Sub1_Sub5() : this.aClass3_Sub1_Sub5Array1[arg0];
	}
}
