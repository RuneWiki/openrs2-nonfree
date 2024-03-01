package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public class Class496 implements Interface15 {

	@OriginalMember(owner = "client!u", name = "x", descriptor = "[Lclient!er;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 10)
	Class496() {
	}

	@OriginalMember(owner = "client!u", name = "p", descriptor = "(Lclient!hi;IB)Lclient!hk;", line = 13)
	@Override
	public Interface17 method29331(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1) {
		if (Class223.aClass223_1 == arg0) {
			return client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (Class223.aClass223_2 == arg0) {
			@Pc(15) Class3_Sub29 local15 = (Class3_Sub29) client.aClass581_21.method33217((long) arg1);
			if (local15 != null) {
				return (Interface17) local15.anObject2;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!hi;I)Lclient!hk;", line = 13)
	@Override
	public Interface17 method29330(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1) {
		if (Class223.aClass223_1 == arg0) {
			return client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (Class223.aClass223_2 == arg0) {
			@Pc(15) Class3_Sub29 local15 = (Class3_Sub29) client.aClass581_21.method33217((long) arg1);
			if (local15 != null) {
				return (Interface17) local15.anObject2;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(Lclient!hi;I)Lclient!hk;", line = 13)
	@Override
	public Interface17 method29329(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1) {
		if (Class223.aClass223_1 == arg0) {
			return client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (Class223.aClass223_2 == arg0) {
			@Pc(15) Class3_Sub29 local15 = (Class3_Sub29) client.aClass581_21.method33217((long) arg1);
			if (local15 != null) {
				return (Interface17) local15.anObject2;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "l", descriptor = "(Lclient!hi;I)Lclient!hk;", line = 13)
	@Override
	public Interface17 method29332(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1) {
		if (Class223.aClass223_1 == arg0) {
			return client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (Class223.aClass223_2 == arg0) {
			@Pc(15) Class3_Sub29 local15 = (Class3_Sub29) client.aClass581_21.method33217((long) arg1);
			if (local15 != null) {
				return (Interface17) local15.anObject2;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "z", descriptor = "(Lclient!ahu;Lclient!ahu;IZIZB)I", line = 145)
	static int method29336(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Class63_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(6) int local6 = Class30.method16450(arg0, arg1, arg2, arg3);
		if (local6 != 0) {
			return arg3 ? -local6 : local6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = Class30.method16450(arg0, arg1, arg4, arg5);
			return arg5 ? -local28 : local28;
		}
	}

	@OriginalMember(owner = "client!u", name = "m", descriptor = "(Lclient!pc;Lclient!vs;I)V", line = 510)
	static final void method29333(@OriginalArg(0) Class385 arg0, @OriginalArg(1) Class536 arg1) throws Exception_Sub4, Exception_Sub5 {
		switch(arg0.anInt4719 * -143903049) {
			case 0:
				Class214.method24279(arg1);
				return;
			case 1:
				Class367.method26915(arg1);
				return;
			case 2:
				Class44_Sub1.method8403(arg1);
				return;
			case 3:
				Class285.method25473(arg1);
				return;
			case 4:
				Class157.method23192(arg1);
				return;
			case 5:
				Class286.method25481(arg1);
				return;
			case 6:
				Class484.method29112(arg1);
				return;
			case 7:
				Class422.method27871(arg1);
				return;
			case 8:
				Class502.method29461(arg1);
				return;
			case 9:
				Class56.method12592(arg1);
				return;
			case 10:
				Class208.method24233(arg1);
				return;
			case 11:
				Class505.method29520(arg1);
				return;
			case 12:
				Class238.method24616(arg1);
				return;
			case 13:
				Class283.method25456(arg1);
				return;
			case 14:
				Class61.method12767(arg1);
				return;
			case 15:
				Class21_Sub1.method3217(arg1);
				return;
			case 16:
				Class529.method32461(arg1);
				return;
			case 17:
				Class79.method21590(arg1);
				return;
			case 18:
				Class414.method27749(arg1);
				return;
			case 19:
				Class277.method25401(arg1);
				return;
			case 20:
				Class380.method27284(arg1);
				return;
			case 21:
				Class60_Sub23.method13754(arg1);
				return;
			case 22:
				Class483.method29106(arg1);
				return;
			case 23:
				Class196.method24109(arg1);
				return;
			case 24:
				Class1.method12(arg1);
				return;
			case 25:
				Class467.method28737(arg1);
				return;
			case 26:
				Class513.method29599(arg1);
				return;
			case 27:
				Class484.method29110(arg1);
				return;
			case 28:
				Class390.method22353(arg1);
				return;
			case 29:
				Class237.method24612(arg1);
				return;
			case 30:
				Class452.method28421(arg1);
				return;
			case 31:
				Class467.method28735(arg1);
				return;
			case 32:
				Class565.method32914(arg1);
				return;
			case 33:
				Class349.method26575(arg1);
				return;
			case 34:
				Class191.method24058(arg1);
				return;
			case 35:
				Class461.method28594(arg1);
				return;
			case 36:
				Class221.method24420(arg1);
				return;
			case 37:
				Class483.method29105(arg1);
				return;
			case 38:
				Class276.method25387(arg1);
				return;
			case 39:
				Class288.method25512(arg1);
				return;
			case 40:
				Class196.method24115(arg1);
				return;
			case 41:
				Class23.method5941(arg1);
				return;
			case 42:
				Class270.method25289(arg1);
				return;
			case 43:
				Class175.method23411(arg1);
				return;
			case 44:
				Class366.method26905(arg1);
				return;
			case 45:
				Class26_Sub1.method21529(arg1);
				return;
			case 46:
				Class293.method25559(arg1);
				return;
			case 47:
				Class425.method27896(arg1);
				return;
			case 48:
				Class398.method27551(arg1);
				return;
			case 49:
				Class154.method23165(arg1);
				return;
			case 50:
				Class374.method27226(arg1);
				return;
			case 51:
				Class213.method24261(arg1);
				return;
			case 52:
				Class349.method26577(arg1);
				return;
			case 53:
				Class575.method33148(arg1);
				return;
			case 54:
				Class304.method25700(arg1);
				return;
			case 55:
				Class564.method32901(arg1);
				return;
			case 56:
				Class470.method28765(arg1);
				return;
			case 57:
				Class205.method24190(arg1);
				return;
			case 58:
				Class366.method26904(arg1);
				return;
			case 59:
				Class402.method27622(arg1);
				return;
			case 60:
				Class5_Sub3.method750(arg1);
				return;
			case 61:
				Class344.method26488(arg1);
				return;
			case 62:
				Class432.method27966(arg1);
				return;
			case 63:
				Class280.method25425(arg1);
				return;
			case 64:
				Class3_Sub43.method12940(arg1);
				return;
			case 65:
				Class608.method33567(arg1);
				return;
			case 66:
				Class70.method33884(arg1);
				return;
			case 67:
				Class214.method24280(arg1);
				return;
			case 68:
				Class232.method24584(arg1);
				return;
			case 69:
				Class160.method23212(arg1);
				return;
			case 70:
				Class208.method24231(arg1);
				return;
			case 71:
				Class590.method33303(arg1);
				return;
			case 72:
				Class341.method26462(arg1);
				return;
			case 73:
				Class292.method25553(arg1);
				return;
			case 74:
				Class455.method28467(arg1);
				return;
			case 75:
				Class343.method26481(arg1);
				return;
			case 76:
				Class309.method25757(arg1);
				return;
			case 77:
				Class556.method32808(arg1);
				return;
			case 78:
				Class403.method27633(arg1);
				return;
			case 79:
				Class271.method25312(arg1);
				return;
			case 80:
				Class463.method28612(arg1);
				return;
			case 81:
				Class250.method25084(arg1);
				return;
			case 82:
				Class278.method25408(arg1);
				return;
			case 83:
				Class370.method27080(arg1);
				return;
			case 84:
				Class371.method27201(arg1);
				return;
			case 85:
				Class135.method22925(arg1);
				return;
			case 86:
				Class48.method9535(arg1);
				return;
			case 87:
				Class209.method24240(arg1);
				return;
			case 88:
				Class313.method25822(arg1);
				return;
			case 89:
				Class308.method25754(arg1);
				return;
			case 90:
				Class402.method27620(arg1);
				return;
			case 91:
				Class311.method25779(arg1);
				return;
			case 92:
				Class183.method23693(arg1);
				return;
			case 93:
				Class163.method23293(arg1);
				return;
			case 94:
				Class158.method23199(arg1);
				return;
			case 95:
				Class24.method6667(arg1);
				return;
			case 96:
				Class522.method29818(arg1);
				return;
			case 97:
				Class286.method25483(arg1);
				return;
			case 98:
				Class65.method13150(arg1);
				return;
			case 99:
				Class3_Sub30.method11637(arg1);
				return;
			case 100:
				Class391.method27419(arg1);
				return;
			case 101:
				Class568.method32978(arg1);
				return;
			case 102:
				Class503.method29507(arg1);
				return;
			case 103:
				Class385.method27333(arg1);
				return;
			case 104:
				Class231.method24578(arg1);
				return;
			case 105:
				Class504.method29511(arg1);
				return;
			case 106:
				Class64.method13093(arg1);
				return;
			case 107:
				Class174.method23397(arg1);
				return;
			case 108:
				Class415.method27767(arg1);
				return;
			case 109:
				Class485.method29179(arg1);
				return;
			case 110:
				Class477.method28824(arg1);
				return;
			case 111:
				Class118.method22821(arg1);
				return;
			case 112:
				Class272.method25325(arg1);
				return;
			case 113:
				Class3_Sub1_Sub19.method33682(arg1);
				return;
			case 114:
				Class216.method24302(arg1);
				return;
			case 115:
				Class358.method26659(arg1);
				return;
			case 116:
				Class194.method24079(arg1);
				return;
			case 117:
				Class453.method28435(arg1);
				return;
			case 118:
				Class382.method27320(arg1);
				return;
			case 119:
				Class511.method29586(arg1);
				return;
			case 120:
				Class590.method33304(arg1);
				return;
			case 121:
				Class183.method23692(arg1);
				return;
			case 122:
				Class14_Sub1.method1413(arg1);
				return;
			case 123:
				Class148.method23121(arg1);
				return;
			case 124:
				Class173.method23388(arg1);
				return;
			case 125:
				Class544.method32607(arg1);
				return;
			case 126:
				Class169.method23355(arg1);
				return;
			case 127:
				Class135.method22921(arg1);
				return;
			case 128:
				Class359.method26758(arg1);
				return;
			case 129:
				Class435.method27997(arg1);
				return;
			case 130:
				Class106.method21917(arg1);
				return;
			case 131:
				Class205.method24187(arg1);
				return;
			case 132:
				Class26_Sub1_Sub1_Sub1.method16727(arg1);
				return;
			case 133:
				Class222.method24433(arg1);
				return;
			case 134:
				Class467.method28734(arg1);
				return;
			case 135:
				Class458.method28529(arg1);
				return;
			case 136:
				Class500.method29438(arg1);
				return;
			case 137:
				Class516.method29666(arg1);
				return;
			case 138:
				Class62.method12868(arg1);
				return;
			case 139:
				Class272.method25323(arg1);
				return;
			case 140:
				Class487.method29190(arg1);
				return;
			case 141:
				Class80.method21593(arg1);
				return;
			case 142:
				Class309.method25759(arg1);
				return;
			case 143:
				Class434.method27988(arg1);
				return;
			case 144:
				Class205.method24184(arg1);
				return;
			case 145:
				Class30_Sub2.method16473(arg1);
				return;
			case 146:
				Class156.method23179(arg1);
				return;
			case 147:
				Class237.method24614(arg1);
				return;
			case 148:
				Class395.method27502(arg1);
				return;
			case 149:
				Class485.method29176(arg1);
				return;
			case 150:
				Class293.method25562(arg1);
				return;
			case 151:
				Class383.method27329(arg1);
				return;
			case 152:
				Class475.method28787(arg1);
				return;
			case 153:
				Class149.method23127(arg1);
				return;
			case 154:
				Class142.method23050(arg1);
				return;
			case 155:
				Class5.method747(arg1);
				return;
			case 156:
				Class448.method28362(arg1);
				return;
			case 157:
				Class445.method28335(arg1);
				return;
			case 158:
				Class213.method24265(arg1);
				return;
			case 159:
				Class295.method25568(arg1);
				return;
			case 160:
				Class196.method24116(arg1);
				return;
			case 161:
				Class2.method58(arg1);
				return;
			case 162:
				Class3_Sub35_Sub1.method18872(arg1);
				return;
			case 163:
				Class24.method6668(arg1);
				return;
			case 164:
				Class394.method27444(arg1);
				return;
			case 165:
				Class142.method23048(arg1);
				return;
			case 166:
				Class56.method12590(arg1);
				return;
			case 167:
				Class14_Sub5.method3349(arg1);
				return;
			case 168:
				Class250.method25082(arg1);
				return;
			case 169:
				Class13_Sub17.method6700(arg1);
				return;
			case 170:
				Class61.method12766(arg1);
				return;
			case 171:
				Class436.method28021(arg1);
				return;
			case 172:
				Class128.method22883(arg1);
				return;
			case 173:
				Class358.method26663(arg1);
				return;
			case 174:
				Class461.method28598(arg1);
				return;
			case 175:
				Class452.method28422(arg1);
				return;
			case 176:
				Class475.method28792(arg1);
				return;
			case 177:
				Class371.method27199(arg1);
				return;
			case 178:
				Class350.method26582(arg1);
				return;
			case 179:
				Class295.method25569(arg1);
				return;
			case 180:
				Class564.method32902(arg1);
				return;
			case 181:
				Class434.method27989(arg1);
				return;
			case 182:
				Class144.method23065(arg1);
				return;
			case 183:
				Class210.method24244(arg1);
				return;
			case 184:
				Class80.method21594(arg1);
				return;
			case 185:
				Class301.method25661(arg1);
				return;
			case 186:
				Class61.method12765(arg1);
				return;
			case 187:
				Class368.method26924(arg1);
				return;
			case 188:
				Class14_Sub1.method1410(arg1);
				return;
			case 189:
				Class483.method29102(arg1);
				return;
			case 190:
				Class163.method23295(arg1);
				return;
			case 191:
				Class495.method29327(arg1);
				return;
			case 192:
				Class56_Sub1.method11927(arg1);
				return;
			case 193:
				Class1.method11(arg1);
				return;
			case 194:
				Class338.method26413(arg1);
				return;
			case 195:
				Class344.method26493(arg1);
				return;
			case 196:
				Class526.method32414(arg1);
				return;
			case 197:
				Class200.method24150(arg1);
				return;
			case 198:
				Class52.method9919(arg1);
				return;
			case 199:
				Class270.method25291(arg1);
				return;
			case 200:
				Class144.method23070(arg1);
				return;
			case 201:
				Class107.method21923(arg1);
				return;
			case 202:
				Class82.method21624(arg1);
				return;
			case 203:
				Class98.method21816(arg1);
				return;
			case 204:
				Class353.method26605(arg1);
				return;
			case 205:
				Class516.method29668(arg1);
				return;
			case 206:
				Class461.method28590(arg1);
				return;
			case 207:
				Class61.method12763(arg1);
				return;
			case 208:
				Class160.method23211(arg1);
				return;
			case 209:
				Class477.method28826(arg1);
				return;
			case 210:
				Class61_Sub1.method12788(arg1);
				return;
			case 211:
				Class169.method23354(arg1);
				return;
			case 212:
				Class34.method16495(arg1);
				return;
			case 213:
				Class43.method9504(arg1);
				return;
			case 214:
				Class486.method29180(arg1);
				return;
			case 215:
				Class228.method24518(arg1);
				return;
			case 216:
				Class315.method25833(arg1);
				return;
			case 217:
				Class334.method26290(arg1);
				return;
			case 218:
				Class179.method23533(arg1);
				return;
			case 219:
				Class3_Sub24_Sub7.method18245(arg1);
				return;
			case 220:
				Class437.method28030(arg1);
				return;
			case 221:
				Class207.method24221(arg1);
				return;
			case 222:
				Class350.method26581(arg1);
				return;
			case 223:
				Class206.method24212(arg1);
				return;
			case 224:
				Class543.method32598(arg1);
				return;
			case 225:
				Class180.method23538(arg1);
				return;
			case 226:
				Class575.method33151(arg1);
				return;
			case 227:
				Class465.method28641(arg1);
				return;
			case 228:
				Class70_Sub1_Sub2.method14740(arg1);
				return;
			case 229:
				Class468.method28749(arg1);
				return;
			case 230:
				Class283.method25452(arg1);
				return;
			case 231:
				Class197.method24122(arg1);
				return;
			case 232:
				Class13_Sub5.method5648(arg1);
				return;
			case 233:
				Class568.method32979(arg1);
				return;
			case 234:
				Class3_Sub43.method12942(arg1);
				return;
			case 235:
				Class181.method23548(arg1);
				return;
			case 236:
				method29334(arg1);
				return;
			case 237:
				Class413.method27726(arg1);
				return;
			case 238:
				Class499.method29373(arg1);
				return;
			case 239:
				Class128.method22882(arg1);
				return;
			case 240:
				Class280.method25427(arg1);
				return;
			case 241:
				Class458.method28525(arg1);
				return;
			case 242:
				Class55.method11858(arg1);
				return;
			case 243:
				Class511.method29582(arg1);
				return;
			case 244:
				Class500.method29441(arg1);
				return;
			case 245:
				Class170.method23360(arg1);
				return;
			case 246:
				Class5_Sub3.method753(arg1);
				return;
			case 247:
				Class226.method24478(arg1);
				return;
			case 248:
				Class300.method25655(arg1);
				return;
			case 249:
				Class11_Sub2.method1216(arg1);
				return;
			case 250:
				Class462.method28602(arg1);
				return;
			case 251:
				Class368.method26926(arg1);
				return;
			case 252:
				Class356.method26655(arg1);
				return;
			case 253:
				Class284.method25463(arg1);
				return;
			case 254:
				Class419.method27840(arg1);
				return;
			case 255:
				Class294.method25566(arg1);
				return;
			case 256:
				Class367.method26914(arg1);
				return;
			case 257:
				Class507.method29554(arg1);
				return;
			case 258:
				Class422.method27875(arg1);
				return;
			case 259:
				Class296.method25573(arg1);
				return;
			case 260:
				Class479.method28926(arg1);
				return;
			case 261:
				Class574.method33110(arg1);
				return;
			case 262:
				Class154.method23162(arg1);
				return;
			case 263:
				Class75.method19524(arg1);
				return;
			case 264:
				Class203.method24165(arg1);
				return;
			case 265:
				Class60_Sub21.method13694(arg1);
				return;
			case 266:
			case 508:
			case 617:
			case 750:
			case 913:
			default:
				throw new RuntimeException();
			case 267:
				Class448.method28363(arg1);
				return;
			case 268:
				Class309.method25760(arg1);
				return;
			case 269:
				Class312.method25815(arg1);
				return;
			case 270:
				Class147.method23100(arg1);
				return;
			case 271:
				Class10.method721(arg1);
				return;
			case 272:
				Class230.method24548(arg1);
				return;
			case 273:
				Class479.method28927(arg1);
				return;
			case 274:
				Class391.method27421(arg1);
				return;
			case 275:
				Class62.method12866(arg1);
				return;
			case 276:
				Class517.method29674(arg1);
				return;
			case 277:
				Class1.method9(arg1);
				return;
			case 278:
				Class587.method33287(arg1);
				return;
			case 279:
				Class196.method24110(arg1);
				return;
			case 280:
				Class165.method23337(arg1);
				return;
			case 281:
				Class148.method23114(arg1);
				return;
			case 282:
				Class287.method25499(arg1);
				return;
			case 283:
				Class509.method29572(arg1);
				return;
			case 284:
				Class507.method29553(arg1);
				return;
			case 285:
				Class414.method27748(arg1);
				return;
			case 286:
				Class405.method27653(arg1);
				return;
			case 287:
				Class222.method24432(arg1);
				return;
			case 288:
				Class420.method27844(arg1);
				return;
			case 289:
				Class122.method22837(arg1);
				return;
			case 290:
				Class264.method25233(arg1);
				return;
			case 291:
				Class324.method25996(arg1);
				return;
			case 292:
				Class30.method16451(arg1);
				return;
			case 293:
				Class44.method15136(arg1);
				return;
			case 294:
				Class13_Sub7.method6225(arg1);
				return;
			case 295:
				Class420.method27846(arg1);
				return;
			case 296:
				Class216.method24300(arg1);
				return;
			case 297:
				Class356.method26647(arg1);
				return;
			case 298:
				Class226.method24480(arg1);
				return;
			case 299:
				Class21.method17425(arg1);
				return;
			case 300:
				Class223.method24441(arg1);
				return;
			case 301:
				Class429.method27934(arg1);
				return;
			case 302:
				Class43.method9507(arg1);
				return;
			case 303:
				Class312.method25814(arg1);
				return;
			case 304:
				Class405.method27652(arg1);
				return;
			case 305:
				Class196.method24113(arg1);
				return;
			case 306:
				Class343.method26484(arg1);
				return;
			case 307:
				Class77.method21569(arg1);
				return;
			case 308:
				Class75.method19525(arg1);
				return;
			case 309:
				Class440.method28237(arg1);
				return;
			case 310:
				Class400.method27576(arg1);
				return;
			case 311:
				Class53.method20620(arg1);
				return;
			case 312:
				Class602.method33523(arg1);
				return;
			case 313:
				Class82.method21622(arg1);
				return;
			case 314:
				Class206.method24213(arg1);
				return;
			case 315:
				Class441.method28246(arg1);
				return;
			case 316:
				Class468.method28746(arg1);
				return;
			case 317:
				Class274.method25353(arg1);
				return;
			case 318:
				Class98.method21812(arg1);
				return;
			case 319:
				Class520.method29764(arg1);
				return;
			case 320:
				Class368.method26922(arg1);
				return;
			case 321:
				Class276.method25390(arg1);
				return;
			case 322:
				Class53_Sub5.method10323(arg1);
				return;
			case 323:
				Class516.method29667(arg1);
				return;
			case 324:
				Class30_Sub3.method7854(arg1);
				return;
			case 325:
				Class370.method27077(arg1);
				return;
			case 326:
				Class31_Sub1.method7480(arg1);
				return;
			case 327:
				Class302.method25667(arg1);
				return;
			case 328:
				Class525.method32381(arg1);
				return;
			case 329:
				Class274.method25352(arg1);
				return;
			case 330:
				Class411.method27696(arg1);
				return;
			case 331:
				Class194.method24080(arg1);
				return;
			case 332:
				Class180.method23537(arg1);
				return;
			case 333:
				Class203.method24164(arg1);
				return;
			case 334:
				Class17.method3593(arg1);
				return;
			case 335:
				Class75.method19523(arg1);
				return;
			case 336:
				Class408.method27668(arg1);
				return;
			case 337:
				Class84.method21630(arg1);
				return;
			case 338:
				Class60_Sub15.method13524(arg1);
				return;
			case 339:
				Class378.method27244(arg1);
				return;
			case 340:
				Class606.method33541(arg1);
				return;
			case 341:
				Class69_Sub1.method20234(arg1);
				return;
			case 342:
				Class570.method33033(arg1);
				return;
			case 343:
				Class208.method24232(arg1);
				return;
			case 344:
				Class213.method24262(arg1);
				return;
			case 345:
				Class153.method23156(arg1);
				return;
			case 346:
				Class278.method25409(arg1);
				return;
			case 347:
				Class360.method26764(arg1);
				return;
			case 348:
				Class355.method26637(arg1);
				return;
			case 349:
				Class362.method26777(arg1);
				return;
			case 350:
				Class158.method23197(arg1);
				return;
			case 351:
				Class110.method22007(arg1);
				return;
			case 352:
				Class339.method26436(arg1);
				return;
			case 353:
				Class468.method28747(arg1);
				return;
			case 354:
				Class358.method26658(arg1);
				return;
			case 355:
				Class214.method24281(arg1);
				return;
			case 356:
				Class276.method25386(arg1);
				return;
			case 357:
				Class459.method28534(arg1);
				return;
			case 358:
				Class174.method23396(arg1);
				return;
			case 359:
				Class380.method27283(true, arg1);
				return;
			case 360:
				Class181.method23549(arg1);
				return;
			case 361:
				Class505.method29522(arg1);
				return;
			case 362:
				Class495.method29325(arg1);
				return;
			case 363:
				Class459.method28533(arg1);
				return;
			case 364:
				Class224.method24456(arg1);
				return;
			case 365:
				Class368.method26923(arg1);
				return;
			case 366:
				Class359.method26761(arg1);
				return;
			case 367:
				Class475.method28789(arg1);
				return;
			case 368:
				Class456.method28487(arg1);
				return;
			case 369:
				Class508.method29565(arg1);
				return;
			case 370:
				Class70.method33879(arg1);
				return;
			case 371:
				Class163.method23294(arg1);
				return;
			case 372:
				Class49.method9254(arg1);
				return;
			case 373:
				Class271.method25311(arg1);
				return;
			case 374:
				Class568.method32974(arg1);
				return;
			case 375:
				Class470.method28763(arg1);
				return;
			case 376:
				Class69_Sub2.method14574(arg1);
				return;
			case 377:
				Class410.method27674(arg1);
				return;
			case 378:
				Class415.method27768(arg1);
				return;
			case 379:
				Class49_Sub1.method9258(arg1);
				return;
			case 380:
				Class487.method29192(arg1);
				return;
			case 381:
				Class523.method29832(arg1);
				return;
			case 382:
				Class499.method29375(arg1);
				return;
			case 383:
				Class501.method29453(arg1);
				return;
			case 384:
				Class23.method5939(arg1);
				return;
			case 385:
				Class110.method22009(arg1);
				return;
			case 386:
				Class631.method33859(arg1);
				return;
			case 387:
				Class384.method27330(arg1);
				return;
			case 388:
				Class14.method3337(arg1);
				return;
			case 389:
				Class539.method32577(arg1);
				return;
			case 390:
				Class429.method27930(arg1);
				return;
			case 391:
				Class227.method24502(arg1);
				return;
			case 392:
				Class430.method27939(arg1);
				return;
			case 393:
				Class383.method27326(arg1);
				return;
			case 394:
				Class12.method1251(arg1);
				return;
			case 395:
				Class343.method26479(arg1);
				return;
			case 396:
				Class304.method25699(arg1);
				return;
			case 397:
				Class34_Sub1.method16503(arg1);
				return;
			case 398:
				Class497.method29338(arg1);
				return;
			case 399:
				Class3_Sub42.method20200(arg1);
				return;
			case 400:
				Class13_Sub22.method7255(arg1);
				return;
			case 401:
				Class72_Sub1.method14649(arg1);
				return;
			case 402:
				Class515.method29645(arg1);
				return;
			case 403:
				Class477.method28825(arg1);
				return;
			case 404:
				Class192.method24065(arg1);
				return;
			case 405:
				Class181.method23550(arg1);
				return;
			case 406:
				Class178.method23517(arg1);
				return;
			case 407:
				Class151.method23140(arg1);
				return;
			case 408:
				Class422.method27873(arg1);
				return;
			case 409:
				Class339.method26435(arg1);
				return;
			case 410:
				Class11_Sub2.method1220(arg1);
				return;
			case 411:
				Class410.method27673(arg1);
				return;
			case 412:
				Class60_Sub18.method13612(arg1);
				return;
			case 413:
				Class455.method28466(arg1);
				return;
			case 414:
				Class215.method24291(arg1);
				return;
			case 415:
				Class364.method26786(arg1);
				return;
			case 416:
				Class44_Sub1.method8402(arg1);
				return;
			case 417:
				Class419.method27839(arg1);
				return;
			case 418:
				Class222.method24434(arg1);
				return;
			case 419:
				Class275.method25381(arg1);
				return;
			case 420:
				Class180.method23540(arg1);
				return;
			case 421:
				Class155.method23171(arg1);
				return;
			case 422:
				Class339.method26437(arg1);
				return;
			case 423:
				Class3_Sub19.method20809(arg1);
				return;
			case 424:
				Class540.method32579(arg1);
				return;
			case 425:
				Class108.method21937(arg1);
				return;
			case 426:
				Class21.method17424(arg1);
				return;
			case 427:
				Class26_Sub1_Sub1_Sub1.method16729(arg1);
				return;
			case 428:
				Class13_Sub9.method6251(arg1);
				return;
			case 429:
				Class460.method28579(arg1);
				return;
			case 430:
				Class380.method27283(false, arg1);
				return;
			case 431:
				Class401.method27606(arg1);
				return;
			case 432:
				Class201.method24154(arg1);
				return;
			case 433:
				Class3_Sub47.method13202(arg1);
				return;
			case 434:
				Class177.method23425(arg1);
				return;
			case 435:
				Class108.method21939(arg1);
				return;
			case 436:
				Class213.method24267(arg1);
				return;
			case 437:
				Class98.method21813(arg1);
				return;
			case 438:
				Class630.method33856(arg1);
				return;
			case 439:
				Class368.method26921(arg1);
				return;
			case 440:
				Class125.method22874(arg1);
				return;
			case 441:
				Class600.method33508(arg1);
				return;
			case 442:
				Class219.method24362(arg1);
				return;
			case 443:
				Class358.method26664(arg1);
				return;
			case 444:
				Class148.method23115(arg1);
				return;
			case 445:
				Class221.method24415(arg1);
				return;
			case 446:
				Class492.method29289(arg1);
				return;
			case 447:
				Class121.method22828(arg1);
				return;
			case 448:
				Class372.method27206(false, arg1);
				return;
			case 449:
				Class272.method25321(arg1);
				return;
			case 450:
				Class430.method27941(arg1);
				return;
			case 451:
				Class60_Sub2.method12696(arg1);
				return;
			case 452:
				Class568.method32977(arg1);
				return;
			case 453:
				Class107.method21927(arg1);
				return;
			case 454:
				Class285.method25474(arg1);
				return;
			case 455:
				Class438.method28214(arg1);
				return;
			case 456:
				Class427.method27909(arg1);
				return;
			case 457:
				Class198.method24129(arg1);
				return;
			case 458:
				Class27.method15273(arg1);
				return;
			case 459:
				Class295.method25570(arg1);
				return;
			case 460:
				Class346.method26517(arg1);
				return;
			case 461:
				Class473.method28780(arg1);
				return;
			case 462:
				Class205.method24185(arg1);
				return;
			case 463:
				Class454.method28454(arg1);
				return;
			case 464:
				Class470.method28764(arg1);
				return;
			case 465:
				Class183.method23689(arg1);
				return;
			case 466:
				Class497.method29337(arg1);
				return;
			case 467:
				Class213.method24263(arg1);
				return;
			case 468:
				Class628.method33832(arg1);
				return;
			case 469:
				Class141.method23033(arg1);
				return;
			case 470:
				Class301.method25660(arg1);
				return;
			case 471:
				Class206.method24214(arg1);
				return;
			case 472:
				Class531.method32489(arg1);
				return;
			case 473:
				Class183.method23691(arg1);
				return;
			case 474:
				Class572.method33074(arg1);
				return;
			case 475:
				Class3.method33666(arg1);
				return;
			case 476:
				Class551.method32692(arg1);
				return;
			case 477:
				Class461.method28595(arg1);
				return;
			case 478:
				Class17.method3589(arg1);
				return;
			case 479:
				Class424.method27889(arg1);
				return;
			case 480:
				Class422.method27872(arg1);
				return;
			case 481:
				Class508.method29567(arg1);
				return;
			case 482:
				Class353.method26604(arg1);
				return;
			case 483:
				Class493.method29298(arg1);
				return;
			case 484:
				Class379.method27275(arg1);
				return;
			case 485:
				Class3_Sub35_Sub1.method18869(arg1);
				return;
			case 486:
				Class121.method22827(arg1);
				return;
			case 487:
				Class349.method26578(arg1);
				return;
			case 488:
				Class214.method24278(arg1);
				return;
			case 489:
				Class134.method22910(arg1);
				return;
			case 490:
				Class427.method27910(arg1);
				return;
			case 491:
				Class60_Sub3.method12820(arg1);
				return;
			case 492:
				Class510.method29580(arg1);
				return;
			case 493:
				Class283.method25451(arg1);
				return;
			case 494:
				Class375.method27231(arg1);
				return;
			case 495:
				Class188.method23976(arg1);
				return;
			case 496:
				Class165.method23338(arg1);
				return;
			case 497:
				Class219.method24363(arg1);
				return;
			case 498:
				Class561.method32864(arg1);
				return;
			case 499:
				Class355.method26636(arg1);
				return;
			case 500:
				Class494.method29318(arg1);
				return;
			case 501:
				Class277.method25397(arg1);
				return;
			case 502:
				Class17.method3592(arg1);
				return;
			case 503:
				Class424.method27890(arg1);
				return;
			case 504:
				Class60_Sub21.method13695(arg1);
				return;
			case 505:
				Class375.method27234(arg1);
				return;
			case 506:
				Class631.method33857(arg1);
				return;
			case 507:
				Class391.method27420(arg1);
				return;
			case 509:
				Class499.method29374(arg1);
				return;
			case 510:
				Class439.method28217(arg1);
				return;
			case 511:
				Class458.method28527(arg1);
				return;
			case 512:
				Class220.method24384(arg1);
				return;
			case 513:
				Class13_Sub22.method7256(arg1);
				return;
			case 514:
				Class3_Sub43.method12941(arg1);
				return;
			case 515:
				Class531.method32490(arg1);
				return;
			case 516:
				Class316.method25841(arg1);
				return;
			case 517:
				Class226.method24477(arg1);
				return;
			case 518:
				Class46.method8522(arg1);
				return;
			case 519:
				Class142.method23045(arg1);
				return;
			case 520:
				Class475.method28788(arg1);
				return;
			case 521:
				Class179.method23532(arg1);
				return;
			case 522:
				Class142.method23046(arg1);
				return;
			case 523:
				Class117.method22814(arg1);
				return;
			case 524:
				Class465.method28643(arg1);
				return;
			case 525:
				Class43_Sub5.method9509(arg1);
				return;
			case 526:
				Class448.method28364(arg1);
				return;
			case 527:
				Class396.method27509(arg1);
				return;
			case 528:
				Class526.method32413(arg1);
				return;
			case 529:
				Class122.method22836(arg1);
				return;
			case 530:
				Class84.method21629(arg1);
				return;
			case 531:
				Class147.method23098(arg1);
				return;
			case 532:
				Class130.method22887(arg1);
				return;
			case 533:
				Class342.method26472(arg1);
				return;
			case 534:
				Class3_Sub40_Sub4.method18986(arg1);
				return;
			case 535:
				Class398.method27552(arg1);
				return;
			case 536:
				Class203.method24170(arg1);
				return;
			case 537:
				Class280.method25426(arg1);
				return;
			case 538:
				Class281.method25431(arg1);
				return;
			case 539:
				Class389.method27404(arg1);
				return;
			case 540:
				Class349.method26572(arg1);
				return;
			case 541:
				Class390.method22352(arg1);
				return;
			case 542:
				Class143.method23056(arg1);
				return;
			case 543:
				Class343.method26478(arg1);
				return;
			case 544:
				Class44.method15133(arg1);
				return;
			case 545:
				Class63.method13050(arg1);
				return;
			case 546:
				Class356.method26650(arg1);
				return;
			case 547:
				Class17.method3591(arg1);
				return;
			case 548:
				Class68.method14035(arg1);
				return;
			case 549:
				Class390.method22355(arg1);
				return;
			case 550:
				Class108.method21940(arg1);
				return;
			case 551:
				Class245.method24867(arg1);
				return;
			case 552:
				Class21.method17422(arg1);
				return;
			case 553:
				Class202.method24162(arg1);
				return;
			case 554:
				Class551.method32693(arg1);
				return;
			case 555:
				Class513.method29601(arg1);
				return;
			case 556:
				Class377.method27242(arg1);
				return;
			case 557:
				Class264.method25232(arg1);
				return;
			case 558:
				Class290.method25536(arg1);
				return;
			case 559:
				Class277.method25398(arg1);
				return;
			case 560:
				Class612.method33641(arg1);
				return;
			case 561:
				method29335(arg1);
				return;
			case 562:
				Class271.method25313(arg1);
				return;
			case 563:
				Class630.method33855(arg1);
				return;
			case 564:
				Class538.method32564(arg1);
				return;
			case 565:
				Class75.method19528(arg1);
				return;
			case 566:
				Class457.method28514(arg1);
				return;
			case 567:
				Class202.method24160(arg1);
				return;
			case 568:
				Class76.method21538(arg1);
				return;
			case 569:
				Class5.method746(arg1);
				return;
			case 570:
				Class63.method13051(arg1);
				return;
			case 571:
				Class440.method28239(arg1);
				return;
			case 572:
				Class505.method29519(arg1);
				return;
			case 573:
				Class486.method29182(arg1);
				return;
			case 574:
				Class277.method25399(arg1);
				return;
			case 575:
				Class436.method28022(arg1);
				return;
			case 576:
				Class347.method26541(arg1);
				return;
			case 577:
				Class40_Sub1_Sub1.method15213(arg1);
				return;
			case 578:
				Class224.method24458(arg1);
				return;
			case 579:
				Class442.method28252(arg1);
				return;
			case 580:
				Class148.method23118(arg1);
				return;
			case 581:
				Class139.method23014(arg1);
				return;
			case 582:
				Class209.method24241(arg1);
				return;
			case 583:
				Class344.method26490(arg1);
				return;
			case 584:
				Class348.method26561(arg1);
				return;
			case 585:
				Class623.method33770(arg1);
				return;
			case 586:
				Class425.method27897(arg1);
				return;
			case 587:
				Class48_Sub1.method9026(arg1);
				return;
			case 588:
				Class19.method21410(arg1);
				return;
			case 589:
				Class467.method28736(arg1);
				return;
			case 590:
				Class370.method27079(arg1);
				return;
			case 591:
				Class5_Sub3.method749(arg1);
				return;
			case 592:
				Class13_Sub13.method6521(arg1);
				return;
			case 593:
				Class25.method6475(arg1);
				return;
			case 594:
				Class166.method23341(arg1);
				return;
			case 595:
				Class387.method27401(arg1);
				return;
			case 596:
				Class395.method27503(arg1);
				return;
			case 597:
				Class200.method24149(arg1);
				return;
			case 598:
				Class506.method29549(arg1);
				return;
			case 599:
				Class550.method32681(arg1);
				return;
			case 600:
				Exception_Sub5.method14669(arg1);
				return;
			case 601:
				Class591.method33332(arg1);
				return;
			case 602:
				Class418.method27830(arg1);
				return;
			case 603:
				Class279.method25418(arg1);
				return;
			case 604:
				Class509.method29574(arg1);
				return;
			case 605:
				Class418.method27831(arg1);
				return;
			case 606:
				Class341.method26459(arg1);
				return;
			case 607:
				Class284.method25465(arg1);
				return;
			case 608:
				Class3.method33665(arg1);
				return;
			case 609:
				Class591.method33331(arg1);
				return;
			case 610:
				Class465.method28642(arg1);
				return;
			case 611:
				Class203.method24166(arg1);
				return;
			case 612:
				Class127.method22881(arg1);
				return;
			case 613:
				Class161.method23262(arg1);
				return;
			case 614:
				Class270.method25288(arg1);
				return;
			case 615:
				Class157.method23188(arg1);
				return;
			case 616:
				Class436.method28020(arg1);
				return;
			case 618:
				Class452.method28423(arg1);
				return;
			case 619:
				Class13_Sub10.method6266(arg1);
				return;
			case 620:
				Class280.method25424(arg1);
				return;
			case 621:
				Class561.method32863(arg1);
				return;
			case 622:
				Class216.method24301(arg1);
				return;
			case 623:
				Class510.method29577(arg1);
				return;
			case 624:
				Class524.method29839(arg1);
				return;
			case 625:
				Class398.method27553(arg1);
				return;
			case 626:
				Class368.method26920(arg1);
				return;
			case 627:
				Class483.method29101(arg1);
				return;
			case 628:
				Class452.method28420(arg1);
				return;
			case 629:
				Class601.method33511(arg1);
				return;
			case 630:
				Class282.method25442(arg1);
				return;
			case 631:
				Class214.method24277(arg1);
				return;
			case 632:
				Class517.method29675(arg1);
				return;
			case 633:
				Class371.method27202(arg1);
				return;
			case 634:
				Class70.method33880(arg1);
				return;
			case 635:
				Class318.method25856(arg1);
				return;
			case 636:
				Class33.method7568(arg1);
				return;
			case 637:
				Class544.method32608(arg1);
				return;
			case 638:
				Class185.method23910(arg1);
				return;
			case 639:
				Class152.method23144(arg1);
				return;
			case 640:
				Class135.method22920(arg1);
				return;
			case 641:
				Class516.method29665(arg1);
				return;
			case 642:
				Class68.method14034(arg1);
				return;
			case 643:
				Class538.method32567(arg1);
				return;
			case 644:
				Class210.method24245(arg1);
				return;
			case 645:
				Class146.method23083(arg1);
				return;
			case 646:
				Class133.method22903(arg1);
				return;
			case 647:
				Class374.method27225(arg1);
				return;
			case 648:
				Class513.method29597(arg1);
				return;
			case 649:
				Class67.method13255(arg1);
				return;
			case 650:
				Class354.method26628(arg1);
				return;
			case 651:
				Class519.method29743(arg1);
				return;
			case 652:
				Class564.method32903(arg1);
				return;
			case 653:
				Class494.method29316(arg1);
				return;
			case 654:
				Class493.method29301(arg1);
				return;
			case 655:
				Class416.method27787(arg1);
				return;
			case 656:
				Class396.method27511(arg1);
				return;
			case 657:
				Class5.method748(arg1);
				return;
			case 658:
				Class403.method27634(arg1);
				return;
			case 659:
				Class174.method23402(arg1);
				return;
			case 660:
				Class361.method26772(arg1);
				return;
			case 661:
				Class419.method27841(arg1);
				return;
			case 662:
				Class441.method28245(arg1);
				return;
			case 663:
				Class128.method22884(arg1);
				return;
			case 664:
				Class392.method27430(arg1);
				return;
			case 665:
				Class19.method21407(arg1);
				return;
			case 666:
				Class179.method23531(arg1);
				return;
			case 667:
				Class493.method29297(arg1);
				return;
			case 668:
				Class602.method33524(arg1);
				return;
			case 669:
				Class27.method15272(arg1);
				return;
			case 670:
				Class130.method22888(arg1);
				return;
			case 671:
				Class12.method1250(arg1);
				return;
			case 672:
				Class50.method9446(arg1);
				return;
			case 673:
				Class385.method27336(arg1);
				return;
			case 674:
				Class508.method29566(arg1);
				return;
			case 675:
				Class470.method28762(arg1);
				return;
			case 676:
				Class435.method27994(arg1);
				return;
			case 677:
				Class603.method33530(arg1);
				return;
			case 678:
				Class370.method27081(arg1);
				return;
			case 679:
				Class73.method14937(arg1);
				return;
			case 680:
				Class380.method27285(arg1);
				return;
			case 681:
				Class572.method33075(arg1);
				return;
			case 682:
				Class545.method32617(arg1);
				return;
			case 683:
				Class471.method28770(arg1);
				return;
			case 684:
				Class145.method23071(arg1);
				return;
			case 685:
				Class77.method21568(arg1);
				return;
			case 686:
				Class10_Sub1.method741(arg1);
				return;
			case 687:
				Class405.method27650(arg1);
				return;
			case 688:
				Class421.method27849(arg1);
				return;
			case 689:
				Class289.method25517(arg1);
				return;
			case 690:
				Class302.method25669(arg1);
				return;
			case 691:
				Class26_Sub1_Sub4_Sub2.method11173(arg1);
				return;
			case 692:
				Class281.method25432(arg1);
				return;
			case 693:
				Class85.method21637(arg1);
				return;
			case 694:
				Class190.method24051(arg1);
				return;
			case 695:
				Class483.method29103(arg1);
				return;
			case 696:
				Class531.method32492(arg1);
				return;
			case 697:
				Class431.method27958(arg1);
				return;
			case 698:
				Class250.method25083(arg1);
				return;
			case 699:
				Class282.method25445(arg1);
				return;
			case 700:
				Class461.method28591(arg1);
				return;
			case 701:
				Class157.method23189(arg1);
				return;
			case 702:
				Class159.method23205(arg1);
				return;
			case 703:
				Class405.method27651(arg1);
				return;
			case 704:
				Class544.method32606(arg1);
				return;
			case 705:
				Class608.method33568(arg1);
				return;
			case 706:
				Class221.method24416(arg1);
				return;
			case 707:
				Class608.method33565(arg1);
				return;
			case 708:
				Class284.method25464(arg1);
				return;
			case 709:
				Class350.method26580(arg1);
				return;
			case 710:
				Class583.method33267(arg1);
				return;
			case 711:
				Class110.method22010(arg1);
				return;
			case 712:
				Class17.method3590(arg1);
				return;
			case 713:
				Class1.method8(arg1);
				return;
			case 714:
				Class21_Sub1.method3216(arg1);
				return;
			case 715:
				Class19_Sub2.method21421(arg1);
				return;
			case 716:
				Class3_Sub13.method11251(arg1);
				return;
			case 717:
				Class287.method25501(arg1);
				return;
			case 718:
				Class469.method28755(arg1);
				return;
			case 719:
				Class515.method29644(arg1);
				return;
			case 720:
				Class78.method21588(arg1);
				return;
			case 721:
				Class188.method23974(arg1);
				return;
			case 722:
				Class360.method26765(arg1);
				return;
			case 723:
				Class5.method744(arg1);
				return;
			case 724:
				Class396.method27507(arg1);
				return;
			case 725:
				Class223.method24440(arg1);
				return;
			case 726:
				Class61.method12769(arg1);
				return;
			case 727:
				Class205.method24191(arg1);
				return;
			case 728:
				Class46.method8521(arg1);
				return;
			case 729:
				Class283.method25450(arg1);
				return;
			case 730:
				Class593.method33354(arg1);
				return;
			case 731:
				Class515.method29643(arg1);
				return;
			case 732:
				Class60_Sub14.method13494(arg1);
				return;
			case 733:
				Class141.method23029(arg1);
				return;
			case 734:
				Class24.method6673(arg1);
				return;
			case 735:
				Class161.method23265(arg1);
				return;
			case 736:
				Class349.method26576(arg1);
				return;
			case 737:
				Class421.method27851(arg1);
				return;
			case 738:
				Class465.method28640(arg1);
				return;
			case 739:
				Class98.method21814(arg1);
				return;
			case 740:
				Class237.method24613(arg1);
				return;
			case 741:
				Class347.method26538(arg1);
				return;
			case 742:
				Class51.method9859(arg1);
				return;
			case 743:
				Class290.method25538(arg1);
				return;
			case 744:
				Class150.method23133(arg1);
				return;
			case 745:
				Class117.method22813(arg1);
				return;
			case 746:
				Class621.method33758(arg1);
				return;
			case 747:
				Class285.method25472(arg1);
				return;
			case 748:
				Class31_Sub1.method7481(arg1);
				return;
			case 749:
				Class24.method6666(arg1);
				return;
			case 751:
				Class506.method29551(arg1);
				return;
			case 752:
				Class427.method27911(arg1);
				return;
			case 753:
				Class195.method24092(arg1);
				return;
			case 754:
				Class504.method29512(arg1);
				return;
			case 755:
				Class25.method6476(arg1);
				return;
			case 756:
				Class60_Sub23.method13753(arg1);
				return;
			case 757:
				Class331.method26183(arg1);
				return;
			case 758:
				Class162.method23272(arg1);
				return;
			case 759:
				Class26_Sub1_Sub4_Sub2.method11176(arg1);
				return;
			case 760:
				Class627.method33807(arg1);
				return;
			case 761:
				Class351.method26586(arg1);
				return;
			case 762:
				Class481.method29080(arg1);
				return;
			case 763:
				Class395.method27501(arg1);
				return;
			case 764:
				Class145.method23074(arg1);
				return;
			case 765:
				Class160.method23215(arg1);
				return;
			case 766:
				Class10_Sub1.method742(arg1);
				return;
			case 767:
				Class472.method28777(arg1);
				return;
			case 768:
				Class521.method29811(arg1);
				return;
			case 769:
				Class98.method21815(arg1);
				return;
			case 770:
				Class170.method23359(arg1);
				return;
			case 771:
				Class543.method32599(arg1);
				return;
			case 772:
				Class154.method23161(arg1);
				return;
			case 773:
				Class549.method32674(arg1);
				return;
			case 774:
				Class345.method26500(arg1);
				return;
			case 775:
				Class325.method26006(arg1);
				return;
			case 776:
				Class123.method22845(arg1);
				return;
			case 777:
				Class250.method25085(arg1);
				return;
			case 778:
				Class491.method29253(arg1);
				return;
			case 779:
				Class158.method23196(arg1);
				return;
			case 780:
				Class125.method22873(arg1);
				return;
			case 781:
				Class463.method28611(arg1);
				return;
			case 782:
				Class568.method32976(arg1);
				return;
			case 783:
				Class227.method24504(arg1);
				return;
			case 784:
				Class19.method21409(arg1);
				return;
			case 785:
				Class298.method25631(arg1);
				return;
			case 786:
				Class312.method25818(arg1);
				return;
			case 787:
				Class185.method23913(arg1);
				return;
			case 788:
				Class281.method25435(arg1);
				return;
			case 789:
				Class518.method29729(arg1);
				return;
			case 790:
				Class141.method23031(arg1);
				return;
			case 791:
				Class123.method22844(arg1);
				return;
			case 792:
				Class155.method23172(arg1);
				return;
			case 793:
				Class180.method23539(arg1);
				return;
			case 794:
				Class354.method26626(arg1);
				return;
			case 795:
				Class298.method25630(arg1);
				return;
			case 796:
				Class13_Sub10.method6265(arg1);
				return;
			case 797:
				Class273.method25346(arg1);
				return;
			case 798:
				Class534.method32524(arg1);
				return;
			case 799:
				Class161.method23261(arg1);
				return;
			case 800:
				Class509.method29573(arg1);
				return;
			case 801:
				Class44.method15134(arg1);
				return;
			case 802:
				Class150.method23134(arg1);
				return;
			case 803:
				Class164.method23304(arg1);
				return;
			case 804:
				Class534.method32523(arg1);
				return;
			case 805:
				Class508.method29568(arg1);
				return;
			case 806:
				Class619.method33751(arg1);
				return;
			case 807:
				Class288.method25510(arg1);
				return;
			case 808:
				Class18.method17010(arg1);
				return;
			case 809:
				Class421.method27850(arg1);
				return;
			case 810:
				Class277.method25396(arg1);
				return;
			case 811:
				Class515.method29646(arg1);
				return;
			case 812:
				Class350.method26579(arg1);
				return;
			case 813:
				Class361.method26769(arg1);
				return;
			case 814:
				Class197.method24121(arg1);
				return;
			case 815:
				Class49.method9253(arg1);
				return;
			case 816:
				Class65.method13151(arg1);
				return;
			case 817:
				Class483.method29104(arg1);
				return;
			case 818:
				Class572.method33072(arg1);
				return;
			case 819:
				Class84.method21631(arg1);
				return;
			case 820:
				Class107.method21924(arg1);
				return;
			case 821:
				Class49.method9252(arg1);
				return;
			case 822:
				Class203.method24167(arg1);
				return;
			case 823:
				Class175.method23412(arg1);
				return;
			case 824:
				Class164.method23303(arg1);
				return;
			case 825:
				Class10.method719(arg1);
				return;
			case 826:
				Class287.method25497(arg1);
				return;
			case 827:
				Class273.method25348(arg1);
				return;
			case 828:
				Class3_Sub21.method11425(arg1);
				return;
			case 829:
				Class502.method29458(arg1);
				return;
			case 830:
				Class349.method26573(arg1);
				return;
			case 831:
				Class181.method23547(arg1);
				return;
			case 832:
				Class217.method24349(arg1);
				return;
			case 833:
				Class361.method26770(arg1);
				return;
			case 834:
				Class341.method26457(arg1);
				return;
			case 835:
				Class396.method27506(arg1);
				return;
			case 836:
				Class78.method21587(arg1);
				return;
			case 837:
				Class64_Sub1.method13111(arg1);
				return;
			case 838:
				Class220.method24383(arg1);
				return;
			case 839:
				Class471.method28773(arg1);
				return;
			case 840:
				Class326.method26008(arg1);
				return;
			case 841:
				Class367.method26916(arg1);
				return;
			case 842:
				Class174.method23399(arg1);
				return;
			case 843:
				Class281.method25436(arg1);
				return;
			case 844:
				Class372.method27206(true, arg1);
				return;
			case 845:
				Class473.method28783(arg1);
				return;
			case 846:
				Class440.method28238(arg1);
				return;
			case 847:
				Class208.method24230(arg1);
				return;
			case 848:
				Class474.method28784(arg1);
				return;
			case 849:
				Class456.method28486(arg1);
				return;
			case 850:
				Class140.method23021(arg1);
				return;
			case 851:
				Class345.method26499(arg1);
				return;
			case 852:
				Class296.method25575(arg1);
				return;
			case 853:
				Class3_Sub1_Sub8.method19030(arg1);
				return;
			case 854:
				Class206.method24215(arg1);
				return;
			case 855:
				Class309.method25756(arg1);
				return;
			case 856:
				Class450.method28383(arg1);
				return;
			case 857:
				Class356.method26656(arg1);
				return;
			case 858:
				Class449.method28380(arg1);
				return;
			case 859:
				Class65.method13154(arg1);
				return;
			case 860:
				Class183.method23688(arg1);
				return;
			case 861:
				Class383.method27328(arg1);
				return;
			case 862:
				Class3_Sub35_Sub1.method18871(arg1);
				return;
			case 863:
				Class329.method26169(arg1);
				return;
			case 864:
				Class344.method26492(arg1);
				return;
			case 865:
				Class582.method33257(arg1);
				return;
			case 866:
				Class421.method27848(arg1);
				return;
			case 867:
				Class477.method28827(arg1);
				return;
			case 868:
				Class51.method9861(arg1);
				return;
			case 869:
				Class153.method23158(arg1);
				return;
			case 870:
				Class296.method25574(arg1);
				return;
			case 871:
				Class12.method1249(arg1);
				return;
			case 872:
				Class85.method21636(arg1);
				return;
			case 873:
				Class284.method25468(arg1);
				return;
			case 874:
				Class535.method32539(arg1);
				return;
			case 875:
				Class459.method28532(arg1);
				return;
			case 876:
				Class362.method26778(arg1);
				return;
			case 877:
				Class489.method29235(arg1);
				return;
			case 878:
				Class618.method33709(arg1);
				return;
			case 879:
				Class1.method10(arg1);
				return;
			case 880:
				Class358.method26661(arg1);
				return;
			case 881:
				Class202.method24161(arg1);
				return;
			case 882:
				Class218.method24359(arg1);
				return;
			case 883:
				Class502.method29459(arg1);
				return;
			case 884:
				Class367.method26917(arg1);
				return;
			case 885:
				Class625.method33797(arg1);
				return;
			case 886:
				Class417.method27821(arg1);
				return;
			case 887:
				Class144.method23069(arg1);
				return;
			case 888:
				Class135.method22926(arg1);
				return;
			case 889:
				Class11_Sub1.method817(arg1);
				return;
			case 890:
				Class568.method32975(arg1);
				return;
			case 891:
				Class3.method33667(arg1);
				return;
			case 892:
				Class135.method22922(arg1);
				return;
			case 893:
				Class513.method29598(arg1);
				return;
			case 894:
				Class108.method21936(arg1);
				return;
			case 895:
				Class197.method24124(arg1);
				return;
			case 896:
				Class121.method22824(arg1);
				return;
			case 897:
				Class348.method26560(arg1);
				return;
			case 898:
				Class533.method32509(arg1);
				return;
			case 899:
				Class308.method25751(arg1);
				return;
			case 900:
				Class215.method24292(arg1);
				return;
			case 901:
				Class511.method29583(arg1);
				return;
			case 902:
				Class353.method26603(arg1);
				return;
			case 903:
				Class60_Sub5.method12927(arg1);
				return;
			case 904:
				Class375.method27230(arg1);
				return;
			case 905:
				Class449.method28379(arg1);
				return;
			case 906:
				Class621.method33760(arg1);
				return;
			case 907:
				Class165.method23336(arg1);
				return;
			case 908:
				Class3_Sub21.method11426(arg1);
				return;
			case 909:
				Class421.method27852(arg1);
				return;
			case 910:
				Class457.method28513(arg1);
				return;
			case 911:
				Class23.method5940(arg1);
				return;
			case 912:
				Class287.method25498(arg1);
				return;
			case 914:
				Class51.method9858(arg1);
				return;
			case 915:
				Class389.method27403(arg1);
				return;
			case 916:
				Class402.method27619(arg1);
				return;
			case 917:
				Class344.method26494(arg1);
				return;
			case 918:
				Class331.method26184(arg1);
				return;
			case 919:
				Class145.method23072(arg1);
				return;
			case 920:
				Class487.method29189(arg1);
				return;
			case 921:
				Class474.method28786(arg1);
				return;
			case 922:
				Class210.method24246(arg1);
				return;
			case 923:
				Class210.method24247(arg1);
				return;
			case 924:
				Class10.method718(arg1);
				return;
			case 925:
				Class358.method26660(arg1);
				return;
			case 926:
				Class56.method12591(arg1);
				return;
			case 927:
				Class26_Sub1_Sub1_Sub3.method10459(arg1);
				return;
			case 928:
				Class193.method24072(arg1);
				return;
			case 929:
				Class546.method32648(arg1);
				return;
			case 930:
				Class3_Sub35_Sub1.method18847(arg1);
				return;
			case 931:
				Class308.method25755(arg1);
				return;
			case 932:
				Class302.method25668(arg1);
				return;
			case 933:
				Class287.method25500(arg1);
				return;
			case 934:
				Class438.method28212(arg1);
				return;
			case 935:
				Class281.method25433(arg1);
				return;
			case 936:
				Class301.method25659(arg1);
				return;
			case 937:
				Class84.method21632(arg1);
				return;
			case 938:
				Class485.method29177(arg1);
				return;
			case 939:
				Class64_Sub1.method13112(arg1);
				return;
			case 940:
				Class209.method24238(arg1);
				return;
			case 941:
				Class242.method24746(arg1);
				return;
			case 942:
				Class65.method13149(arg1);
				return;
			case 943:
				Class110.method22011(arg1);
				return;
			case 944:
				Class165.method23335(arg1);
				return;
			case 945:
				Class392.method27427(arg1);
				return;
			case 946:
				Class475.method28791(arg1);
				return;
			case 947:
				Class224.method24459(arg1);
				return;
			case 948:
				Class161.method23266(arg1);
				return;
			case 949:
				Class490.method29242(arg1);
				return;
			case 950:
				Class441.method28247(arg1);
				return;
			case 951:
				Class3_Sub44.method12982(arg1);
				return;
			case 952:
				Class314.method25823(arg1);
				return;
			case 953:
				Class410.method27672(arg1);
				return;
			case 954:
				Class67.method13254(arg1);
				return;
			case 955:
				Class146.method23086(arg1);
				return;
			case 956:
				Class407.method27660(arg1);
				return;
			case 957:
				Class204.method24177(arg1);
				return;
			case 958:
				Class385.method27335(arg1);
				return;
			case 959:
				Class425.method27898(arg1);
				return;
			case 960:
				Class406.method27655(arg1);
				return;
			case 961:
				Class193.method24074(arg1);
				return;
			case 962:
				Class227.method24503(arg1);
				return;
			case 963:
				Class193.method24069(arg1);
				return;
			case 964:
				Class26_Sub1_Sub1_Sub1_Sub2.method16769(arg1);
				return;
			case 965:
				Class458.method28526(arg1);
				return;
			case 966:
				Class230.method24547(arg1);
				return;
			case 967:
				Class364.method26783(arg1);
				return;
			case 968:
				Class142.method23049(arg1);
				return;
			case 969:
				Class162.method23271(arg1);
				return;
			case 970:
				Class13_Sub23.method7270(arg1);
				return;
			case 971:
				Class3_Sub27.method11553(arg1);
				return;
			case 972:
				Class144.method23066(arg1);
				return;
			case 973:
				Class296.method25572(arg1);
				return;
			case 974:
				Class191.method24059(arg1);
				return;
			case 975:
				Class42.method8329(arg1);
				return;
			case 976:
				Class379.method27276(arg1);
				return;
			case 977:
				Class345.method26498(arg1);
				return;
			case 978:
				Class314.method25825(arg1);
				return;
			case 979:
				Class404.method27637(arg1);
				return;
			case 980:
				Class308.method25752(arg1);
				return;
			case 981:
				Class309.method25758(arg1);
				return;
			case 982:
				Class314.method25827(arg1);
				return;
			case 983:
				Class53.method20618(arg1);
				return;
			case 984:
				Class412.method27702(arg1);
				return;
			case 985:
				Class432.method27964(arg1);
				return;
			case 986:
				Class60_Sub2.method12697(arg1);
				return;
			case 987:
				Class293.method25560(arg1);
				return;
			case 988:
				Class501.method29454(arg1);
				return;
			case 989:
				Class141.method23032(arg1);
				return;
			case 990:
				Class193.method24073(arg1);
				return;
			case 991:
				Class189.method23983(arg1);
				return;
			case 992:
				Class24.method6671(arg1);
				return;
			case 993:
				Class344.method26491(arg1);
				return;
			case 994:
				Class127.method22880(arg1);
				return;
			case 995:
				Class396.method27508(arg1);
				return;
			case 996:
				Class611.method33624(arg1);
				return;
			case 997:
				Class64.method13091(arg1);
				return;
			case 998:
				Class178.method23518(arg1);
				return;
			case 999:
				Class62.method12867(arg1);
				return;
			case 1000:
				Class359.method26759(arg1);
				return;
			case 1001:
				Class329.method26172(arg1);
				return;
			case 1002:
				Class3_Sub1_Sub3.method21265(arg1);
				return;
			case 1003:
				Class347.method26540(arg1);
				return;
			case 1004:
				Class489.method29233(arg1);
				return;
			case 1005:
				Class177.method23424(arg1);
				return;
			case 1006:
				Class282.method25444(arg1);
				return;
			case 1007:
				Class560.method32850(arg1);
				return;
			case 1008:
				Class314.method25824(arg1);
				return;
			case 1009:
				Class294.method25564(arg1);
				return;
			case 1010:
				Class153.method23155(arg1);
				return;
			case 1011:
				Class530.method32479(arg1);
				return;
			case 1012:
				Class581.method33243(arg1);
				return;
			case 1013:
				Class63_Sub1.method13063(arg1);
				return;
			case 1014:
				Class416.method27788(arg1);
				return;
			case 1015:
				Class461.method28593(arg1);
				return;
			case 1016:
				Class292.method25554(arg1);
				return;
			case 1017:
				Class431.method27959(arg1);
				return;
			case 1018:
				Class344.method26495(arg1);
				return;
			case 1019:
				Class375.method27233(arg1);
				return;
			case 1020:
				Class151.method23141(arg1);
				return;
			case 1021:
				Class476.method28796(arg1);
				return;
			case 1022:
				Class406.method27656(arg1);
				return;
			case 1023:
				Class520.method29765(arg1);
				return;
			case 1024:
				Class329.method26171(arg1);
				return;
			case 1025:
				Class304.method25701(arg1);
				return;
			case 1026:
				Class13_Sub7.method6224(arg1);
				return;
			case 1027:
				Class548.method32661(arg1);
				return;
			case 1028:
				Class579.method33207(arg1);
				return;
			case 1029:
				Class56_Sub1.method11929(arg1);
				return;
			case 1030:
				Class14.method3339(arg1);
				return;
			case 1031:
				Class364.method26784(arg1);
				return;
			case 1032:
				Class5_Sub3.method751(arg1);
				return;
			case 1033:
				Class536.method32540(arg1);
				return;
			case 1034:
				Class462.method28599(arg1);
				return;
			case 1035:
				Class594.method33425(arg1);
				return;
			case 1036:
				Class509.method29571(arg1);
				return;
			case 1037:
				Class153.method23157(arg1);
				return;
			case 1038:
				Class13.method16899(arg1);
				return;
			case 1039:
				Class53.method20616(arg1);
				return;
			case 1040:
				Class125.method22872(arg1);
				return;
			case 1041:
				Class265.method25234(arg1);
				return;
			case 1042:
				Class212.method24254(arg1);
				return;
			case 1043:
				Class368.method26919(arg1);
				return;
			case 1044:
				Class223.method24445(arg1);
				return;
			case 1045:
				Class428.method27925(arg1);
				return;
			case 1046:
				Class278.method25406(arg1);
				return;
			case 1047:
				Class217.method24347(arg1);
				return;
			case 1048:
				Class526.method32415(arg1);
				return;
			case 1049:
				Class160.method23210(arg1);
				return;
			case 1050:
				Class134.method22911(arg1);
				return;
			case 1051:
				Class490.method29243(arg1);
				return;
			case 1052:
				Class122.method22835(arg1);
				return;
			case 1053:
				Class432.method27965(arg1);
				return;
			case 1054:
				Class231.method24577(arg1);
				return;
			case 1055:
				Class382.method27322(arg1);
				return;
			case 1056:
				Class430.method27940(arg1);
				return;
			case 1057:
				Class141.method23030(arg1);
				return;
			case 1058:
				Class304.method25698(arg1);
				return;
			case 1059:
				Class446.method28353(arg1);
				return;
			case 1060:
				Class30_Sub2_Sub3.method16476(arg1);
				return;
			case 1061:
				Class326.method26007(arg1);
				return;
			case 1062:
				Class530.method32483(arg1);
				return;
			case 1063:
				Class157.method23190(arg1);
				return;
			case 1064:
				Class17.method3594(arg1);
				return;
			case 1065:
				Class454.method28456(arg1);
				return;
			case 1066:
				Class315.method25832(arg1);
				return;
			case 1067:
				Class193.method24070(arg1);
				return;
			case 1068:
				Class159.method23208(arg1);
				return;
			case 1069:
				Class293.method25563(arg1);
				return;
			case 1070:
				Class278.method25407(arg1);
				return;
			case 1071:
				Class3_Sub18.method19507(arg1);
				return;
			case 1072:
				Class612.method33631(arg1);
				return;
			case 1073:
				Class378.method27246(arg1);
				return;
			case 1074:
				Class76.method21536(arg1);
				return;
			case 1075:
				Class473.method28781(arg1);
				return;
			case 1076:
				Class430.method27942(arg1);
				return;
			case 1077:
				Class389.method27406(arg1);
				return;
			case 1078:
				Class526.method32412(arg1);
				return;
			case 1079:
				Class498.method29359(arg1);
				return;
			case 1080:
				Class356.method26648(arg1);
				return;
			case 1081:
				Class205.method24192(arg1);
				return;
			case 1082:
				Class53.method20617(arg1);
				return;
			case 1083:
				Class601.method33513(arg1);
				return;
			case 1084:
				Class116.method22811(arg1);
				return;
			case 1085:
				Class550.method32680(arg1);
				return;
			case 1086:
				Class423.method27882(arg1);
				return;
			case 1087:
				Class411.method27695(arg1);
				return;
			case 1088:
				Class164.method23302(arg1);
				return;
			case 1089:
				Class242.method24748(arg1);
				return;
			case 1090:
				Class237.method24615(arg1);
				return;
			case 1091:
				Class313.method25820(arg1);
				return;
			case 1092:
				Class507.method29552(arg1);
				return;
			case 1093:
				Class506.method29548(arg1);
				return;
			case 1094:
				Class110.method22008(arg1);
				return;
			case 1095:
				Class380.method27287(arg1);
				return;
			case 1096:
				Class349.method26574(arg1);
				return;
			case 1097:
				Class579.method33208(arg1);
				return;
			case 1098:
				Class379.method27277(arg1);
				return;
			case 1099:
				Class117.method22817(arg1);
				return;
			case 1100:
				Class21.method17427(arg1);
				return;
			case 1101:
				Class537.method32550(arg1);
				return;
			case 1102:
				Class347.method26539(arg1);
				return;
			case 1103:
				Class601.method33516(arg1);
				return;
			case 1104:
				Class475.method28790(arg1);
				return;
			case 1105:
				Class217.method24348(arg1);
				return;
			case 1106:
				Class3_Sub24_Sub14.method18650(arg1);
				return;
			case 1107:
				Class389.method27405(arg1);
				return;
			case 1108:
				Class175.method23408(arg1);
				return;
			case 1109:
				Class193.method24071(arg1);
				return;
			case 1110:
				Exception_Sub4.method14576(arg1);
				return;
			case 1111:
				Class13_Sub15.method6548(arg1);
				return;
			case 1112:
				Class606.method33539(arg1);
				return;
			case 1113:
				Class24.method6672(arg1);
				return;
			case 1114:
				Class345.method26497(arg1);
				return;
			case 1115:
				Class485.method29175(arg1);
				return;
			case 1116:
				Class420.method27845(arg1);
				return;
			case 1117:
				Class193.method24068(arg1);
				return;
			case 1118:
				Class61.method12764(arg1);
				return;
			case 1119:
				Class34_Sub2.method8150(arg1);
				return;
			case 1120:
				Class499.method29377(arg1);
				return;
			case 1121:
				Class382.method27321(arg1);
				return;
			case 1122:
				Class215.method24290(arg1);
				return;
			case 1123:
				Class454.method28455(arg1);
				return;
			case 1124:
				Class25.method6474(arg1);
				return;
			case 1125:
				Class488.method29228(arg1);
				return;
			case 1126:
				Class44_Sub1.method8407(arg1);
				return;
			case 1127:
				Class226.method24479(arg1);
				return;
			case 1128:
				Class242.method24747(arg1);
				return;
			case 1129:
				Class493.method29300(arg1);
				return;
			case 1130:
				Class491.method29257(arg1);
				return;
			case 1131:
				Class34.method16496(arg1);
				return;
			case 1132:
				Class534.method32522(arg1);
				return;
			case 1133:
				Class499.method29376(arg1);
				return;
			case 1134:
				Class606.method33540(arg1);
				return;
			case 1135:
				Class273.method25345(arg1);
				return;
			case 1136:
				Class219.method24361(arg1);
				return;
			case 1137:
				Class174.method23398(arg1);
				return;
			case 1138:
				Class513.method29600(arg1);
				return;
			case 1139:
				Class517.method29676(arg1);
				return;
			case 1140:
				Class195.method24090(arg1);
				return;
			case 1141:
				Class342.method26474(arg1);
				return;
			case 1142:
				Class223.method24443(arg1);
				return;
			case 1143:
				Class598.method33478(arg1);
				return;
			case 1144:
				Class372.method27207(arg1);
		}
	}

	@OriginalMember(owner = "client!u", name = "qw", descriptor = "(Lclient!vs;B)V", line = 7018)
	static final void method29334(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3491 * 18828465;
	}

	@OriginalMember(owner = "client!u", name = "xv", descriptor = "(Lclient!vs;I)V", line = 8409)
	static final void method29335(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		Class34_Sub3.method8312(local13);
	}
}
