import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class1 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "b", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!to;[Lclient!ej;)V")
	public dxVertexLayout(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) Class90[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aPi1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class90 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local27 < local25.method2365(); local27++) {
				@Pc(41) Class156 local41 = local25.method2368(local27);
				@Pc(51) byte local51;
				@Pc(49) byte local49;
				@Pc(53) int local53;
				if (Static248.aClass156_1 == local41) {
					local51 = 2;
					local53 = 0;
					local49 = 0;
				} else if (local41 == Static248.aClass156_2) {
					local49 = 3;
					local51 = 2;
					local53 = 0;
				} else if (Static248.aClass156_3 == local41) {
					local53 = 0;
					local49 = 10;
					local51 = 4;
				} else if (Static248.aClass156_4 == local41) {
					local49 = 5;
					local51 = 0;
					local53 = local9++;
				} else if (Static248.aClass156_5 == local41) {
					local51 = 1;
					local53 = local9++;
					local49 = 5;
				} else if (Static248.aClass156_6 == local41) {
					local51 = 2;
					local49 = 5;
					local53 = local9++;
				} else {
					local51 = 3;
					local49 = 5;
					local53 = local9++;
				}
				local7.addElement(local11, local51, 0, local49, local53, local21);
				local21 += local41.anInt4906;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
