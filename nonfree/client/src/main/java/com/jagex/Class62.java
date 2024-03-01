package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public abstract class Class62 {

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 7)
	Class62() {
	}

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "(Ljava/net/Socket;I)Lclient!qg;", line = 10)
	public static Class62 method12845(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		return new Class62_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "(B)V", line = 57)
	static void method12865() {
		@Pc(4) Class30_Sub1 local4 = (Class30_Sub1) Class402.aClass23_Sub1_2.method5827();
		@Pc(9) Class69_Sub2 local9 = (Class69_Sub2) Class402.aClass23_Sub1_2.method5799();
		@Pc(13) Class320 local13 = local4.method16426();
		@Pc(17) Class335 local17 = local9.method14572();
		if (client.aClass178_12 != null) {
			@Pc(25) int local25 = client.aClass178_12.anInt3498 * -1494060731;
			@Pc(30) int local30 = client.aClass178_12.anInt3499 * -751005789;
			@Pc(32) float local32 = 1000.0F;
			@Pc(44) float local44 = (float) (Math.atan((double) ((float) local25 / 2.0F / local32)) * 2.0D);
			@Pc(56) float local56 = (float) (Math.atan((double) ((float) local30 / 2.0F / local32)) * 2.0D);
			try {
				Class402.aClass23_Sub1_2.method5818(local44, local56);
			} catch (@Pc(63) Exception_Sub4 local63) {
			}
		}
		if (Class3_Sub10.aClass61_1.method12737()) {
			@Pc(69) Class335 local69 = Class335.method26300();
			local69.method26365(1.0F, 0.0F, 0.0F, (float) (Class3_Sub10.aClass61_1.method12741() - Class402.anInt4805 * -202243067) / 200.0F);
			local17.method26312(local69);
			@Pc(92) Class320 local92 = Class320.method25891(0.0F, 1.0F, 0.0F);
			local92.method25889(local17);
			@Pc(97) Class335 local97 = Class335.method26300();
			local97.method26301(local92, (float) (Class402.anInt4804 * 1475929817 - Class3_Sub10.aClass61_1.method12740()) / 200.0F);
			local17.method26312(local97);
			local9.method14570(local17);
		}
		Class402.anInt4804 = Class3_Sub10.aClass61_1.method12740() * 2008758633;
		Class402.anInt4805 = Class3_Sub10.aClass61_1.method12741() * -1561712435;
		local17.method26351();
		@Pc(141) Class320 local141;
		if (Class217.aClass65_1.method13145(98)) {
			local141 = Class320.method25891(0.0F, 0.0F, 25.0F);
			local141.method25889(local17);
			local141.aFloat260 *= -1.0F;
			local13.method25872(local141);
		}
		if (Class217.aClass65_1.method13145(99)) {
			local141 = Class320.method25891(0.0F, 0.0F, -25.0F);
			local141.method25889(local17);
			local141.aFloat260 *= -1.0F;
			local13.method25872(local141);
		}
		if (Class217.aClass65_1.method13145(96)) {
			local141 = Class320.method25891(-25.0F, 0.0F, 0.0F);
			local141.method25889(local17);
			local141.aFloat260 *= -1.0F;
			local13.method25872(local141);
		}
		if (Class217.aClass65_1.method13145(97)) {
			local141 = Class320.method25891(25.0F, 0.0F, 0.0F);
			local141.method25889(local17);
			local141.aFloat260 *= -1.0F;
			local13.method25872(local141);
		}
		@Pc(233) Class3_Sub32 local233 = new Class3_Sub32(0, (int) local13.aFloat259, (int) local13.aFloat260, (int) local13.aFloat261);
		local4.method7446(local233);
		@Pc(241) Class464 local241 = client.aClass370_1.method26942();
		@Pc(248) int local248 = local241.anInt5071 * -1567811631 << 9;
		@Pc(255) int local255 = local241.anInt5073 * 1360175441 << 9;
		Class402.aClass23_Sub1_2.method5896(0.02F, client.aClass370_1.method26959().anIntArrayArrayArray14, client.aClass370_1.method27075(), local248, local255);
	}

	@OriginalMember(owner = "client!qg", name = "ej", descriptor = "(Lclient!vs;I)V", line = 4820)
	static final void method12868(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class221.method24419(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "anl", descriptor = "(Lclient!vs;B)V", line = 11427)
	static final void method12866(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 < 0 || local12 > 5 || local12 == 2) {
			local12 = 3;
		}
		Class546.method32647(local12, false);
	}

	@OriginalMember(owner = "client!qg", name = "api", descriptor = "(Lclient!vs;I)V", line = 11777)
	static final void method12867(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) (Class431.method27960(local12) / 60000L);
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "([BIIB)V")
	public abstract void method12846(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)I")
	public abstract int method12847() throws IOException;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "([BIII)I")
	public abstract int method12848(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "([BII)V")
	public abstract void method12849(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "(I)V")
	public abstract void method12850();

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "()I")
	public abstract int method12851() throws IOException;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "(I)Z")
	public abstract boolean method12852(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "([BII)I")
	public abstract int method12853(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "()I")
	public abstract int method12854() throws IOException;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "()I")
	public abstract int method12855() throws IOException;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
	public abstract boolean method12856(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "(I)V")
	public abstract void method12857();

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "()I")
	public abstract int method12858() throws IOException;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "([BII)V")
	public abstract void method12859(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "([BII)V")
	public abstract void method12860(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "()V")
	public abstract void method12861();

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "()V")
	public abstract void method12862();

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "()V")
	public abstract void method12863();

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "()V")
	public abstract void method12864();
}
