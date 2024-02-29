package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acs")
public class Class66 {

	@OriginalMember(owner = "client!acs", name = "p", descriptor = "I")
	static final int anInt196 = 0;

	@OriginalMember(owner = "client!acs", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_11;

	@OriginalMember(owner = "client!acs", name = "v", descriptor = "[Lclient!acu;")
	final Class68[] aClass68Array1;

	@OriginalMember(owner = "client!acs", name = "l", descriptor = "I")
	final int anInt197;

	@OriginalMember(owner = "client!acs", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;)V", line = 17)
	public Class66(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2) {
		this.aClass478_11 = arg2;
		@Pc(14) Class77_Sub39 local14 = new Class77_Sub39(this.aClass478_11.method29725(0, 0));
		@Pc(28) int local28 = local14.aByteArray53 == null || local14.aByteArray53.length < 1 ? -1 : local14.method22478();
		if (local28 < 4) {
			this.aClass68Array1 = new Class68[0];
			this.anInt197 = -2051739341;
		} else {
			@Pc(43) int local43 = local14.method22478();
			@Pc(46) Class406[] local46 = Class670.method33192();
			@Pc(48) boolean local48 = true;
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (local46.length == local43) {
				for (local57 = 0; local57 < local46.length; local57++) {
					local65 = local14.method22478();
					if (local46[local57].anInt4705 * 2114643719 != local65) {
						local48 = false;
						break;
					}
				}
			} else {
				local48 = false;
			}
			if (local48) {
				local57 = local14.method22478();
				local65 = local14.method22478();
				@Pc(106) int local106;
				@Pc(102) int local102;
				if (local28 > 2) {
					this.anInt197 = local14.method22487() * 2051739341;
					local102 = local14.method22492();
					local106 = local14.method22483();
				} else {
					this.anInt197 = -2051739341;
					local102 = 0;
					local106 = 0;
				}
				this.aClass68Array1 = new Class68[local65 + 1];
				@Pc(122) int local122;
				for (local122 = 0; local122 < local57; local122++) {
					@Pc(129) int local129 = local14.method22478();
					@Pc(138) boolean local138 = local14.method22478() == 1;
					@Pc(142) int local142 = local14.method22483();
					@Pc(151) Class72[] local151;
					@Pc(153) int local153;
					@Pc(160) int local160;
					@Pc(164) int local164;
					@Pc(168) int local168;
					if (this.anInt197 * -308310523 == -1) {
						local151 = new Class72[local142];
						for (local153 = 0; local153 < local142; local153++) {
							local160 = local14.method22483();
							local164 = local14.method22492();
							local168 = local14.method22483();
							local151[local153] = new Class72(local160, local164, local168);
						}
						this.aClass68Array1[local129] = new Class68(local138, local151);
					} else {
						local151 = new Class72[local142 + 1];
						local151[0] = new Class72(this.anInt197 * -308310523, local102, local106);
						for (local153 = 0; local153 < local142; local153++) {
							local160 = local14.method22483();
							local164 = local14.method22492();
							local168 = local14.method22483();
							local151[local153 + 1] = new Class72(local160, local164, local168);
						}
					}
					this.aClass68Array1[local129] = new Class68(local138, local151);
				}
				for (local122 = 0; local122 < local65 + 1; local122++) {
					if (this.aClass68Array1[local122] == null) {
						this.aClass68Array1[local122] = this.method945(local102, local106);
					}
				}
			} else {
				this.aClass68Array1 = new Class68[0];
				this.anInt197 = -2051739341;
			}
		}
	}

	@OriginalMember(owner = "client!acs", name = "p", descriptor = "(III)Lclient!acu;", line = 98)
	Class68 method945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt197 * -308310523 == -1) {
			return new Class68(false, new Class72[0]);
		} else {
			@Pc(22) Class72 local22 = new Class72(this.anInt197 * -308310523, arg0, arg1);
			return new Class68(false, new Class72[] { local22 });
		}
	}

	@OriginalMember(owner = "client!acs", name = "c", descriptor = "(II)Lclient!acj;", line = 108)
	public Class59 method946(@OriginalArg(0) int arg0) {
		@Pc(6) byte[] local6 = this.aClass478_11.method29725(arg0, 0);
		@Pc(10) Class59 local10 = new Class59();
		local10.method866(new Class77_Sub39(local6));
		return local10;
	}

	@OriginalMember(owner = "client!acs", name = "y", descriptor = "(I)[Lclient!acz;", line = 115)
	public Class72[] method947(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass68Array1.length) {
			return this.method945(0, 0).aClass72Array1;
		}
		@Pc(18) Class68 local18 = this.aClass68Array1[arg0];
		if (!local18.aBoolean20 || local18.aClass72Array1.length <= 1) {
			return local18.aClass72Array1;
		}
		@Pc(39) int local39 = this.anInt197 * -308310523 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class72[] local48 = new Class72[local18.aClass72Array1.length];
		System.arraycopy(local18.aClass72Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class96_Sub20.method7745(local43, local48.length - local39) + local39;
			@Pc(77) Class72 local77 = local18.aClass72Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!acs", name = "v", descriptor = "(IB)[Lclient!acz;", line = 115)
	public Class72[] method948(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass68Array1.length) {
			return this.method945(0, 0).aClass72Array1;
		}
		@Pc(18) Class68 local18 = this.aClass68Array1[arg0];
		if (!local18.aBoolean20 || local18.aClass72Array1.length <= 1) {
			return local18.aClass72Array1;
		}
		@Pc(39) int local39 = this.anInt197 * -308310523 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class72[] local48 = new Class72[local18.aClass72Array1.length];
		System.arraycopy(local18.aClass72Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class96_Sub20.method7745(local43, local48.length - local39) + local39;
			@Pc(77) Class72 local77 = local18.aClass72Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!acs", name = "w", descriptor = "(I)[Lclient!acz;", line = 115)
	public Class72[] method949(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass68Array1.length) {
			return this.method945(0, 0).aClass72Array1;
		}
		@Pc(18) Class68 local18 = this.aClass68Array1[arg0];
		if (!local18.aBoolean20 || local18.aClass72Array1.length <= 1) {
			return local18.aClass72Array1;
		}
		@Pc(39) int local39 = this.anInt197 * -308310523 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class72[] local48 = new Class72[local18.aClass72Array1.length];
		System.arraycopy(local18.aClass72Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class96_Sub20.method7745(local43, local48.length - local39) + local39;
			@Pc(77) Class72 local77 = local18.aClass72Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!acs", name = "l", descriptor = "(B)Z", line = 134)
	public boolean method950() {
		return this.anInt197 * -308310523 != -1;
	}

	@OriginalMember(owner = "client!acs", name = "t", descriptor = "()Z", line = 134)
	public boolean method951() {
		return this.anInt197 * -308310523 != -1;
	}

	@OriginalMember(owner = "client!acs", name = "al", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z", line = 415)
	static boolean method952(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!Class574.aBoolean805) {
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
					Class126.method11565();
				} else if (local18 == 2) {
					Class574.aLong288 = arg1 * 392372425371390385L;
				}
			}
			if (arg0.eventType == 34) {
				Class77_Sub26.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class115.method21203(34, 0);
			}
			return true;
		} else if (Class574.aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local18 = ((TwitchEventResult) arg0).result;
			@Pc(23) int local23 = Class529.aTwitchTV1.GetWebcamFrameData(local18, Class574.aTwitchWebcamFrameData1);
			if (local23 == 0) {
				if (Class574.aBoolean806) {
					Class574.aTwitchWebcamFrameData1.p();
				}
				if (Class574.aBoolean809) {
					Class574.aTwitchWebcamFrameData1.c();
				}
				Class616.method32364();
				Class574.aLong288 = arg1 * 392372425371390385L;
				Class115.method21203(33, 0);
			} else {
				Class574.aClass83_36 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!acs", name = "ab", descriptor = "(IIIIIIILclient!aqm;Lclient!dj;Lclient!aar;IIB)V", line = 1172)
	static void method953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class77_Sub1_Sub7 arg7, @OriginalArg(8) Class94 arg8, @OriginalArg(9) Class17 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 > arg2 && arg0 < arg4 + arg2 && arg1 > arg6 - arg9.anInt52 * 102396103 - 1 && arg1 < arg9.anInt51 * 728893755 + arg6 && arg7.aBoolean490) {
			arg10 = arg11;
		}
		@Pc(34) int[] local34 = Class11.method171(arg7);
		@Pc(38) String local38 = Class24.method445(arg7);
		if (local34 != null) {
			local38 = local38 + Class35_Sub21.method18312(local34);
		}
		arg8.method7628(local38, arg2 + 3, arg6, arg10, 0, client.aRandom2, Class703.anInt5889, Class148.aClass83Array6, null);
		if (arg7.aBoolean489) {
			Class653.aClass83_39.method18123(arg2 + 5 + arg9.method299(local38, Class148.aClass83Array6), arg6 - arg9.anInt52 * 102396103);
		}
	}

	@OriginalMember(owner = "client!acs", name = "ahd", descriptor = "(Lclient!yf;B)V", line = 10664)
	static final void method954(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(22) Class77_Sub1_Sub8 local22 = Class136.method13908(local12 >> 14 & 0x3FFF, local12 & 0x3FFF);
		if (local22 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local22.anInt3004 * 848546455;
		}
	}
}
