package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!py")
public class Class480 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!py", name = "this$0", descriptor = "Lclient!po;")
	final Class470 this$0;

	@OriginalMember(owner = "client!py", name = "p", descriptor = "[B")
	byte[] aByteArray87;

	@OriginalMember(owner = "client!py", name = "p", descriptor = "(II)I", line = 12)
	public static int method29812(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!py", name = "<init>", descriptor = "(Lclient!po;Ljava/io/InputStream;Lclient!ata;Ljava/net/URL;)V", line = 106)
	Class480(@OriginalArg(0) Class470 arg0, @OriginalArg(1) InputStream arg1, @OriginalArg(2) Class77_Sub1_Sub18_Sub1 arg2, @OriginalArg(3) URL arg3) {
		this.this$0 = arg0;
		this.aByteArray87 = null;
		if (arg1 != null) {
			@Pc(11) short local11 = 10240;
			@Pc(17) Class77_Sub39 local17 = new Class77_Sub39(local11, true);
			@Pc(19) int local19 = 0;
			@Pc(23) byte[] local23 = Class686.method36282(1024);
			@Pc(53) int local53;
			while (local19 >= 0) {
				try {
					local19 = arg1.read(local23);
				} catch (@Pc(31) IOException local31) {
					local31.printStackTrace();
					local19 = -1;
				}
				if (local19 > 0) {
					if (local17.anInt3089 * 31645619 + local19 >= local17.aByteArray53.length) {
						local53 = local17.aByteArray53.length + 10240;
						@Pc(58) byte[] local58 = Class686.method36278(local53, true);
						System.arraycopy(local17.aByteArray53, 0, local58, 0, local17.anInt3089 * 31645619);
						Class686.method36283(local17.aByteArray53);
						local17.aByteArray53 = local58;
					}
					local17.method22452(local23, 0, local19);
				}
			}
			for (local53 = 0; local53 < arg2.anInt3190 * 644217069; local53++) {
				local17.method22403(0);
			}
			@Pc(102) byte[] local102 = new byte[local17.anInt3089 * 31645619];
			System.arraycopy(local17.aByteArray53, 0, local102, 0, local17.anInt3089 * 31645619);
			local17.method22401();
			local17 = null;
			Class686.method36283(local23);
			@Pc(122) Object local122 = null;
			this.aByteArray87 = local102;
			try {
				arg1.close();
			} catch (@Pc(129) IOException local129) {
				local129.printStackTrace();
			}
		}
		arg2.aBoolean540 = false;
		arg0.method29605();
	}

	@OriginalMember(owner = "client!py", name = "c", descriptor = "()[B", line = 153)
	byte[] method29813() {
		return this.aByteArray87;
	}

	@OriginalMember(owner = "client!py", name = "p", descriptor = "(I)[B", line = 153)
	byte[] method29814() {
		return this.aByteArray87;
	}

	@OriginalMember(owner = "client!py", name = "v", descriptor = "()[B", line = 153)
	byte[] method29815() {
		return this.aByteArray87;
	}

	@OriginalMember(owner = "client!py", name = "rt", descriptor = "(Lclient!gm;Lclient!yf;I)V", line = 7708)
	static final void method29816(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(12) int local12 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
		@Pc(27) int local27 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307] - 1;
		if (arg0.anInt3888 * -1866862435 != 2) {
			throw new RuntimeException("");
		}
		@Pc(47) Class333 local47 = (Class333) Class578.aClass35_Sub3_1.method18319(arg0.anInt3889 * 939166901);
		if (arg0.aClass328_2 == null) {
			arg0.aClass328_2 = new Class328(local47, false);
		}
		arg0.aClass328_2.aLong257 = Class244.method26114() * 8855449811293583851L;
		if (local27 < 0 || local27 >= local47.anIntArray436.length) {
			throw new RuntimeException("");
		}
		arg0.aClass328_2.anIntArray434[local27] = local12;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!py", name = "ark", descriptor = "(Lclient!yf;B)V", line = 12487)
	static final void method29817(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aBoolean590 ? 1 : 0;
	}

	@OriginalMember(owner = "client!py", name = "ate", descriptor = "(Lclient!yf;I)V", line = 12920)
	static final void method29818(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(28) Class277 local28 = Class60.method884(local13, local23);
		Exception_Sub4.method17924();
		@Pc(33) Class77_Sub26 local33 = client.method25376(local28);
		Class236.method25912(local28, local33.method13649(), local33.anInt1559 * -1799641075);
	}
}
