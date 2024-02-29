package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import com.jagex.twitchtv.TwitchTV;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamFrameData;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public class Class574 {

	@OriginalMember(owner = "client!ue", name = "ah", descriptor = "I")
	static final int anInt5387 = 2000;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
	static final int anInt5389 = 1;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	static final int anInt5390 = 2;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
	static final int anInt5391 = 3;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
	static final int anInt5392 = 0;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
	static final int anInt5394 = 2;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	static final int anInt5397 = 1;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	static final int anInt5398 = 0;

	@OriginalMember(owner = "client!ue", name = "ag", descriptor = "[I")
	static int[] anIntArray501;

	@OriginalMember(owner = "client!ue", name = "al", descriptor = "[I")
	static int[] anIntArray502;

	@OriginalMember(owner = "client!ue", name = "tg", descriptor = "Lclient!ajy;")
	public static Class77_Sub25 aClass77_Sub25_2;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "Z")
	static boolean aBoolean805 = false;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "F")
	static float aFloat314 = 0.2F;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
	static int anInt5388 = -27164503;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
	static int anInt5395 = 1727014624;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
	static int anInt5400 = 0;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
	static int anInt5396 = 907219056;

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
	static int anInt5393 = 0;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
	static int anInt5399 = 0;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "[Z")
	static boolean[] aBooleanArray31 = null;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray32 = null;

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Z")
	static boolean aBoolean807 = false;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "J")
	static long aLong289 = 0L;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "J")
	static long aLong286 = 0L;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "J")
	static long aLong287 = 0L;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
	static int anInt5402 = 0;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Z")
	static boolean aBoolean804 = false;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Z")
	static boolean aBoolean808 = false;

	@OriginalMember(owner = "client!ue", name = "ao", descriptor = "Lclient!com/jagex/twitchtv/TwitchWebcamFrameData;")
	static TwitchWebcamFrameData aTwitchWebcamFrameData1 = null;

	@OriginalMember(owner = "client!ue", name = "ak", descriptor = "Ljava/util/LinkedList;")
	static LinkedList aLinkedList6 = new LinkedList();

	@OriginalMember(owner = "client!ue", name = "au", descriptor = "Ljava/util/LinkedList;")
	static LinkedList aLinkedList7 = new LinkedList();

	@OriginalMember(owner = "client!ue", name = "ar", descriptor = "I")
	static int anInt5401 = -202745631;

	@OriginalMember(owner = "client!ue", name = "ad", descriptor = "[Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	static TwitchWebcamDevice[] aTwitchWebcamDeviceArray1 = null;

	@OriginalMember(owner = "client!ue", name = "ac", descriptor = "J")
	static long aLong288 = 0L;

	@OriginalMember(owner = "client!ue", name = "av", descriptor = "Lclient!cy;")
	static Class83 aClass83_36 = null;

	@OriginalMember(owner = "client!ue", name = "at", descriptor = "Z")
	static boolean aBoolean806 = false;

	@OriginalMember(owner = "client!ue", name = "ae", descriptor = "Z")
	static boolean aBoolean809 = false;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "(II)Z", line = 51)
	static final boolean method31490(@OriginalArg(0) int arg0) {
		return arg0 < 7;
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 72)
	Class574() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ue", name = "af", descriptor = "()V", line = 77)
	public static void method31491() {
		anInt5401 = -202745631;
	}

	@OriginalMember(owner = "client!ue", name = "an", descriptor = "()V", line = 77)
	public static void method31492() {
		anInt5401 = -202745631;
	}

	@OriginalMember(owner = "client!ue", name = "aa", descriptor = "()I", line = 81)
	public static int method31493() {
		return Class77_Sub26.aTwitchEventLiveStreams1 == null || anInt5401 * -297069345 >= Class77_Sub26.aTwitchEventLiveStreams1.streamCount - 1 ? -1 : (anInt5401 += 202745631) * -297069345;
	}

	@OriginalMember(owner = "client!ue", name = "ap", descriptor = "()I", line = 81)
	public static int method31494() {
		return Class77_Sub26.aTwitchEventLiveStreams1 == null || anInt5401 * -297069345 >= Class77_Sub26.aTwitchEventLiveStreams1.streamCount - 1 ? -1 : (anInt5401 += 202745631) * -297069345;
	}

	@OriginalMember(owner = "client!ue", name = "aw", descriptor = "()I", line = 81)
	public static int method31495() {
		return Class77_Sub26.aTwitchEventLiveStreams1 == null || anInt5401 * -297069345 >= Class77_Sub26.aTwitchEventLiveStreams1.streamCount - 1 ? -1 : (anInt5401 += 202745631) * -297069345;
	}

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "()I", line = 81)
	public static int method31496() {
		return Class77_Sub26.aTwitchEventLiveStreams1 == null || anInt5401 * -297069345 >= Class77_Sub26.aTwitchEventLiveStreams1.streamCount - 1 ? -1 : (anInt5401 += 202745631) * -297069345;
	}

	@OriginalMember(owner = "client!ue", name = "az", descriptor = "()Lclient!cy;", line = 86)
	public static Class83 method31497() {
		return aClass83_36;
	}

	@OriginalMember(owner = "client!ue", name = "bj", descriptor = "()Lclient!cy;", line = 86)
	public static Class83 method31498() {
		return aClass83_36;
	}

	@OriginalMember(owner = "client!ue", name = "bv", descriptor = "()Lclient!cy;", line = 86)
	public static Class83 method31499() {
		return aClass83_36;
	}

	@OriginalMember(owner = "client!ue", name = "bc", descriptor = "()Lclient!cy;", line = 86)
	public static Class83 method31500() {
		return aClass83_36;
	}

	@OriginalMember(owner = "client!ue", name = "ba", descriptor = "(Z)V", line = 89)
	public static void method31501() {
	}

	@OriginalMember(owner = "client!ue", name = "bl", descriptor = "(Z)V", line = 89)
	public static void method31502() {
	}

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "(Z)V", line = 90)
	public static void method31503() {
	}

	@OriginalMember(owner = "client!ue", name = "bd", descriptor = "(Z)V", line = 91)
	public static void method31504() {
	}

	@OriginalMember(owner = "client!ue", name = "by", descriptor = "(Z)V", line = 91)
	public static void method31505() {
	}

	@OriginalMember(owner = "client!ue", name = "bx", descriptor = "()I", line = 94)
	public static int method31506() {
		if (anInt5393 * -504964405 == 3) {
			return -1;
		} else if (anInt5393 * -504964405 == 0) {
			if (aStringArray32 == null) {
				if (Class508.aString221.startsWith("mac ")) {
					if (Class508.aString222.startsWith("ppc")) {
						anInt5393 = 214610089;
						return -1;
					}
					aStringArray32 = new String[3];
					aStringArray32[0] = "sdk-mac-dynamic";
					aStringArray32[1] = "twitchsdk";
					aStringArray32[2] = "twitchtv";
					aBooleanArray31 = new boolean[3];
					aBooleanArray31[0] = false;
					aBooleanArray31[1] = false;
					aBooleanArray31[2] = true;
				} else if (Class508.aString221.startsWith("win")) {
					aStringArray32 = new String[6];
					aStringArray32[0] = "avutil-ttv-51";
					aStringArray32[1] = "libmp3lame-ttv";
					aStringArray32[2] = "swresample-ttv-0";
					aStringArray32[5] = "twitchtv";
					if (Class508.aString222.startsWith("amd64") || Class508.aString222.startsWith("x86_64")) {
						aStringArray32[3] = "libmfxsw64";
						aStringArray32[4] = "twitchsdk_64_release";
					} else if (Class508.aString222.startsWith("i386") || Class508.aString222.startsWith("i486") || Class508.aString222.startsWith("i586") || Class508.aString222.startsWith("x86")) {
						aStringArray32[3] = "libmfxsw32";
						aStringArray32[4] = "twitchsdk_32_release";
					} else {
						anInt5393 = 214610089;
						return -1;
					}
					aBooleanArray31 = new boolean[6];
					aBooleanArray31[0] = true;
					aBooleanArray31[1] = true;
					aBooleanArray31[2] = true;
					aBooleanArray31[3] = false;
					aBooleanArray31[4] = true;
					aBooleanArray31[5] = true;
				} else {
					anInt5393 = 214610089;
					return -1;
				}
			}
			anInt5393 = -1360119069;
			return 0;
		} else {
			return anInt5399 * 1879685621;
		}
	}

	@OriginalMember(owner = "client!ue", name = "bw", descriptor = "()I", line = 94)
	public static int method31507() {
		if (anInt5393 * -504964405 == 3) {
			return -1;
		} else if (anInt5393 * -504964405 == 0) {
			if (aStringArray32 == null) {
				if (Class508.aString221.startsWith("mac ")) {
					if (Class508.aString222.startsWith("ppc")) {
						anInt5393 = 214610089;
						return -1;
					}
					aStringArray32 = new String[3];
					aStringArray32[0] = "sdk-mac-dynamic";
					aStringArray32[1] = "twitchsdk";
					aStringArray32[2] = "twitchtv";
					aBooleanArray31 = new boolean[3];
					aBooleanArray31[0] = false;
					aBooleanArray31[1] = false;
					aBooleanArray31[2] = true;
				} else if (Class508.aString221.startsWith("win")) {
					aStringArray32 = new String[6];
					aStringArray32[0] = "avutil-ttv-51";
					aStringArray32[1] = "libmp3lame-ttv";
					aStringArray32[2] = "swresample-ttv-0";
					aStringArray32[5] = "twitchtv";
					if (Class508.aString222.startsWith("amd64") || Class508.aString222.startsWith("x86_64")) {
						aStringArray32[3] = "libmfxsw64";
						aStringArray32[4] = "twitchsdk_64_release";
					} else if (Class508.aString222.startsWith("i386") || Class508.aString222.startsWith("i486") || Class508.aString222.startsWith("i586") || Class508.aString222.startsWith("x86")) {
						aStringArray32[3] = "libmfxsw32";
						aStringArray32[4] = "twitchsdk_32_release";
					} else {
						anInt5393 = 214610089;
						return -1;
					}
					aBooleanArray31 = new boolean[6];
					aBooleanArray31[0] = true;
					aBooleanArray31[1] = true;
					aBooleanArray31[2] = true;
					aBooleanArray31[3] = false;
					aBooleanArray31[4] = true;
					aBooleanArray31[5] = true;
				} else {
					anInt5393 = 214610089;
					return -1;
				}
			}
			anInt5393 = -1360119069;
			return 0;
		} else {
			return anInt5399 * 1879685621;
		}
	}

	@OriginalMember(owner = "client!ue", name = "bg", descriptor = "()I", line = 151)
	public static int method31508() {
		return anInt5393 * -504964405;
	}

	@OriginalMember(owner = "client!ue", name = "bz", descriptor = "()I", line = 151)
	public static int method31509() {
		return anInt5393 * -504964405;
	}

	@OriginalMember(owner = "client!ue", name = "bs", descriptor = "()I", line = 151)
	public static int method31510() {
		return anInt5393 * -504964405;
	}

	@OriginalMember(owner = "client!ue", name = "bi", descriptor = "()I", line = 151)
	public static int method31511() {
		return anInt5393 * -504964405;
	}

	@OriginalMember(owner = "client!ue", name = "bt", descriptor = "()I", line = 151)
	public static int method31512() {
		return anInt5393 * -504964405;
	}

	@OriginalMember(owner = "client!ue", name = "bu", descriptor = "()I", line = 156)
	static int method31513() {
		@Pc(1) int local1;
		try {
			for (local1 = 0; local1 < aStringArray32.length; local1++) {
				if (aStringArray32[local1] != null && aBooleanArray31[local1]) {
					Class155.method23614().method30921(aStringArray32[local1]);
				}
			}
		} catch (@Pc(24) Exception_Sub4 local24) {
			return 3;
		}
		Class529.aTwitchTV1 = new TwitchTV();
		local1 = Class529.aTwitchTV1.InitialiseTTV(Class648.method32858());
		if (local1 == 0) {
			aBoolean807 = true;
		} else {
			Class293.method27014(10 + Class184.aString133 + local1, new RuntimeException());
		}
		return 2;
	}

	@OriginalMember(owner = "client!ue", name = "bf", descriptor = "()I", line = 156)
	static int method31514() {
		@Pc(1) int local1;
		try {
			for (local1 = 0; local1 < aStringArray32.length; local1++) {
				if (aStringArray32[local1] != null && aBooleanArray31[local1]) {
					Class155.method23614().method30921(aStringArray32[local1]);
				}
			}
		} catch (@Pc(24) Exception_Sub4 local24) {
			return 3;
		}
		Class529.aTwitchTV1 = new TwitchTV();
		local1 = Class529.aTwitchTV1.InitialiseTTV(Class648.method32858());
		if (local1 == 0) {
			aBoolean807 = true;
		} else {
			Class293.method27014(10 + Class184.aString133 + local1, new RuntimeException());
		}
		return 2;
	}

	@OriginalMember(owner = "client!ue", name = "bn", descriptor = "()V", line = 173)
	public static void method31515() {
		if (!aBoolean807) {
			return;
		}
		@Pc(4) int local4 = Class529.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class529.aTwitchTV1 = null;
			aBoolean807 = false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "bp", descriptor = "()V", line = 173)
	public static void method31516() {
		if (!aBoolean807) {
			return;
		}
		@Pc(4) int local4 = Class529.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class529.aTwitchTV1 = null;
			aBoolean807 = false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "bm", descriptor = "()V", line = 173)
	public static void method31517() {
		if (!aBoolean807) {
			return;
		}
		@Pc(4) int local4 = Class529.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class529.aTwitchTV1 = null;
			aBoolean807 = false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "bo", descriptor = "()V", line = 173)
	public static void method31518() {
		if (!aBoolean807) {
			return;
		}
		@Pc(4) int local4 = Class529.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class529.aTwitchTV1 = null;
			aBoolean807 = false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "br", descriptor = "()V", line = 173)
	public static void method31519() {
		if (!aBoolean807) {
			return;
		}
		@Pc(4) int local4 = Class529.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class529.aTwitchTV1 = null;
			aBoolean807 = false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "bk", descriptor = "()V", line = 173)
	public static void method31520() {
		if (!aBoolean807) {
			return;
		}
		@Pc(4) int local4 = Class529.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class529.aTwitchTV1 = null;
			aBoolean807 = false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "bq", descriptor = "(Ljava/lang/String;Ljava/lang/String;)I", line = 184)
	public static int method31521(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (aBoolean807) {
			return Class230.method25826() == client.aClass82_2 ? Class529.aTwitchTV1.Login(arg0, arg1) : 42;
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!ue", name = "bh", descriptor = "()I", line = 194)
	public static int method31522() {
		return Class529.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "()I", line = 194)
	public static int method31523() {
		return Class529.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!ue", name = "be", descriptor = "()I", line = 194)
	public static int method31524() {
		return Class529.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!ue", name = "cc", descriptor = "()I", line = 198)
	public static int method31525() {
		if (aBoolean807) {
			Class151.method23468(Class284.aClass86_9);
			return Class529.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!ue", name = "cg", descriptor = "()I", line = 198)
	public static int method31526() {
		if (aBoolean807) {
			Class151.method23468(Class284.aClass86_9);
			return Class529.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!ue", name = "cf", descriptor = "()I", line = 198)
	public static int method31527() {
		if (aBoolean807) {
			Class151.method23468(Class284.aClass86_9);
			return Class529.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!ue", name = "cl", descriptor = "()I", line = 198)
	public static int method31528() {
		if (aBoolean807) {
			Class151.method23468(Class284.aClass86_9);
			return Class529.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!ue", name = "cp", descriptor = "()I", line = 206)
	public static int method31529() {
		return Class529.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!ue", name = "cw", descriptor = "()I", line = 206)
	public static int method31530() {
		return Class529.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!ue", name = "cz", descriptor = "(Lclient!dx;)I", line = 235)
	public static int method31531(@OriginalArg(0) Class86 arg0) {
		Class539.method30908();
		return Class529.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!ue", name = "ck", descriptor = "(Lclient!dx;)I", line = 235)
	public static int method31532(@OriginalArg(0) Class86 arg0) {
		Class539.method30908();
		return Class529.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!ue", name = "ch", descriptor = "(Lclient!dx;)I", line = 235)
	public static int method31533(@OriginalArg(0) Class86 arg0) {
		Class539.method30908();
		return Class529.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!ue", name = "ca", descriptor = "(Lclient!dx;)I", line = 235)
	public static int method31534(@OriginalArg(0) Class86 arg0) {
		Class539.method30908();
		return Class529.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!ue", name = "cr", descriptor = "()V", line = 240)
	static void method31535() {
		aBoolean804 = false;
		anIntArray501 = null;
		anIntArray502 = null;
		aLinkedList6.clear();
		aLinkedList7.clear();
		Class284.aClass86_9.method20077();
	}

	@OriginalMember(owner = "client!ue", name = "cx", descriptor = "(Ljava/lang/String;)I", line = 249)
	public static int method31536(@OriginalArg(0) String arg0) {
		return Class529.aTwitchTV1.SetStreamTitle(arg0, client.aClass670_4.aString246);
	}

	@OriginalMember(owner = "client!ue", name = "ct", descriptor = "()I", line = 253)
	public static int method31537() {
		return Class257.method26227() ? anInt5402 * 1378653945 : 0;
	}

	@OriginalMember(owner = "client!ue", name = "cv", descriptor = "()I", line = 253)
	public static int method31538() {
		return Class257.method26227() ? anInt5402 * 1378653945 : 0;
	}

	@OriginalMember(owner = "client!ue", name = "cu", descriptor = "(Z)V", line = 258)
	public static void method31539(@OriginalArg(0) boolean arg0) {
		if (aBoolean808 != arg0) {
			Class539.method30908();
			aBoolean808 = arg0;
		}
	}

	@OriginalMember(owner = "client!ue", name = "cm", descriptor = "()I", line = 265)
	public static int method31540() {
		return Class529.aTwitchTV1.GetChatState();
	}

	@OriginalMember(owner = "client!ue", name = "ci", descriptor = "()I", line = 265)
	public static int method31541() {
		return Class529.aTwitchTV1.GetChatState();
	}

	@OriginalMember(owner = "client!ue", name = "co", descriptor = "(Ljava/lang/String;)I", line = 269)
	public static int method31542(@OriginalArg(0) String arg0) {
		return Class529.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "cn", descriptor = "(Ljava/lang/String;)I", line = 269)
	public static int method31543(@OriginalArg(0) String arg0) {
		return Class529.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "cq", descriptor = "(Ljava/lang/String;)I", line = 269)
	public static int method31544(@OriginalArg(0) String arg0) {
		return Class529.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "cy", descriptor = "(Ljava/lang/String;)I", line = 269)
	public static int method31545(@OriginalArg(0) String arg0) {
		return Class529.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "cs", descriptor = "()I", line = 278)
	public static int method31546() {
		return Class529.aTwitchTV1.GetWebcamState();
	}

	@OriginalMember(owner = "client!ue", name = "di", descriptor = "(Lclient!dx;IIIIB)V", line = 307)
	static void method31547(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20151(arg1, arg2, arg1 + arg3, arg2 + arg4);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (Class136_Sub1.anInt1702 * -1857977261 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg1 + arg3 / 2;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method20088(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method20087(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3379 * -859311063].getRGB(), 0);
			arg0.method20088(local22 - 150, local32 + 2, Class136_Sub1.anInt1702 * -1278964487, 30, client.aColorArray1[client.anInt3379 * -859311063].getRGB(), 0);
			Class260.aClass94_8.method7612(Class44.aClass44_160.method713(Class128.aClass667_3), local22, local32 + local16, client.aColorArray3[client.anInt3379 * -859311063].getRGB(), -1);
			return;
		}
		@Pc(103) int local103 = Class88.anInt610 * 204700261 - (int) ((float) arg3 / Class136_Sub1.aFloat151);
		local22 = Class349.anInt4496 * -1636630007 + (int) ((float) arg4 / Class136_Sub1.aFloat151);
		local32 = Class88.anInt610 * 204700261 + (int) ((float) arg3 / Class136_Sub1.aFloat151);
		@Pc(133) int local133 = Class349.anInt4496 * -1636630007 - (int) ((float) arg4 / Class136_Sub1.aFloat151);
		Class657.anInt5768 = (Class88.anInt610 * 204700261 - (int) ((float) arg3 / Class136_Sub1.aFloat151)) * 1062791895;
		Class115.anInt2917 = (Class349.anInt4496 * -1636630007 - (int) ((float) arg4 / Class136_Sub1.aFloat151)) * -304732319;
		Class551.anInt5221 = (int) ((float) (arg3 * 2) / Class136_Sub1.aFloat151) * 2055893919;
		Class566.anInt5341 = (int) ((float) (arg4 * 2) / Class136_Sub1.aFloat151) * -1977075073;
		Class136_Sub1.aClass232_24 = Class136_Sub1.aClass232_25;
		Class136_Sub1.method13941(local103 + Class136_Sub1.anInt1674, Class136_Sub1.anInt1675 + local22, local32 + Class136_Sub1.anInt1674, Class136_Sub1.anInt1675 + local133, arg1, arg2, arg3 + arg1, arg4 + 1 + arg2);
		Class136_Sub1.method13944(arg0, !Class136_Sub1.aBoolean340, !Class136_Sub1.aBoolean343, client.aBoolean613, false);
		@Pc(219) Class695 local219 = Class136_Sub1.method13965(arg0);
		Class115_Sub3.method21238(arg0, local219, 0, 0);
		if (client.aBoolean626) {
			@Pc(233) int local233 = arg1 + arg3 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class128_Sub1.aClass94_5.method7607("Fps: " + Class504.anInt3362 * 1720947399 + " (" + Class504.anInt3363 * -482787859 + " ms)", local233, local239, 16776960, -1);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class128_Sub1.aClass94_5.method7607("Mem:" + local276 + "k", local233, local265, local278, -1);
			local239 = local265 - 15;
		}
		Class136_Sub1.aClass232_25.method25847(5);
	}

	@OriginalMember(owner = "client!ue", name = "cd", descriptor = "(Lclient!dx;JII)V", line = 337)
	public static void method31548(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		if (arg0.method20068() && arg0.method20070() > -1) {
			local9 = arg0.method20070();
			@Pc(11) Class573 local11 = null;
			if (!aLinkedList7.isEmpty()) {
				local11 = (Class573) aLinkedList7.getFirst();
			}
			if (local11 != null && local9 == local11.anInt5385 * 733600403) {
				aLinkedList7.removeFirst();
				arg0.method20014();
				@Pc(38) boolean local38 = false;
				@Pc(63) int local63;
				if (local11.aLinkedList5.isEmpty() && arg0.method20172()) {
					@Pc(54) long local54 = arg0.method20138(Class398.anInt4682 * -777198511, Class508.anInt5091 * 1445010517);
					local63 = Class529.aTwitchTV1.SubmitFrame(local54, arg0.method20371(), aBoolean808, arg2, arg3);
					arg0.method20074(local54);
				} else {
					arg0.method20075(Class398.anInt4682 * -777198511, Class508.anInt5091 * 1445010517, anIntArray501, anIntArray502);
					Class104_Sub1_Sub1_Sub1_Sub1.method19841(anIntArray501, local11.aLinkedList5, local11.anInt5386 * 1644634333, local11.anInt5384 * -1875063907, local11.aFloat313);
					local63 = Class529.aTwitchTV1.SubmitFrameRaw(anIntArray501, aBoolean808, arg2, arg3);
				}
				arg0.method20017();
				if (local63 == 2072) {
					aLong286 = arg1 * -3117649911290242775L;
				} else if (local63 == 23) {
					aLong287 = arg1 * 9074349051421350485L;
				} else if (local63 != -995 && local63 != 0) {
				}
			} else {
				arg0.method20366();
				aLinkedList7.clear();
			}
		}
		if (!aBoolean804) {
			return;
		}
		if (anIntArray501 == null) {
			anIntArray501 = new int[aBoolean808 ? arg2 * arg3 : Class508.anInt5091 * 1445010517 * -777198511 * Class398.anInt4682];
			anIntArray502 = new int[aBoolean808 ? arg3 * arg2 : Class398.anInt4682 * -777198511 * Class508.anInt5091 * 1445010517];
		}
		if (arg0.method20068()) {
			arg0.method20072(client.anInt3414, Class398.anInt4682 * -777198511, Class508.anInt5091 * 1445010517);
			aLinkedList7.add(new Class573(client.anInt3414, aLinkedList6, arg0.anInt2792 * -1555714981, arg0.anInt2793 * -385311879, arg0.aFloat191));
			aLinkedList6 = new LinkedList();
		} else {
			arg0.method20014();
			arg0.method20075(Class398.anInt4682 * -777198511, Class508.anInt5091 * 1445010517, anIntArray501, anIntArray502);
			Class104_Sub1_Sub1_Sub1_Sub1.method19841(anIntArray501, aLinkedList6, arg0.anInt2792 * -1555714981, arg0.anInt2793 * -385311879, arg0.aFloat191);
			local9 = Class529.aTwitchTV1.SubmitFrameRaw(anIntArray501, aBoolean808, arg2, arg3);
			arg0.method20017();
			aLinkedList6.clear();
			if (local9 == 2072) {
				aLong286 = arg1 * -3117649911290242775L;
			} else if (local9 == 23) {
				aLong287 = arg1 * 9074349051421350485L;
			} else if (local9 != -995 && local9 != 0) {
			}
		}
		aBoolean804 = false;
	}

	@OriginalMember(owner = "client!ue", name = "ce", descriptor = "()Z", line = 400)
	public static boolean method31549() {
		return aBoolean804;
	}

	@OriginalMember(owner = "client!ue", name = "cj", descriptor = "()Z", line = 400)
	public static boolean method31550() {
		return aBoolean804;
	}

	@OriginalMember(owner = "client!ue", name = "do", descriptor = "()Z", line = 404)
	public static boolean method31551() {
		return Class529.aTwitchTV1 != null && Class529.aTwitchTV1.IsStreaming();
	}

	@OriginalMember(owner = "client!ue", name = "dt", descriptor = "()Z", line = 404)
	public static boolean method31552() {
		return Class529.aTwitchTV1 != null && Class529.aTwitchTV1.IsStreaming();
	}

	@OriginalMember(owner = "client!ue", name = "dh", descriptor = "(Lclient!dx;J)V", line = 408)
	public static void method31553(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1) {
		arg0.method20077();
		aLinkedList6.clear();
		aLinkedList7.clear();
		aLong289 = ((long) (anInt5400 * 1895832897) + arg1) * -6716390560235218895L;
	}

	@OriginalMember(owner = "client!ue", name = "dv", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z", line = 415)
	static boolean method31554(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!aBoolean805) {
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
					aLong288 = arg1 * 392372425371390385L;
				}
			}
			if (arg0.eventType == 34) {
				Class77_Sub26.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class115.method21203(34, 0);
			}
			return true;
		} else if (aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local18 = ((TwitchEventResult) arg0).result;
			@Pc(23) int local23 = Class529.aTwitchTV1.GetWebcamFrameData(local18, aTwitchWebcamFrameData1);
			if (local23 == 0) {
				if (aBoolean806) {
					aTwitchWebcamFrameData1.p();
				}
				if (aBoolean809) {
					aTwitchWebcamFrameData1.c();
				}
				Class616.method32364();
				aLong288 = arg1 * 392372425371390385L;
				Class115.method21203(33, 0);
			} else {
				aClass83_36 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "dq", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z", line = 415)
	static boolean method31555(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!aBoolean805) {
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
					aLong288 = arg1 * 392372425371390385L;
				}
			}
			if (arg0.eventType == 34) {
				Class77_Sub26.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class115.method21203(34, 0);
			}
			return true;
		} else if (aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local18 = ((TwitchEventResult) arg0).result;
			@Pc(23) int local23 = Class529.aTwitchTV1.GetWebcamFrameData(local18, aTwitchWebcamFrameData1);
			if (local23 == 0) {
				if (aBoolean806) {
					aTwitchWebcamFrameData1.p();
				}
				if (aBoolean809) {
					aTwitchWebcamFrameData1.c();
				}
				Class616.method32364();
				aLong288 = arg1 * 392372425371390385L;
				Class115.method21203(33, 0);
			} else {
				aClass83_36 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "dn", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z", line = 415)
	static boolean method31556(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!aBoolean805) {
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
					aLong288 = arg1 * 392372425371390385L;
				}
			}
			if (arg0.eventType == 34) {
				Class77_Sub26.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class115.method21203(34, 0);
			}
			return true;
		} else if (aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local18 = ((TwitchEventResult) arg0).result;
			@Pc(23) int local23 = Class529.aTwitchTV1.GetWebcamFrameData(local18, aTwitchWebcamFrameData1);
			if (local23 == 0) {
				if (aBoolean806) {
					aTwitchWebcamFrameData1.p();
				}
				if (aBoolean809) {
					aTwitchWebcamFrameData1.c();
				}
				Class616.method32364();
				aLong288 = arg1 * 392372425371390385L;
				Class115.method21203(33, 0);
			} else {
				aClass83_36 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "da", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z", line = 415)
	static boolean method31557(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!aBoolean805) {
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
					aLong288 = arg1 * 392372425371390385L;
				}
			}
			if (arg0.eventType == 34) {
				Class77_Sub26.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class115.method21203(34, 0);
			}
			return true;
		} else if (aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local18 = ((TwitchEventResult) arg0).result;
			@Pc(23) int local23 = Class529.aTwitchTV1.GetWebcamFrameData(local18, aTwitchWebcamFrameData1);
			if (local23 == 0) {
				if (aBoolean806) {
					aTwitchWebcamFrameData1.p();
				}
				if (aBoolean809) {
					aTwitchWebcamFrameData1.c();
				}
				Class616.method32364();
				aLong288 = arg1 * 392372425371390385L;
				Class115.method21203(33, 0);
			} else {
				aClass83_36 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "dw", descriptor = "(II)V", line = 454)
	static void method31558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) TwitchEventResult local5 = new TwitchEventResult(arg0, arg1);
		@Pc(8) Class587 local8 = local5.c();
		if (local8 != null) {
			Class112.method9541(local8.method36479(), local5);
		}
	}

	@OriginalMember(owner = "client!ue", name = "dy", descriptor = "(II)V", line = 454)
	static void method31559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) TwitchEventResult local5 = new TwitchEventResult(arg0, arg1);
		@Pc(8) Class587 local8 = local5.c();
		if (local8 != null) {
			Class112.method9541(local8.method36479(), local5);
		}
	}

	@OriginalMember(owner = "client!ue", name = "dm", descriptor = "(II)V", line = 454)
	static void method31560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) TwitchEventResult local5 = new TwitchEventResult(arg0, arg1);
		@Pc(8) Class587 local8 = local5.c();
		if (local8 != null) {
			Class112.method9541(local8.method36479(), local5);
		}
	}

	@OriginalMember(owner = "client!ue", name = "dz", descriptor = "(II)V", line = 454)
	static void method31561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) TwitchEventResult local5 = new TwitchEventResult(arg0, arg1);
		@Pc(8) Class587 local8 = local5.c();
		if (local8 != null) {
			Class112.method9541(local8.method36479(), local5);
		}
	}

	@OriginalMember(owner = "client!ue", name = "di", descriptor = "(II)I", line = 473)
	public static int method31562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aTwitchWebcamFrameData1 = new TwitchWebcamFrameData();
		return arg0 >= 0 && arg0 < aTwitchWebcamDeviceArray1.length ? Class529.aTwitchTV1.StartWebcamDevice(aTwitchWebcamDeviceArray1[arg0].l * -455097687, arg1) : -1;
	}

	@OriginalMember(owner = "client!ue", name = "dr", descriptor = "(II)I", line = 473)
	public static int method31563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aTwitchWebcamFrameData1 = new TwitchWebcamFrameData();
		return arg0 >= 0 && arg0 < aTwitchWebcamDeviceArray1.length ? Class529.aTwitchTV1.StartWebcamDevice(aTwitchWebcamDeviceArray1[arg0].l * -455097687, arg1) : -1;
	}

	@OriginalMember(owner = "client!ue", name = "dp", descriptor = "(II)I", line = 473)
	public static int method31564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aTwitchWebcamFrameData1 = new TwitchWebcamFrameData();
		return arg0 >= 0 && arg0 < aTwitchWebcamDeviceArray1.length ? Class529.aTwitchTV1.StartWebcamDevice(aTwitchWebcamDeviceArray1[arg0].l * -455097687, arg1) : -1;
	}

	@OriginalMember(owner = "client!ue", name = "de", descriptor = "(I)I", line = 479)
	public static int method31565(@OriginalArg(0) int arg0) {
		aTwitchWebcamFrameData1 = null;
		aClass83_36 = null;
		return arg0 >= 0 && arg0 < aTwitchWebcamDeviceArray1.length ? Class529.aTwitchTV1.StopWebcamDevice(aTwitchWebcamDeviceArray1[arg0].l * -455097687) : -1;
	}

	@OriginalMember(owner = "client!ue", name = "du", descriptor = "()V", line = 486)
	static void method31566() {
		aTwitchWebcamDeviceArray1 = Class529.aTwitchTV1.GetWebcamDevices();
	}

	@OriginalMember(owner = "client!ue", name = "dk", descriptor = "()I", line = 490)
	public static int method31567() {
		return aTwitchWebcamDeviceArray1 == null ? 0 : aTwitchWebcamDeviceArray1.length;
	}

	@OriginalMember(owner = "client!ue", name = "ds", descriptor = "()I", line = 490)
	public static int method31568() {
		return aTwitchWebcamDeviceArray1 == null ? 0 : aTwitchWebcamDeviceArray1.length;
	}

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;", line = 494)
	public static TwitchWebcamDevice method31569(@OriginalArg(0) int arg0) {
		if (aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(5) int local5 = 0; local5 < aTwitchWebcamDeviceArray1.length; local5++) {
			if (arg0 == aTwitchWebcamDeviceArray1[local5].v * -1989490985) {
				return aTwitchWebcamDeviceArray1[local5];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ue", name = "df", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;", line = 494)
	public static TwitchWebcamDevice method31570(@OriginalArg(0) int arg0) {
		if (aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(5) int local5 = 0; local5 < aTwitchWebcamDeviceArray1.length; local5++) {
			if (arg0 == aTwitchWebcamDeviceArray1[local5].v * -1989490985) {
				return aTwitchWebcamDeviceArray1[local5];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ue", name = "dx", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;", line = 494)
	public static TwitchWebcamDevice method31571(@OriginalArg(0) int arg0) {
		if (aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(5) int local5 = 0; local5 < aTwitchWebcamDeviceArray1.length; local5++) {
			if (arg0 == aTwitchWebcamDeviceArray1[local5].v * -1989490985) {
				return aTwitchWebcamDeviceArray1[local5];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ue", name = "dc", descriptor = "(Ljava/lang/String;)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;", line = 504)
	public static TwitchWebcamDevice method31572(@OriginalArg(0) String arg0) {
		if (aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(5) int local5 = 0; local5 < aTwitchWebcamDeviceArray1.length; local5++) {
			if (aTwitchWebcamDeviceArray1[local5].p.equals(arg0)) {
				return aTwitchWebcamDeviceArray1[local5];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ue", name = "dl", descriptor = "(ZZ)V", line = 514)
	public static void method31573(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		aBoolean806 = arg0;
		aBoolean809 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "dg", descriptor = "(ZZ)V", line = 514)
	public static void method31574(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		aBoolean806 = arg0;
		aBoolean809 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "dd", descriptor = "(ZZ)V", line = 514)
	public static void method31575(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		aBoolean806 = arg0;
		aBoolean809 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "dj", descriptor = "(ZZ)V", line = 514)
	public static void method31576(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		aBoolean806 = arg0;
		aBoolean809 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "eh", descriptor = "()I", line = 519)
	public static int method31577() {
		Class77_Sub26.aTwitchEventLiveStreams1 = null;
		return Class529.aTwitchTV1.RequestLiveStreams(client.aClass670_4.aString246);
	}

	@OriginalMember(owner = "client!ue", name = "ej", descriptor = "()I", line = 519)
	public static int method31578() {
		Class77_Sub26.aTwitchEventLiveStreams1 = null;
		return Class529.aTwitchTV1.RequestLiveStreams(client.aClass670_4.aString246);
	}

	@OriginalMember(owner = "client!ue", name = "eo", descriptor = "()I", line = 525)
	public static int method31579() {
		return Class529.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!ue", name = "ep", descriptor = "(IIII)V", line = 529)
	public static void method31580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aLinkedList6.addLast(new Class585(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@OriginalMember(owner = "client!ue", name = "eq", descriptor = "(IIII)V", line = 529)
	public static void method31581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aLinkedList6.addLast(new Class585(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@OriginalMember(owner = "client!ue", name = "es", descriptor = "([ILjava/util/LinkedList;IIF)V", line = 533)
	static void method31582(@OriginalArg(0) int[] arg0, @OriginalArg(1) LinkedList arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		if (arg1.isEmpty()) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg1.size(); local5++) {
			@Pc(14) Class585 local14 = (Class585) arg1.get(local5);
			@Pc(25) int local25 = arg2 + (int) ((float) (local14.anInt5449 * -1690294733) * arg4);
			@Pc(36) int local36 = (int) ((float) (local14.anInt5451 * 1291235515) * arg4) + arg3;
			@Pc(45) int local45 = (int) (arg4 * (float) (local14.anInt5450 * -319890445));
			@Pc(54) int local54 = (int) (arg4 * (float) (local14.anInt5452 * 300807017));
			if (local25 < Class398.anInt4682 * -777198511 && local36 < Class508.anInt5091 * 1445010517) {
				if (local45 + local25 > Class398.anInt4682 * -777198511) {
					local45 = Class398.anInt4682 * -777198511 - local25;
				}
				if (local36 + local54 > Class508.anInt5091 * 1445010517) {
					local54 = Class508.anInt5091 * 1445010517 - local36;
				}
				for (@Pc(94) int local94 = local36; local94 < local36 + local54; local94++) {
					@Pc(107) int local107 = local25 + local94 * -777198511 * Class398.anInt4682;
					Arrays.fill(arg0, local107, local107 + local45, -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "ei", descriptor = "([ILjava/util/LinkedList;IIF)V", line = 533)
	static void method31583(@OriginalArg(0) int[] arg0, @OriginalArg(1) LinkedList arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		if (arg1.isEmpty()) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg1.size(); local5++) {
			@Pc(14) Class585 local14 = (Class585) arg1.get(local5);
			@Pc(25) int local25 = arg2 + (int) ((float) (local14.anInt5449 * -1690294733) * arg4);
			@Pc(36) int local36 = (int) ((float) (local14.anInt5451 * 1291235515) * arg4) + arg3;
			@Pc(45) int local45 = (int) (arg4 * (float) (local14.anInt5450 * -319890445));
			@Pc(54) int local54 = (int) (arg4 * (float) (local14.anInt5452 * 300807017));
			if (local25 < Class398.anInt4682 * -777198511 && local36 < Class508.anInt5091 * 1445010517) {
				if (local45 + local25 > Class398.anInt4682 * -777198511) {
					local45 = Class398.anInt4682 * -777198511 - local25;
				}
				if (local36 + local54 > Class508.anInt5091 * 1445010517) {
					local54 = Class508.anInt5091 * 1445010517 - local36;
				}
				for (@Pc(94) int local94 = local36; local94 < local36 + local54; local94++) {
					@Pc(107) int local107 = local25 + local94 * -777198511 * Class398.anInt4682;
					Arrays.fill(arg0, local107, local107 + local45, -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "ed", descriptor = "()Z", line = 552)
	public static boolean method31584() {
		if (Class508.aString221.startsWith("win")) {
			@Pc(5) String local5 = "msvcr110.dll";
			@Pc(7) String local7 = "msvcp110.dll";
			@Pc(18) String[] local18 = new String[] { local5, local7 };
			@Pc(21) String local21 = System.getenv("WINDIR");
			if (local21 == "") {
				return false;
			}
			for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
				@Pc(48) File local48 = new File(local21 + "\\system32\\" + local18[local28]);
				if (!local48.exists() || local48.isDirectory()) {
					return false;
				}
			}
			return true;
		} else if (Class508.aString221.startsWith("mac")) {
			try {
				@Pc(68) Process local68 = Runtime.getRuntime().exec("ps -few");
				@Pc(77) BufferedReader local77 = new BufferedReader(new InputStreamReader(local68.getInputStream()));
				try {
					@Pc(80) int local80 = local68.waitFor();
					if (local80 != 0) {
						return false;
					}
				} catch (@Pc(86) InterruptedException local86) {
					return false;
				}
				@Pc(90) boolean local90 = false;
				@Pc(94) String local94;
				while ((local94 = local77.readLine()) != null) {
					if (local94.toLowerCase().indexOf("soundflowerbed") != -1) {
						local90 = true;
						break;
					}
				}
				local77.close();
				return local90;
			} catch (@Pc(109) Exception local109) {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "ee", descriptor = "()Z", line = 552)
	public static boolean method31585() {
		if (Class508.aString221.startsWith("win")) {
			@Pc(5) String local5 = "msvcr110.dll";
			@Pc(7) String local7 = "msvcp110.dll";
			@Pc(18) String[] local18 = new String[] { local5, local7 };
			@Pc(21) String local21 = System.getenv("WINDIR");
			if (local21 == "") {
				return false;
			}
			for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
				@Pc(48) File local48 = new File(local21 + "\\system32\\" + local18[local28]);
				if (!local48.exists() || local48.isDirectory()) {
					return false;
				}
			}
			return true;
		} else if (Class508.aString221.startsWith("mac")) {
			try {
				@Pc(68) Process local68 = Runtime.getRuntime().exec("ps -few");
				@Pc(77) BufferedReader local77 = new BufferedReader(new InputStreamReader(local68.getInputStream()));
				try {
					@Pc(80) int local80 = local68.waitFor();
					if (local80 != 0) {
						return false;
					}
				} catch (@Pc(86) InterruptedException local86) {
					return false;
				}
				@Pc(90) boolean local90 = false;
				@Pc(94) String local94;
				while ((local94 = local77.readLine()) != null) {
					if (local94.toLowerCase().indexOf("soundflowerbed") != -1) {
						local90 = true;
						break;
					}
				}
				local77.close();
				return local90;
			} catch (@Pc(109) Exception local109) {
				return false;
			}
		} else {
			return false;
		}
	}
}
