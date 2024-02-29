package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afd")
public class Class96_Sub4 extends Class96 {

	@OriginalMember(owner = "client!afd", name = "c", descriptor = "I")
	final int anInt815;

	@OriginalMember(owner = "client!afd", name = "v", descriptor = "I")
	final int anInt813;

	@OriginalMember(owner = "client!afd", name = "l", descriptor = "I")
	final int anInt812;

	@OriginalMember(owner = "client!afd", name = "y", descriptor = "I")
	final int anInt814;

	@OriginalMember(owner = "client!afd", name = "w", descriptor = "I")
	final int anInt816;

	@OriginalMember(owner = "client!afd", name = "t", descriptor = "I")
	final int anInt817;

	@OriginalMember(owner = "client!afd", name = "<init>", descriptor = "(Lclient!akv;)V", line = 16)
	Class96_Sub4(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt815 = arg0.method22483() * -1744881341;
		this.anInt813 = arg0.method22483() * 1991391999;
		this.anInt812 = arg0.method22483() * 1898993095;
		this.anInt814 = arg0.method22483() * 2070961019;
		this.anInt816 = arg0.method22483() * 295898495;
		this.anInt817 = arg0.method22483() * -1925109261;
	}

	@OriginalMember(owner = "client!afd", name = "p", descriptor = "(Lclient!dx;IIIIILclient!dv;IIIILclient!zx;I)Lclient!dv;", line = 20)
	public static Class84 method7126(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class84 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class151 arg11) {
		if (arg6 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg11 != null) {
			local5 |= arg11.method23432();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(39) long local39 = ((long) arg8 << 48) + ((long) arg7 << 32) + (long) ((arg10 << 24) + (arg9 << 16) + arg5);
		@Pc(42) Class232 local42 = Class412.aClass232_81;
		@Pc(48) Class84 local48;
		synchronized (Class412.aClass232_81) {
			local48 = (Class84) Class412.aClass232_81.method25835(local39);
		}
		@Pc(80) int local80;
		if (local48 == null || arg0.method20116(local48.method6875(), local5) != 0) {
			if (local48 != null) {
				local5 = arg0.method20117(local5, local48.method6875());
			}
			local80 = arg5 * 3 + 6;
			@Pc(82) byte local82 = 3;
			@Pc(97) int[] local97 = new int[] { 64, 96, 128 };
			@Pc(114) Class216 local114 = new Class216(local82 * local80 + 1, local80 * local82 * 2 - local80, 0);
			@Pc(120) int local120 = local114.method25665(0, 0, 0);
			@Pc(124) int[][] local124 = new int[local82][local80];
			@Pc(126) int local126;
			@Pc(133) int local133;
			@Pc(137) int local137;
			@Pc(156) int local156;
			for (local126 = 0; local126 < local82; local126++) {
				local133 = local97[local126];
				local137 = local97[local126];
				for (@Pc(139) int local139 = 0; local139 < local80; local139++) {
					@Pc(148) int local148 = (local139 << 14) / local80;
					local156 = local133 * Class436.anIntArray464[local148] >> 14;
					@Pc(164) int local164 = Class436.anIntArray463[local148] * local137 >> 14;
					local124[local126][local139] = local114.method25665(local156, 0, local164);
				}
			}
			for (local126 = 0; local126 < local82; local126++) {
				local133 = (local126 * 256 + 128) / local82;
				local137 = 256 - local133;
				@Pc(206) byte local206 = (byte) (arg10 * local133 + local137 * arg9 >> 8);
				@Pc(251) short local251 = (short) (((arg7 & 0xFC00) * local137 + (arg8 & 0xFC00) * local133 & 0xFC0000) + (local133 * (arg8 & 0x380) + local137 * (arg7 & 0x380) & 0x38000) + (local137 * (arg7 & 0x7F) + (arg8 & 0x7F) * local133 & 0x7F00) >> 8);
				for (local156 = 0; local156 < local80; local156++) {
					if (local126 == 0) {
						local114.method25667(local120, local124[0][(local156 + 1) % local80], local124[0][local156], (byte) 1, (byte) -1, local251, local206, (short) -1);
					} else {
						local114.method25667(local124[local126 - 1][local156], local124[local126 - 1][(local156 + 1) % local80], local124[local126][(local156 + 1) % local80], (byte) 1, (byte) -1, local251, local206, (short) -1);
						local114.method25667(local124[local126 - 1][local156], local124[local126][(local156 + 1) % local80], local124[local126][local156], (byte) 1, (byte) -1, local251, local206, (short) -1);
					}
				}
			}
			local48 = arg0.method20115(local114, local5, Class412.anInt4715 * -1789606037, 64, 768);
			@Pc(364) Class232 local364 = Class412.aClass232_81;
			synchronized (Class412.aClass232_81) {
				Class412.aClass232_81.method25844(local48, local39);
			}
		}
		local80 = arg6.method6906();
		@Pc(383) int local383 = arg6.method6822();
		@Pc(386) int local386 = arg6.method6826();
		@Pc(389) int local389 = arg6.method6817();
		if (arg11 == null) {
			local48 = local48.method6794((byte) 3, local5, true);
			local48.method6803(local383 - local80 >> 1, 128, local389 - local386 >> 1);
			local48.method6872(local383 + local80 >> 1, 0, local386 + local389 >> 1);
		} else {
			local48 = local48.method6794((byte) 3, local5, true);
			local48.method6803(local383 - local80 >> 1, 128, local389 - local386 >> 1);
			local48.method6872(local383 + local80 >> 1, 0, local386 + local389 >> 1);
			arg11.method23440(local48);
		}
		if (arg2 != 0) {
			local48.method6799(arg2);
		}
		if (arg3 != 0) {
			local48.method6800(arg3);
		}
		if (arg4 != 0) {
			local48.method6872(0, arg4, 0);
		}
		return local48;
	}

	@OriginalMember(owner = "client!afd", name = "y", descriptor = "()V", line = 26)
	@Override
	public void method19912() {
		Class230.aClass233Array1[this.anInt815 * -1065149589].method25869(0);
		Class230.aClass233Array1[this.anInt813 * 750044415].method25869(1);
		client.anInt3441 = 0;
		client.anInt3395 = this.anInt812 * -211353161;
		client.anInt3444 = 0;
		client.anInt3386 = this.anInt816 * -510081599;
		client.anInt3501 = this.anInt817 * 1249772227;
		client.anInt3442 = 378787251;
		client.anInt3407 = this.anInt814 * -1838245657;
		Class11.anInt36 = -1822037319;
		Class61.method902();
		client.aBoolean607 = true;
	}

	@OriginalMember(owner = "client!afd", name = "c", descriptor = "(I)V", line = 26)
	@Override
	public void method19911() {
		Class230.aClass233Array1[this.anInt815 * -1065149589].method25869(0);
		Class230.aClass233Array1[this.anInt813 * 750044415].method25869(1);
		client.anInt3441 = 0;
		client.anInt3395 = this.anInt812 * -211353161;
		client.anInt3444 = 0;
		client.anInt3386 = this.anInt816 * -510081599;
		client.anInt3501 = this.anInt817 * 1249772227;
		client.anInt3442 = 378787251;
		client.anInt3407 = this.anInt814 * -1838245657;
		Class11.anInt36 = -1822037319;
		Class61.method902();
		client.aBoolean607 = true;
	}

	@OriginalMember(owner = "client!afd", name = "w", descriptor = "()V", line = 26)
	@Override
	public void method19913() {
		Class230.aClass233Array1[this.anInt815 * -1065149589].method25869(0);
		Class230.aClass233Array1[this.anInt813 * 750044415].method25869(1);
		client.anInt3441 = 0;
		client.anInt3395 = this.anInt812 * -211353161;
		client.anInt3444 = 0;
		client.anInt3386 = this.anInt816 * -510081599;
		client.anInt3501 = this.anInt817 * 1249772227;
		client.anInt3442 = 378787251;
		client.anInt3407 = this.anInt814 * -1838245657;
		Class11.anInt36 = -1822037319;
		Class61.method902();
		client.aBoolean607 = true;
	}
}
