package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aet")
public class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!aet", name = "j", descriptor = "Lclient!aeh;")
	Class86_Sub2 aClass86_Sub2_4;

	@OriginalMember(owner = "client!aet", name = "u", descriptor = "[I")
	int[] anIntArray64;

	@OriginalMember(owner = "client!aet", name = "e", descriptor = "[I")
	int[] anIntArray65;

	@OriginalMember(owner = "client!aet", name = "i", descriptor = "[Lclient!cy;")
	Class83[] aClass83Array4;

	@OriginalMember(owner = "client!aet", name = "k", descriptor = "[Lclient!cy;")
	Class83[] aClass83Array3;

	@OriginalMember(owner = "client!aet", name = "f", descriptor = "[I")
	int[] anIntArray63;

	@OriginalMember(owner = "client!aet", name = "o", descriptor = "[I")
	int[] anIntArray66;

	@OriginalMember(owner = "client!aet", name = "<init>", descriptor = "(Lclient!aeh;Lclient!aar;[Lclient!aej;[I[I)V", line = 20)
	Class94_Sub1(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class89_Sub1[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass86_Sub2_4 = arg0;
		this.aClass86_Sub2_4 = arg0;
		this.anIntArray64 = arg3;
		this.anIntArray65 = arg4;
		this.aClass83Array4 = new Class83[arg2.length];
		this.aClass83Array3 = new Class83[arg2.length];
		this.anIntArray63 = new int[arg2.length];
		this.anIntArray66 = new int[arg2.length];
		for (@Pc(37) int local37 = 0; local37 < arg2.length; local37++) {
			this.aClass83Array4[local37] = this.aClass86_Sub2_4.method20076(arg2[local37], false);
			@Pc(61) int[] local61 = (int[]) arg2[local37].method6686(false).clone();
			for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
				@Pc(71) int local71 = local61[local63];
				@Pc(94) byte local94 = (byte) ((local71 & 0xFF) + (local71 >> 8 & 0xFF) * 4 + (local71 >> 16 & 0xFF) * 3 >> 3);
				local61[local63] = local61[local63] & 0xFF000000 | local94 << 16 | local94 << 8 | local94;
			}
			this.aClass83Array3[local37] = this.aClass86_Sub2_4.method20103(local61, 0, this.anIntArray64[local37], this.anIntArray64[local37], this.anIntArray65[local37], false);
			this.anIntArray63[local37] = arg2[local37].method6701();
			this.anIntArray66[local37] = arg2[local37].method6684();
		}
	}

	@OriginalMember(owner = "client!aet", name = "i", descriptor = "(CIIIZ)V", line = 44)
	@Override
	void method7660(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_4.anIntArray39 == null) {
			return;
		}
		@Pc(11) int local11 = arg1 + this.anIntArray66[arg0];
		@Pc(18) int local18 = arg2 + this.anIntArray63[arg0];
		if (arg4) {
			this.aClass83Array3[arg0].method18177(local11, local18, 1, arg3, 1);
		} else {
			this.aClass83Array4[arg0].method18177(local11, local18, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!aet", name = "u", descriptor = "(CIIIZ)V", line = 44)
	@Override
	void method7656(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_4.anIntArray39 == null) {
			return;
		}
		@Pc(11) int local11 = arg1 + this.anIntArray66[arg0];
		@Pc(18) int local18 = arg2 + this.anIntArray63[arg0];
		if (arg4) {
			this.aClass83Array3[arg0].method18177(local11, local18, 1, arg3, 1);
		} else {
			this.aClass83Array4[arg0].method18177(local11, local18, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!aet", name = "e", descriptor = "(CIIIZ)V", line = 44)
	@Override
	void method7657(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_4.anIntArray39 == null) {
			return;
		}
		@Pc(11) int local11 = arg1 + this.anIntArray66[arg0];
		@Pc(18) int local18 = arg2 + this.anIntArray63[arg0];
		if (arg4) {
			this.aClass83Array3[arg0].method18177(local11, local18, 1, arg3, 1);
		} else {
			this.aClass83Array4[arg0].method18177(local11, local18, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!aet", name = "k", descriptor = "(CIIIZLclient!cd;II)V", line = 51)
	@Override
	void method7661(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!aet", name = "f", descriptor = "(CIIIZLclient!cd;II)V", line = 51)
	@Override
	void method7658(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!aet", name = "o", descriptor = "(CIIIZLclient!cd;II)V", line = 51)
	@Override
	void method7659(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!aet", name = "t", descriptor = "(I)I", line = 102)
	public static int method6563() {
		return Class622.anInt5637 * -1429983313;
	}
}
