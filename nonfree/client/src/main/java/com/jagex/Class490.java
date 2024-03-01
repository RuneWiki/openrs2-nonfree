package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public class Class490 {

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "Lclient!zb;")
	static Class700 aClass700_1;

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "Ljava/lang/String;")
	static String aString217;

	// $FF: synthetic field
	@OriginalMember(owner = "client!pr", name = "this$0", descriptor = "Lclient!pu;")
	final Class493 this$0;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "[B")
	byte[] aByteArray94;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "(Z[BI)V", line = 76)
	public static void method29976(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Class607.aClass93_Sub41_17 == null) {
			Class607.aClass93_Sub41_17 = new Class93_Sub41(20000);
		}
		Class607.aClass93_Sub41_17.method22405(arg1, 0, arg1.length);
		if (!arg0) {
			return;
		}
		Class653.method32713(Class607.aClass93_Sub41_17.aByteArray58);
		Class50.aClass154_Sub1Array1 = new Class154_Sub1[Class606.anInt5557 * 2035023117];
		@Pc(28) int local28 = 0;
		for (@Pc(32) int local32 = Class607.anInt5560 * 1855382415; local32 <= Class361.anInt4571 * 977343673; local32++) {
			@Pc(41) Class154_Sub1 local41 = Class367.method27961(local32);
			if (local41 != null) {
				Class50.aClass154_Sub1Array1[local28++] = local41;
			}
		}
		Class50.aBoolean26 = false;
		Class333.aLong260 = Class305.method26796() * 7977095113539552245L;
		Class607.aClass93_Sub41_17 = null;
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!pu;Ljava/io/InputStream;Lclient!atb;Ljava/net/URL;)V", line = 106)
	Class490(@OriginalArg(0) Class493 arg0, @OriginalArg(1) InputStream arg1, @OriginalArg(2) Class93_Sub1_Sub16_Sub1 arg2, @OriginalArg(3) URL arg3) {
		this.this$0 = arg0;
		this.aByteArray94 = null;
		if (arg1 != null) {
			@Pc(11) short local11 = 10240;
			@Pc(17) Class93_Sub41 local17 = new Class93_Sub41(local11, true);
			@Pc(19) int local19 = 0;
			@Pc(23) byte[] local23 = Class723.method36934(1024);
			@Pc(53) int local53;
			while (local19 >= 0) {
				try {
					local19 = arg1.read(local23);
				} catch (@Pc(31) IOException local31) {
					local31.printStackTrace();
					local19 = -1;
				}
				if (local19 > 0) {
					if (local19 + local17.anInt3070 * 212851357 >= local17.aByteArray58.length) {
						local53 = local17.aByteArray58.length + 10240;
						@Pc(58) byte[] local58 = Class723.method36935(local53, true);
						System.arraycopy(local17.aByteArray58, 0, local58, 0, local17.anInt3070 * 212851357);
						Class723.method36938(local17.aByteArray58);
						local17.aByteArray58 = local58;
					}
					local17.method22405(local23, 0, local19);
				}
			}
			for (local53 = 0; local53 < arg2.anInt3187 * 493721639; local53++) {
				local17.method22510(0);
			}
			@Pc(102) byte[] local102 = new byte[local17.anInt3070 * 212851357];
			System.arraycopy(local17.aByteArray58, 0, local102, 0, local17.anInt3070 * 212851357);
			local17.method22651();
			Class723.method36938(local23);
			this.aByteArray94 = local102;
			try {
				arg1.close();
			} catch (@Pc(129) IOException local129) {
				local129.printStackTrace();
			}
		}
		arg2.aBoolean546 = false;
		arg0.method29988();
	}

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "()[B", line = 153)
	byte[] method29971() {
		return this.aByteArray94;
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)[B", line = 153)
	byte[] method29972() {
		return this.aByteArray94;
	}

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "()[B", line = 153)
	byte[] method29973() {
		return this.aByteArray94;
	}

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "()[B", line = 153)
	byte[] method29974() {
		return this.aByteArray94;
	}

	@OriginalMember(owner = "client!pr", name = "al", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z", line = 415)
	static boolean method29978(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!Class625.aBoolean846) {
			switch(arg0.eventType) {
				case 7:
				case 8:
				case 9:
					return false;
			}
		}
		@Pc(18) int local18;
		if (arg0.eventType != 33) {
			if (arg0.eventType == 30) {
				local18 = ((TwitchEventResult) arg0).result;
				if (local18 == 0 || local18 == 1) {
					Class387.method28242();
				} else if (local18 == 2) {
					Class625.aLong291 = arg1 * 273097735325007225L;
				}
			}
			if (arg0.eventType == 34) {
				Class522.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class670.method32959(34, 0);
			}
			return true;
		} else if (Class625.aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local18 = ((TwitchEventResult) arg0).result;
			@Pc(23) int local23 = Class166_Sub13.aTwitchTV1.GetWebcamFrameData(local18, Class625.aTwitchWebcamFrameData1);
			if (local23 == 0) {
				if (Class625.aBoolean845) {
					Class625.aTwitchWebcamFrameData1.e();
				}
				if (Class625.aBoolean847) {
					Class625.aTwitchWebcamFrameData1.n();
				}
				Class491.method29979();
				Class625.aLong291 = arg1 * 273097735325007225L;
				Class670.method32959(33, 0);
			} else {
				Class625.aClass100_51 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!pr", name = "ac", descriptor = "(B)V", line = 1123)
	static void method29977() {
		Class411.aClass175_3.method24369();
		Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
		Class411.aClass175_3.aClass453_2 = null;
		Class411.aClass175_3.aClass453_1 = null;
		Class411.aClass175_3.aClass453_4 = null;
		Class411.aClass175_3.aClass453_3 = null;
		Class411.aClass175_3.anInt3301 = 0;
		Class411.aClass175_3.anInt3298 = 0;
		client.anInt3453 = 0;
		Class380.method28120();
		Class287.method26542();
		@Pc(32) int local32;
		for (local32 = 0; local32 < 2048; local32++) {
			client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local32] = null;
		}
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 = null;
		for (local32 = 0; local32 < client.anInt3488 * -1814159537; local32++) {
			@Pc(56) Class132_Sub1_Sub1_Sub1 local56 = (Class132_Sub1_Sub1_Sub1) client.aClass93_Sub15Array1[local32].anObject5;
			if (local56 != null) {
				local56.anInt2772 = 1158576417;
			}
		}
		Class245.method25900();
		Class322.method27274(Class20.method376());
		Class481.method29756(18);
		for (local32 = 0; local32 < 114; local32++) {
			client.aBooleanArray22[local32] = true;
		}
		Class339.method27487(Class411.aClass175_3);
		Class653.aClass678_2 = null;
		Class442.aLong276 = 0L;
		Class285.method26517();
		Class596.aClass113_Sub1_1.method7420();
	}

	@OriginalMember(owner = "client!pr", name = "ho", descriptor = "(Lclient!yf;I)V", line = 6427)
	static final void method29975(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class453.method28965(local16, local22, arg0, Class310.aClass310_6);
	}
}
