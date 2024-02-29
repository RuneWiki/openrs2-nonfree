package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afc")
public class Class96_Sub3 extends Class96 {

	@OriginalMember(owner = "client!afc", name = "nz", descriptor = "I")
	public static int anInt810;

	@OriginalMember(owner = "client!afc", name = "c", descriptor = "I")
	final int anInt807;

	@OriginalMember(owner = "client!afc", name = "v", descriptor = "I")
	final int anInt806;

	@OriginalMember(owner = "client!afc", name = "l", descriptor = "Ljava/lang/String;")
	final String aString26;

	@OriginalMember(owner = "client!afc", name = "y", descriptor = "I")
	final int anInt808;

	@OriginalMember(owner = "client!afc", name = "w", descriptor = "I")
	final int anInt809;

	@OriginalMember(owner = "client!afc", name = "<init>", descriptor = "(Lclient!akv;)V", line = 14)
	Class96_Sub3(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt807 = arg0.method22483() * 470674471;
		this.anInt806 = arg0.method22483() * -231235529;
		this.aString26 = arg0.method22523();
		this.anInt808 = arg0.method22500() * -1357489939;
		this.anInt809 = arg0.method22483() * -2104902239;
	}

	@OriginalMember(owner = "client!afc", name = "y", descriptor = "()V", line = 23)
	@Override
	public void method19912() {
		Class397.method28440(Class669.anInt5790 * -878424575, this.anInt807 * -1462189161, this.anInt806 * 816452999, Class277.method26658(this.anInt807 * -1462189161, this.anInt806 * 816452999, Class669.anInt5790 * -878424575), this.anInt809 * -1499371935, this.anInt808 * 469877989, this.aString26);
	}

	@OriginalMember(owner = "client!afc", name = "c", descriptor = "(I)V", line = 23)
	@Override
	public void method19911() {
		Class397.method28440(Class669.anInt5790 * -878424575, this.anInt807 * -1462189161, this.anInt806 * 816452999, Class277.method26658(this.anInt807 * -1462189161, this.anInt806 * 816452999, Class669.anInt5790 * -878424575), this.anInt809 * -1499371935, this.anInt808 * 469877989, this.aString26);
	}

	@OriginalMember(owner = "client!afc", name = "w", descriptor = "()V", line = 23)
	@Override
	public void method19913() {
		Class397.method28440(Class669.anInt5790 * -878424575, this.anInt807 * -1462189161, this.anInt806 * 816452999, Class277.method26658(this.anInt807 * -1462189161, this.anInt806 * 816452999, Class669.anInt5790 * -878424575), this.anInt809 * -1499371935, this.anInt808 * 469877989, this.aString26);
	}

	@OriginalMember(owner = "client!afc", name = "i", descriptor = "(Lclient!gh;IIIZLclient!yf;I)V", line = 402)
	static void method7108(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class665 arg5) {
		if (arg2 == 0) {
			throw new RuntimeException();
		}
		@Pc(10) Class277 local10 = arg0.aClass277Array2[arg1];
		if (local10.aClass277Array3 == null) {
			local10.aClass277Array3 = new Class277[arg3 + 1];
			local10.aClass277Array4 = local10.aClass277Array3;
		}
		if (local10.aClass277Array3.length <= arg3) {
			@Pc(38) Class277[] local38;
			if (local10.aClass277Array3 == local10.aClass277Array4) {
				local38 = new Class277[arg3 + 1];
				for (@Pc(40) int local40 = 0; local40 < local10.aClass277Array3.length; local40++) {
					local38[local40] = local10.aClass277Array3[local40];
				}
				local10.aClass277Array3 = local10.aClass277Array4 = local38;
			} else {
				local38 = new Class277[arg3 + 1];
				@Pc(71) Class277[] local71 = new Class277[arg3 + 1];
				for (@Pc(73) int local73 = 0; local73 < local10.aClass277Array3.length; local73++) {
					local38[local73] = local10.aClass277Array3[local73];
					local71[local73] = local10.aClass277Array4[local73];
				}
				local10.aClass277Array3 = local38;
				local10.aClass277Array4 = local71;
			}
		}
		if (arg3 > 0 && local10.aClass277Array3[arg3 - 1] == null) {
			throw new RuntimeException("" + (arg3 - 1));
		}
		@Pc(127) Class277 local127 = new Class277();
		local127.anInt3857 = arg2 * 1389544413;
		local127.anInt3876 = (local127.anInt3863 = local10.anInt3863) * 584462367;
		local127.anInt3927 = arg3 * -2112138631;
		local10.aClass277Array3[arg3] = local127;
		if (local10.aClass277Array3 != local10.aClass277Array4) {
			local10.aClass277Array4[arg3] = local127;
		}
		@Pc(168) Class662 local168;
		if (arg4) {
			local168 = arg5.aClass662_1;
		} else {
			local168 = arg5.aClass662_2;
		}
		local168.aClass273_4 = arg0;
		local168.aClass277_12 = local127;
		Class461.method29531(local10);
	}

	@OriginalMember(owner = "client!afc", name = "of", descriptor = "(Lclient!yf;S)V", line = 7198)
	static final void method7109(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class80_Sub1_Sub1.method1663(local11, local14, arg0);
	}
}
