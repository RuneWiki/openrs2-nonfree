package com.jagex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public class Class339 implements Interface56, Interface38 {

	@OriginalMember(owner = "client!na", name = "fb", descriptor = "[Lclient!na;")
	static Class339[] aClass339Array1;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!na;")
	public static final Class339 aClass339_105 = new Class339(0, 'i', Class342.aClass342_5, 0, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!na;")
	public static final Class339 aClass339_5 = new Class339(1, '1', Class342.aClass342_5, 0, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Lclient!na;")
	static final Class339 aClass339_164 = new Class339(2, '2', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!na;")
	static final Class339 aClass339_7 = new Class339(3, ':', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Lclient!na;")
	static final Class339 aClass339_8 = new Class339(4, ';', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "x", descriptor = "Lclient!na;")
	static final Class339 aClass339_9 = new Class339(5, '@', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "s", descriptor = "Lclient!na;")
	static final Class339 aClass339_10 = new Class339(6, 'A', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "u", descriptor = "Lclient!na;")
	static final Class339 aClass339_11 = new Class339(7, 'C', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "y", descriptor = "Lclient!na;")
	static final Class339 aClass339_163 = new Class339(8, 'H', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!na;")
	static final Class339 aClass339_13 = new Class339(9, 'I', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!na;")
	static final Class339 aClass339_14 = new Class339(10, 'K', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "z", descriptor = "Lclient!na;")
	static final Class339 aClass339_15 = new Class339(11, 'M', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!na;")
	static final Class339 aClass339_47 = new Class339(12, 'N', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!na;")
	static final Class339 aClass339_17 = new Class339(13, 'O', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Lclient!na;")
	static final Class339 aClass339_18 = new Class339(14, 'P', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Lclient!na;")
	static final Class339 aClass339_157 = new Class339(15, 'Q', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!na;")
	static final Class339 aClass339_20 = new Class339(16, 'R', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "q", descriptor = "Lclient!na;")
	static final Class339 aClass339_153 = new Class339(17, 'S', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "m", descriptor = "Lclient!na;")
	static final Class339 aClass339_160 = new Class339(18, 'T', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "v", descriptor = "Lclient!na;")
	static final Class339 aClass339_23 = new Class339(19, 'V', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "t", descriptor = "Lclient!na;")
	static final Class339 aClass339_6 = new Class339(20, '^', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Lclient!na;")
	static final Class339 aClass339_25 = new Class339(21, '`', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "o", descriptor = "Lclient!na;")
	static final Class339 aClass339_26 = new Class339(22, 'c', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Lclient!na;")
	static final Class339 aClass339_27 = new Class339(23, 'd', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!na;")
	static final Class339 aClass339_28 = new Class339(24, 'e', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!na;")
	static final Class339 aClass339_86 = new Class339(25, 'f', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "at", descriptor = "Lclient!na;")
	static final Class339 aClass339_40 = new Class339(26, 'g', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "af", descriptor = "Lclient!na;")
	static final Class339 aClass339_142 = new Class339(27, 'h', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "ak", descriptor = "Lclient!na;")
	static final Class339 aClass339_32 = new Class339(28, 'j', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "aa", descriptor = "Lclient!na;")
	static final Class339 aClass339_33 = new Class339(29, 'k', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ah", descriptor = "Lclient!na;")
	static final Class339 aClass339_87 = new Class339(30, 'l', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "an", descriptor = "Lclient!na;")
	static final Class339 aClass339_35 = new Class339(31, 'm', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "aj", descriptor = "Lclient!na;")
	static final Class339 aClass339_36 = new Class339(32, 'n', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "as", descriptor = "Lclient!na;")
	static final Class339 aClass339_37 = new Class339(33, 'o', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "ai", descriptor = "Lclient!na;")
	static final Class339 aClass339_144 = new Class339(34, 'p', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "aq", descriptor = "Lclient!na;")
	static final Class339 aClass339_39 = new Class339(35, 'r', Class342.aClass342_2, -1L, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "av", descriptor = "Lclient!na;")
	public static final Class339 aClass339_89 = new Class339(36, 's', Class342.aClass342_3, "", new Class350[] { Class350.aClass350_1, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ax", descriptor = "Lclient!na;")
	static final Class339 aClass339_16 = new Class339(37, 't', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "az", descriptor = "Lclient!na;")
	static final Class339 aClass339_42 = new Class339(38, 'u', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "al", descriptor = "Lclient!na;")
	static final Class339 aClass339_43 = new Class339(39, 'v', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ao", descriptor = "Lclient!na;")
	static final Class339 aClass339_44 = new Class339(40, 'x', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ap", descriptor = "Lclient!na;")
	static final Class339 aClass339_63 = new Class339(41, 'y', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ab", descriptor = "Lclient!na;")
	static final Class339 aClass339_46 = new Class339(42, 'z', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "au", descriptor = "Lclient!na;")
	static final Class339 aClass339_116 = new Class339(43, '|', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ay", descriptor = "Lclient!na;")
	static final Class339 aClass339_48 = new Class339(44, '€', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ag", descriptor = "Lclient!na;")
	static final Class339 aClass339_162 = new Class339(45, 'ƒ', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "am", descriptor = "Lclient!na;")
	static final Class339 aClass339_50 = new Class339(46, '‡', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ar", descriptor = "Lclient!na;")
	static final Class339 aClass339_21 = new Class339(47, '‰', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ae", descriptor = "Lclient!na;")
	static final Class339 aClass339_52 = new Class339(48, 'Š', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ad", descriptor = "Lclient!na;")
	static final Class339 aClass339_29 = new Class339(49, 'Œ', Class342.aClass342_2, -1L, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "aw", descriptor = "Lclient!na;")
	static final Class339 aClass339_54 = new Class339(50, 'Ž', Class342.aClass342_4, new Class3_Sub32(), new Class350[] { Class350.aClass350_1, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ac", descriptor = "Lclient!na;")
	static final Class339 aClass339_55 = new Class339(51, 'š', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bw", descriptor = "Lclient!na;")
	static final Class339 aClass339_56 = new Class339(52, 'œ', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bp", descriptor = "Lclient!na;")
	static final Class339 aClass339_57 = new Class339(53, '¡', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bd", descriptor = "Lclient!na;")
	static final Class339 aClass339_34 = new Class339(54, '¢', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "bs", descriptor = "Lclient!na;")
	static final Class339 aClass339_58 = new Class339(55, '£', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bm", descriptor = "Lclient!na;")
	static final Class339 aClass339_59 = new Class339(56, '§', Class342.aClass342_2, -1L, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bf", descriptor = "Lclient!na;")
	static final Class339 aClass339_113 = new Class339(57, '«', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bt", descriptor = "Lclient!na;")
	static final Class339 aClass339_61 = new Class339(58, '®', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bk", descriptor = "Lclient!na;")
	static final Class339 aClass339_62 = new Class339(59, 'µ', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bg", descriptor = "Lclient!na;")
	static final Class339 aClass339_60 = new Class339(60, '¶', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "br", descriptor = "Lclient!na;")
	static final Class339 aClass339_45 = new Class339(61, 'Æ', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bb", descriptor = "Lclient!na;")
	static final Class339 aClass339_64 = new Class339(62, '×', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "by", descriptor = "Lclient!na;")
	static final Class339 aClass339_65 = new Class339(63, 'Þ', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bl", descriptor = "Lclient!na;")
	static final Class339 aClass339_109 = new Class339(64, 'á', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bi", descriptor = "Lclient!na;")
	static final Class339 aClass339_4 = new Class339(65, 'æ', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "bu", descriptor = "Lclient!na;")
	static final Class339 aClass339_68 = new Class339(66, 'é', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ba", descriptor = "Lclient!na;")
	static final Class339 aClass339_69 = new Class339(67, 'í', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bo", descriptor = "Lclient!na;")
	static final Class339 aClass339_70 = new Class339(68, 'î', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bc", descriptor = "Lclient!na;")
	static final Class339 aClass339_126 = new Class339(69, 'ó', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bn", descriptor = "Lclient!na;")
	static final Class339 aClass339_110 = new Class339(70, 'ú', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "be", descriptor = "Lclient!na;")
	static final Class339 aClass339_73 = new Class339(71, 'û', Class342.aClass342_2, -1L, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "bx", descriptor = "Lclient!na;")
	static final Class339 aClass339_103 = new Class339(72, 'Î', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "bh", descriptor = "Lclient!na;")
	static final Class339 aClass339_75 = new Class339(73, 'J', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "bj", descriptor = "Lclient!na;")
	static final Class339 aClass339_76 = new Class339(74, 'Ð', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "bq", descriptor = "Lclient!na;")
	static final Class339 aClass339_77 = new Class339(75, '¤', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "bv", descriptor = "Lclient!na;")
	static final Class339 aClass339_71 = new Class339(76, '¥', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "bz", descriptor = "Lclient!na;")
	static final Class339 aClass339_79 = new Class339(77, 'è', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "ck", descriptor = "Lclient!na;")
	static final Class339 aClass339_80 = new Class339(78, '¹', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "cm", descriptor = "Lclient!na;")
	static final Class339 aClass339_81 = new Class339(79, '°', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "cj", descriptor = "Lclient!na;")
	static final Class339 aClass339_82 = new Class339(80, 'ì', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "cu", descriptor = "Lclient!na;")
	static final Class339 aClass339_83 = new Class339(81, 'ë', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "cv", descriptor = "Lclient!na;")
	static final Class339 aClass339_84 = new Class339(83, 'þ', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1 });

	@OriginalMember(owner = "client!na", name = "cl", descriptor = "Lclient!na;")
	static final Class339 aClass339_85 = new Class339(84, 'ý', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1 });

	@OriginalMember(owner = "client!na", name = "cq", descriptor = "Lclient!na;")
	static final Class339 aClass339_49 = new Class339(85, 'ÿ', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1 });

	@OriginalMember(owner = "client!na", name = "cg", descriptor = "Lclient!na;")
	static final Class339 aClass339_101 = new Class339(86, 'õ', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1 });

	@OriginalMember(owner = "client!na", name = "cp", descriptor = "Lclient!na;")
	static final Class339 aClass339_88 = new Class339(87, 'ô', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1 });

	@OriginalMember(owner = "client!na", name = "cc", descriptor = "Lclient!na;")
	static final Class339 aClass339_38 = new Class339(88, 'ö', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1 });

	@OriginalMember(owner = "client!na", name = "cs", descriptor = "Lclient!na;")
	static final Class339 aClass339_90 = new Class339(89, 'ò', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ct", descriptor = "Lclient!na;")
	static final Class339 aClass339_91 = new Class339(90, 'Ü', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "cx", descriptor = "Lclient!na;")
	static final Class339 aClass339_96 = new Class339(91, 'ù', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "cy", descriptor = "Lclient!na;")
	static final Class339 aClass339_24 = new Class339(92, 'ï', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "cb", descriptor = "Lclient!na;")
	static final Class339 aClass339_78 = new Class339(93, '¯', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3 });

	@OriginalMember(owner = "client!na", name = "cz", descriptor = "Lclient!na;")
	static final Class339 aClass339_94 = new Class339(94, 'ê', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "cn", descriptor = "Lclient!na;")
	static final Class339 aClass339_95 = new Class339(95, 'ð', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "co", descriptor = "Lclient!na;")
	static final Class339 aClass339_102 = new Class339(96, 'å', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "cd", descriptor = "Lclient!na;")
	static final Class339 aClass339_97 = new Class339(97, 'a', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ch", descriptor = "Lclient!na;")
	static final Class339 aClass339_98 = new Class339(98, 'F', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ci", descriptor = "Lclient!na;")
	static final Class339 aClass339_99 = new Class339(99, 'L', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ca", descriptor = "Lclient!na;")
	static final Class339 aClass339_93 = new Class339(100, '©', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "cr", descriptor = "Lclient!na;")
	static final Class339 aClass339_100 = new Class339(101, 'Ý', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ce", descriptor = "Lclient!na;")
	static final Class339 aClass339_141 = new Class339(102, '¬', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "cw", descriptor = "Lclient!na;")
	static final Class339 aClass339_67 = new Class339(103, 'ø', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "cf", descriptor = "Lclient!na;")
	static final Class339 aClass339_104 = new Class339(104, 'ä', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "dv", descriptor = "Lclient!na;")
	static final Class339 aClass339_125 = new Class339(105, 'ã', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "df", descriptor = "Lclient!na;")
	static final Class339 aClass339_106 = new Class339(106, 'â', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "dh", descriptor = "Lclient!na;")
	static final Class339 aClass339_107 = new Class339(107, 'à', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "db", descriptor = "Lclient!na;")
	static final Class339 aClass339_108 = new Class339(108, 'À', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "dp", descriptor = "Lclient!na;")
	static final Class339 aClass339_31 = new Class339(109, 'Ò', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "dk", descriptor = "Lclient!na;")
	static final Class339 aClass339_72 = new Class339(110, 'Ï', Class342.aClass342_2, 0L, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "dy", descriptor = "Lclient!na;")
	static final Class339 aClass339_19 = new Class339(111, 'Ì', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "dg", descriptor = "Lclient!na;")
	static final Class339 aClass339_74 = new Class339(112, 'É', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "dq", descriptor = "Lclient!na;")
	static final Class339 aClass339_124 = new Class339(113, 'Ê', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_6, Class350.aClass350_3, Class350.aClass350_5 });

	@OriginalMember(owner = "client!na", name = "ds", descriptor = "Lclient!na;")
	static final Class339 aClass339_114 = new Class339(114, '÷', Class342.aClass342_5, -1, new Class350[] { Class350.aClass350_1, Class350.aClass350_2, Class350.aClass350_3, Class350.aClass350_4, Class350.aClass350_5, Class350.aClass350_6 });

	@OriginalMember(owner = "client!na", name = "dr", descriptor = "Lclient!na;")
	static final Class339 aClass339_115 = new Class339(Class342.aClass342_5, -1, '#');

	@OriginalMember(owner = "client!na", name = "dc", descriptor = "Lclient!na;")
	static final Class339 aClass339_53 = new Class339(Class342.aClass342_5, -1, '(');

	@OriginalMember(owner = "client!na", name = "dt", descriptor = "Lclient!na;")
	static final Class339 aClass339_117 = new Class339(Class342.aClass342_5, -1, '%');

	@OriginalMember(owner = "client!na", name = "dd", descriptor = "Lclient!na;")
	static final Class339 aClass339_118 = new Class339(Class342.aClass342_5, -1, '&');

	@OriginalMember(owner = "client!na", name = "da", descriptor = "Lclient!na;")
	static final Class339 aClass339_119 = new Class339(Class342.aClass342_5, -1, ')');

	@OriginalMember(owner = "client!na", name = "dz", descriptor = "Lclient!na;")
	static final Class339 aClass339_41 = new Class339(Class342.aClass342_5, -1, '0');

	@OriginalMember(owner = "client!na", name = "de", descriptor = "Lclient!na;")
	static final Class339 aClass339_121 = new Class339(Class342.aClass342_5, -1, '3');

	@OriginalMember(owner = "client!na", name = "dl", descriptor = "Lclient!na;")
	static final Class339 aClass339_122 = new Class339(Class342.aClass342_5, -1, '4');

	@OriginalMember(owner = "client!na", name = "dj", descriptor = "Lclient!na;")
	static final Class339 aClass339_123 = new Class339(Class342.aClass342_5, -1, '5');

	@OriginalMember(owner = "client!na", name = "dx", descriptor = "Lclient!na;")
	static final Class339 aClass339_92 = new Class339(Class342.aClass342_5, -1, '6');

	@OriginalMember(owner = "client!na", name = "dm", descriptor = "Lclient!na;")
	static final Class339 aClass339_51 = new Class339(Class342.aClass342_5, -1, '7');

	@OriginalMember(owner = "client!na", name = "dw", descriptor = "Lclient!na;")
	static final Class339 aClass339_22 = new Class339(Class342.aClass342_5, -1, '8');

	@OriginalMember(owner = "client!na", name = "du", descriptor = "Lclient!na;")
	static final Class339 aClass339_127 = new Class339(Class342.aClass342_5, -1, '9');

	@OriginalMember(owner = "client!na", name = "do", descriptor = "Lclient!na;")
	static final Class339 aClass339_128 = new Class339(Class342.aClass342_5, -1, 'B');

	@OriginalMember(owner = "client!na", name = "di", descriptor = "Lclient!na;")
	static final Class339 aClass339_129 = new Class339(Class342.aClass342_5, -1, 'D');

	@OriginalMember(owner = "client!na", name = "dn", descriptor = "Lclient!na;")
	static final Class339 aClass339_130 = new Class339(Class342.aClass342_5, -1, 'G');

	@OriginalMember(owner = "client!na", name = "ee", descriptor = "Lclient!na;")
	static final Class339 aClass339_131 = new Class339(Class342.aClass342_5, -1, 'U');

	@OriginalMember(owner = "client!na", name = "ex", descriptor = "Lclient!na;")
	static final Class339 aClass339_132 = new Class339(Class342.aClass342_5, -1, 'Á');

	@OriginalMember(owner = "client!na", name = "eb", descriptor = "Lclient!na;")
	static final Class339 aClass339_133 = new Class339(Class342.aClass342_5, -1, 'Z');

	@OriginalMember(owner = "client!na", name = "ef", descriptor = "Lclient!na;")
	static final Class339 aClass339_134 = new Class339(Class342.aClass342_5, -1, 'b');

	@OriginalMember(owner = "client!na", name = "ey", descriptor = "Lclient!na;")
	static final Class339 aClass339_135 = new Class339(Class342.aClass342_5, -1, 'q');

	@OriginalMember(owner = "client!na", name = "er", descriptor = "Lclient!na;")
	static final Class339 aClass339_136 = new Class339(Class342.aClass342_5, -1, 'w');

	@OriginalMember(owner = "client!na", name = "ej", descriptor = "Lclient!na;")
	static final Class339 aClass339_137 = new Class339(Class342.aClass342_5, -1, '~');

	@OriginalMember(owner = "client!na", name = "en", descriptor = "Lclient!na;")
	static final Class339 aClass339_138 = new Class339(Class342.aClass342_5, -1, '±');

	@OriginalMember(owner = "client!na", name = "ew", descriptor = "Lclient!na;")
	static final Class339 aClass339_139 = new Class339(Class342.aClass342_5, -1, '»');

	@OriginalMember(owner = "client!na", name = "em", descriptor = "Lclient!na;")
	static final Class339 aClass339_140 = new Class339(Class342.aClass342_5, -1, '¿');

	@OriginalMember(owner = "client!na", name = "ec", descriptor = "Lclient!na;")
	static final Class339 aClass339_30 = new Class339(Class342.aClass342_5, -1, 'Ç');

	@OriginalMember(owner = "client!na", name = "ea", descriptor = "Lclient!na;")
	static final Class339 aClass339_148 = new Class339(Class342.aClass342_5, -1, 'Ø');

	@OriginalMember(owner = "client!na", name = "ez", descriptor = "Lclient!na;")
	static final Class339 aClass339_143 = new Class339(Class342.aClass342_5, -1, 'Ñ');

	@OriginalMember(owner = "client!na", name = "ep", descriptor = "Lclient!na;")
	static final Class339 aClass339_161 = new Class339(Class342.aClass342_5, -1, 'ñ');

	@OriginalMember(owner = "client!na", name = "ed", descriptor = "Lclient!na;")
	static final Class339 aClass339_145 = new Class339(Class342.aClass342_5, -1, 'Ù');

	@OriginalMember(owner = "client!na", name = "eq", descriptor = "Lclient!na;")
	static final Class339 aClass339_146 = new Class339(Class342.aClass342_5, -1, 'ß');

	@OriginalMember(owner = "client!na", name = "ev", descriptor = "Lclient!na;")
	static final Class339 aClass339_147 = new Class339(Class342.aClass342_5, -1, 'E');

	@OriginalMember(owner = "client!na", name = "et", descriptor = "Lclient!na;")
	static final Class339 aClass339_112 = new Class339(Class342.aClass342_5, -1, 'W');

	@OriginalMember(owner = "client!na", name = "eo", descriptor = "Lclient!na;")
	static final Class339 aClass339_149 = new Class339(Class342.aClass342_5, -1, 'X');

	@OriginalMember(owner = "client!na", name = "ek", descriptor = "Lclient!na;")
	static final Class339 aClass339_150 = new Class339(Class342.aClass342_5, -1, 'Y');

	@OriginalMember(owner = "client!na", name = "ei", descriptor = "Lclient!na;")
	static final Class339 aClass339_151 = new Class339(Class342.aClass342_5, -1, 'Ä');

	@OriginalMember(owner = "client!na", name = "el", descriptor = "Lclient!na;")
	static final Class339 aClass339_152 = new Class339(Class342.aClass342_5, -1, 'ü');

	@OriginalMember(owner = "client!na", name = "eu", descriptor = "Lclient!na;")
	static final Class339 aClass339_66 = new Class339(Class342.aClass342_5, -1, 'Ú');

	@OriginalMember(owner = "client!na", name = "eg", descriptor = "Lclient!na;")
	static final Class339 aClass339_154 = new Class339(Class342.aClass342_5, -1, 'Û');

	@OriginalMember(owner = "client!na", name = "es", descriptor = "Lclient!na;")
	static final Class339 aClass339_155 = new Class339(Class342.aClass342_5, -1, 'Ó');

	@OriginalMember(owner = "client!na", name = "eh", descriptor = "Lclient!na;")
	static final Class339 aClass339_111 = new Class339(Class342.aClass342_5, -1, 'È');

	@OriginalMember(owner = "client!na", name = "ft", descriptor = "Lclient!na;")
	static final Class339 aClass339_120 = new Class339(null, -1, '!');

	@OriginalMember(owner = "client!na", name = "fp", descriptor = "Lclient!na;")
	static final Class339 aClass339_158 = new Class339(null, -1, '$');

	@OriginalMember(owner = "client!na", name = "fm", descriptor = "Lclient!na;")
	static final Class339 aClass339_159 = new Class339(null, -1, '?');

	@OriginalMember(owner = "client!na", name = "fn", descriptor = "Lclient!na;")
	static final Class339 aClass339_156 = new Class339(null, -1, 'ç');

	@OriginalMember(owner = "client!na", name = "fs", descriptor = "Lclient!na;")
	static final Class339 aClass339_12 = new Class339(null, -1, '*');

	@OriginalMember(owner = "client!na", name = "fg", descriptor = "Ljava/lang/Object;")
	Object anObject18;

	@OriginalMember(owner = "client!na", name = "fx", descriptor = "I")
	final int anInt4601;

	@OriginalMember(owner = "client!na", name = "fh", descriptor = "C")
	final char aChar12;

	@OriginalMember(owner = "client!na", name = "fu", descriptor = "Lclient!nd;")
	final Class342 aClass342_1;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(Lclient!ahb;I)Lclient!sx;", line = 40)
	static Class469 method26433(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		@Pc(7) int local7 = arg0.method20269();
		@Pc(11) int local11 = arg0.method20269();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = arg0.method20269();
		}
		return new Class469(local3, local7, local14);
	}

	@OriginalMember(owner = "client!na", name = "p", descriptor = "(B)[Lclient!na;", line = 186)
	public static Class339[] method26430() {
		return new Class339[] { aClass339_94, aClass339_118, aClass339_96, aClass339_68, aClass339_15, aClass339_142, aClass339_33, aClass339_44, aClass339_23, aClass339_113, aClass339_133, aClass339_147, aClass339_77, aClass339_156, aClass339_103, aClass339_54, aClass339_14, aClass339_20, aClass339_117, aClass339_45, aClass339_88, aClass339_99, aClass339_119, aClass339_58, aClass339_8, aClass339_123, aClass339_61, aClass339_136, aClass339_17, aClass339_109, aClass339_154, aClass339_37, aClass339_162, aClass339_161, aClass339_121, aClass339_65, aClass339_112, aClass339_63, aClass339_28, aClass339_70, aClass339_139, aClass339_4, aClass339_9, aClass339_84, aClass339_130, aClass339_72, aClass339_82, aClass339_52, aClass339_124, aClass339_100, aClass339_21, aClass339_90, aClass339_51, aClass339_97, aClass339_71, aClass339_7, aClass339_59, aClass339_26, aClass339_31, aClass339_56, aClass339_145, aClass339_38, aClass339_143, aClass339_22, aClass339_80, aClass339_126, aClass339_129, aClass339_27, aClass339_164, aClass339_39, aClass339_141, aClass339_153, aClass339_69, aClass339_122, aClass339_101, aClass339_41, aClass339_16, aClass339_60, aClass339_6, aClass339_75, aClass339_86, aClass339_148, aClass339_111, aClass339_35, aClass339_50, aClass339_106, aClass339_79, aClass339_76, aClass339_12, aClass339_53, aClass339_116, aClass339_29, aClass339_67, aClass339_78, aClass339_89, aClass339_140, aClass339_95, aClass339_24, aClass339_98, aClass339_127, aClass339_5, aClass339_155, aClass339_11, aClass339_40, aClass339_34, aClass339_150, aClass339_81, aClass339_149, aClass339_25, aClass339_92, aClass339_10, aClass339_42, aClass339_125, aClass339_91, aClass339_132, aClass339_134, aClass339_160, aClass339_43, aClass339_110, aClass339_105, aClass339_62, aClass339_85, aClass339_73, aClass339_47, aClass339_46, aClass339_152, aClass339_159, aClass339_83, aClass339_157, aClass339_146, aClass339_64, aClass339_115, aClass339_102, aClass339_57, aClass339_104, aClass339_158, aClass339_163, aClass339_74, aClass339_32, aClass339_108, aClass339_48, aClass339_36, aClass339_49, aClass339_55, aClass339_138, aClass339_66, aClass339_93, aClass339_144, aClass339_18, aClass339_135, aClass339_107, aClass339_87, aClass339_13, aClass339_128, aClass339_19, aClass339_151, aClass339_131, aClass339_30, aClass339_114, aClass339_120, aClass339_137 };
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!nd;Ljava/lang/Object;C)V", line = 190)
	Class339(@OriginalArg(0) Class342 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) char arg2) {
		this(-1, arg2, arg0, arg1, new Class350[0]);
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(ICLclient!nd;Ljava/lang/Object;[Lclient!nn;)V", line = 193)
	Class339(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) Class342 arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) Class350[] arg4) {
		this.anInt4601 = arg0 * 1335083219;
		this.aChar12 = arg1;
		this.aClass342_1 = arg2;
		this.anObject18 = arg3;
		@Pc(17) Class350[] local17 = arg4;
		@Pc(19) int local19 = 0;
		while (local19 < local17.length) {
			@Pc(27) Class350 local27 = local17[local19];
			switch(local27.anInt4631 * 1764441599) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				default:
					local19++;
			}
		}
		method26431(this);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Lclient!na;)V", line = 236)
	static void method26421(@OriginalArg(0) Class339 arg0) {
		if (aClass339Array1 == null) {
			aClass339Array1 = new Class339[256];
		}
		aClass339Array1[Class525.method32378(arg0.aChar12) & 0xFF] = arg0;
	}

	@OriginalMember(owner = "client!na", name = "y", descriptor = "(Lclient!na;)V", line = 236)
	static void method26426(@OriginalArg(0) Class339 arg0) {
		if (aClass339Array1 == null) {
			aClass339Array1 = new Class339[256];
		}
		aClass339Array1[Class525.method32378(arg0.aChar12) & 0xFF] = arg0;
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(Lclient!na;B)V", line = 236)
	static void method26431(@OriginalArg(0) Class339 arg0) {
		if (aClass339Array1 == null) {
			aClass339Array1 = new Class339[256];
		}
		aClass339Array1[Class525.method32378(arg0.aChar12) & 0xFF] = arg0;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Lclient!na;)V", line = 236)
	static void method26432(@OriginalArg(0) Class339 arg0) {
		if (aClass339Array1 == null) {
			aClass339Array1 = new Class339[256];
		}
		aClass339Array1[Class525.method32378(arg0.aChar12) & 0xFF] = arg0;
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "()Lclient!nd;", line = 241)
	public Class342 method26427() {
		return this.aClass342_1;
	}

	@OriginalMember(owner = "client!na", name = "s", descriptor = "(B)Lclient!nd;", line = 241)
	public Class342 method26428() {
		return this.aClass342_1;
	}

	@OriginalMember(owner = "client!na", name = "z", descriptor = "()Lclient!nd;", line = 241)
	public Class342 method26429() {
		return this.aClass342_1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)I", line = 245)
	@Override
	public int method33765() {
		return this.anInt4601 * 713725787;
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "()I", line = 245)
	@Override
	public int method33767() {
		return this.anInt4601 * 713725787;
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "()I", line = 245)
	@Override
	public int method33766() {
		return this.anInt4601 * 713725787;
	}

	@OriginalMember(owner = "client!na", name = "x", descriptor = "()I", line = 245)
	@Override
	public int method33764() {
		return this.anInt4601 * 713725787;
	}

	@OriginalMember(owner = "client!na", name = "n", descriptor = "()Ljava/lang/Object;", line = 249)
	public Object method26422() {
		return this.anObject18;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()Ljava/lang/Object;", line = 249)
	public Object method26423() {
		return this.anObject18;
	}

	@OriginalMember(owner = "client!na", name = "u", descriptor = "(I)Ljava/lang/Object;", line = 249)
	public Object method26425() {
		return this.anObject18;
	}

	@OriginalMember(owner = "client!na", name = "r", descriptor = "(Ljava/lang/String;ZZI)V", line = 340)
	public static void method26424(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class215.method24289("commands - This command");
				Class215.method24289("cls - Clear console");
				Class215.method24289("displayfps - Toggle FPS and other information");
				Class215.method24289("renderer - Print graphics renderer information");
				Class215.method24289("heap - Print java memory information");
				Class215.method24289("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Class67.anInt1840 = 0;
				Class67.anInt1835 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean574 = !client.aBoolean574;
				if (client.aBoolean574) {
					Class215.method24289("FPS on");
				} else {
					Class215.method24289("FPS off");
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class117 local62 = Class613.aClass21_13.method17016();
				Class215.method24289("Toolkit ID: " + Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373());
				Class215.method24289("Vendor: " + local62.anInt3201 * -1635434713);
				Class215.method24289("Name: " + local62.aString158);
				Class215.method24289("Version: " + local62.anInt3202 * -1645999417);
				Class215.method24289("Device: " + local62.aString157);
				Class215.method24289("Driver Version: " + local62.aLong237 * 3118557101980400735L);
				local139 = Class613.aClass21_13.method17035();
				if (local139.length() > 0) {
					Class215.method24289(local139);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class215.method24289("Heap: " + Class390.anInt3031 * -435910341 + "MB");
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class464 local173 = client.aClass370_1.method26942();
				if (Class72.anInt2086 * 81180077 == 3) {
					@Pc(182) Class320 local182 = Class80.aClass23_Sub1_1.method5908();
					@Pc(186) Class320 local186 = Class80.aClass23_Sub1_1.method5834();
					Class215.method24289("Pos: " + (new Class464(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, (int) local182.aFloat259 >> 9, (int) local182.aFloat261 >> 9)).toString() + " Height: " + (Class186.method23926((int) local182.aFloat259 - (local173.anInt5071 * -1567811631 << 9), (int) local182.aFloat261 - (local173.anInt5073 * 1360175441 << 9), Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) + (int) local182.aFloat260));
					Class215.method24289("Look: " + (new Class464(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, (int) local186.aFloat259 >> 9, (int) local186.aFloat261 >> 9)).toString() + " Height: " + (Class186.method23926((int) local186.aFloat259 - (local173.anInt5071 * -1567811631 << 9), (int) local182.aFloat261 - (local173.anInt5073 * 1360175441 << 9), Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) + (int) local182.aFloat260));
				} else {
					Class215.method24289("Pos: " + Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 + "," + (local173.anInt5071 * -1567811631 + (Class586.anInt5460 * -1129330577 >> 9) >> 6) + "," + (local173.anInt5073 * 1360175441 + (Class149.anInt3434 * -324079631 >> 9) >> 6) + "," + (local173.anInt5071 * -1567811631 + (Class586.anInt5460 * -1129330577 >> 9) & 0x3F) + "," + (local173.anInt5073 * 1360175441 + (Class149.anInt3434 * -324079631 >> 9) & 0x3F) + " Height: " + (Class186.method23926(Class586.anInt5460 * -1129330577, Class149.anInt3434 * -324079631, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) - Class140.anInt3424 * 1701665129));
					Class215.method24289("Look: " + Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 + "," + (Class346.anInt4621 * -745863761 + local173.anInt5071 * -1567811631 >> 6) + "," + (local173.anInt5073 * 1360175441 + Class309.anInt4525 * 291210915 >> 6) + "," + (local173.anInt5071 * -1567811631 + Class346.anInt4621 * -745863761 & 0x3F) + "," + (Class309.anInt4525 * 291210915 + local173.anInt5073 * 1360175441 & 0x3F) + " Height: " + (Class186.method23926(Class346.anInt4621 * -745863761, Class309.anInt4525 * 291210915, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) - Class316.anInt4548 * -616425307));
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class215.method24289(Class601.aClass601_4.method33512(Class469.aClass530_2));
			return;
		}
		if (Class1.aClass527_1 != Class527.aClass527_10 || client.anInt3116 * -1336253523 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class157.method23193(1, -1, -1, false);
					if (Class492.method29292() == 1) {
						Class215.method24289("Success");
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class157.method23193(2, -1, -1, false);
					if (Class492.method29292() == 2) {
						Class215.method24289("Success");
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (Class552.aBoolean823 && arg0.equalsIgnoreCase("wm3")) {
					Class157.method23193(3, 1024, 768, false);
					if (Class492.method29292() == 3) {
						Class215.method24289("Success");
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				@Pc(574) String local574;
				@Pc(578) int local578;
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.anInt3039 * 1115111877 != 2) {
						Class215.method24289("Failure");
						return;
					}
					local568 = -1;
					local574 = arg0.substring(9);
					local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class215.method24289("Failure");
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class215.method24289("Failure");
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class396.method27510(local139, local568);
					Class215.method24289("Success");
					return;
				}
				if (arg0.startsWith("setmediastream ")) {
					if (client.anInt3039 * 1115111877 != 2) {
						Class215.method24289("Failure");
						return;
					}
					local568 = -1;
					local574 = arg0.substring(15);
					local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class215.method24289("Failure");
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(662) NumberFormatException local662) {
					}
					if (local568 == -1) {
						Class215.method24289("Failure");
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class515.method29647(local139, local568);
					Class571.aClass348_3.method26552(Class570.aClass585_6.aString242, Class570.aClass585_6.method33271());
					Class626.aClass334_1.method26277();
					Class215.method24289("Success");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class546.method32647(0, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 0) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class546.method32647(1, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 1) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 1);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class546.method32647(3, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 3) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 3);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class546.method32647(5, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 5) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 5);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.anInt3039 * 1115111877 == 5) {
						Class486.method29181();
					} else if (client.anInt3039 * 1115111877 == 7) {
						client.aClass82_2.aBoolean531 = true;
					}
					return;
				}
				@Pc(858) int local858;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(856) Class82[] local856 = client.aClass82Array1;
					for (local858 = 0; local858 < local856.length; local858++) {
						@Pc(866) Class82 local866 = local856[local858];
						if (local866.method21621() != null) {
							local866.method21621().method12857();
						}
					}
					Class117.aClass51_2.method9837();
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class215.method24289("varpbit=" + Class424.aClass165_1.method32384(Class424.aClass165_1.method24296(local568)));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class215.method24289("varp=" + Class424.aClass165_1.method32385(Class424.aClass165_1.method24295(Class43.aClass43_68, local568)));
					return;
				}
				@Pc(945) String[] local945;
				if (arg0.startsWith("directlogin")) {
					local945 = Class230.method24546(arg0.substring(12), ' ');
					if (local945.length == 2) {
						Class3_Sub29.method11606(local945[0], local945[1]);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local945 = Class230.method24546(arg0.substring(8), ' ');
					local858 = Integer.parseInt(local945[0]);
					Class163.method23296(local858);
					return;
				}
				@Pc(989) File local989;
				if (arg0.startsWith("setoutput ")) {
					local989 = new File(arg0.substring(10));
					if (local989.exists()) {
						local989 = new File(arg0.substring(10) + "." + Class176.method23413() + ".log");
						if (local989.exists()) {
							Class215.method24289("file already exists!");
							return;
						}
					}
					if (Class67.aFileOutputStream1 != null) {
						Class67.aFileOutputStream1.close();
						Class67.aFileOutputStream1 = null;
					}
					try {
						Class67.aFileOutputStream1 = new FileOutputStream(local989);
						return;
					} catch (@Pc(1032) FileNotFoundException local1032) {
						Class215.method24289("Could not create " + local989.getName());
						return;
					} catch (@Pc(1045) SecurityException local1045) {
						Class215.method24289("Cannot write to " + local989.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Class67.aFileOutputStream1 != null) {
						Class67.aFileOutputStream1.close();
					}
					Class67.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local989 = new File(arg0.substring(10));
					if (!local989.exists()) {
						Class215.method24289("No such file");
						return;
					}
					@Pc(1091) byte[] local1091 = Class106.method21919(local989);
					if (local1091 == null) {
						Class215.method24289("Failed to read file");
						return;
					}
					@Pc(1108) String[] local1108 = Class230.method24546(Class230.method24545(Class11.method1212(local1091), '\r', ""), '\n');
					Class633.method33877(local1108);
				}
				if (client.anInt3039 * 1115111877 == 5 || client.anInt3039 * 1115111877 == 18) {
					@Pc(1124) Class82 local1124 = Class406.method27657();
					@Pc(1130) Class3_Sub23 local1130 = Class269.method25284(Class311.aClass311_108, local1124.aClass577_2);
					local1130.aClass3_Sub41_Sub1_1.method20250(arg0.length() + 3);
					local1130.aClass3_Sub41_Sub1_1.method20250(arg1 ? 1 : 0);
					local1130.aClass3_Sub41_Sub1_1.method20250(arg2 ? 1 : 0);
					local1130.aClass3_Sub41_Sub1_1.method20260(arg0);
					local1124.method21601(local1130);
				}
			} catch (@Pc(1167) Exception local1167) {
				Class215.method24289(Class601.aClass601_4.method33512(Class469.aClass530_2));
				return;
			}
		}
		if (client.anInt3039 * 1115111877 != 5 && client.anInt3039 * 1115111877 != 18) {
			Class215.method24289(Class601.aClass601_9.method33512(Class469.aClass530_2) + arg0);
		}
	}

	@OriginalMember(owner = "client!na", name = "aj", descriptor = "(III)V", line = 949)
	static void method26434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class250.anInt3814 = arg0 * 511793191;
		Class250.anInt3815 = arg1 * 1602469557;
	}

	@OriginalMember(owner = "client!na", name = "im", descriptor = "(Lclient!vs;I)V", line = 5554)
	static final void method26437(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class479.method28925(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!na", name = "nn", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6616)
	static final void method26438(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray5 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!na", name = "pi", descriptor = "(Lclient!vs;I)V", line = 6830)
	static final void method26435(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3497 * -1988957173;
	}

	@OriginalMember(owner = "client!na", name = "aaa", descriptor = "(Lclient!vs;B)V", line = 8792)
	static final void method26436(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) (Math.random() * (double) (local12 + 1));
	}
}
