import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class258 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!ui;[Lclient!oh;)V")
	public dxVertexLayout(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) Class228[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aVo1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class228 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method5348(); local23++) {
				@Pc(33) Class248 local33 = local21.method5342(local23);
				@Pc(42) byte local42;
				@Pc(40) byte local40;
				@Pc(38) int local38;
				if (local33 == Static389.aClass248_1) {
					local38 = 0;
					local40 = 0;
					local42 = 2;
				} else if (local33 == Static389.aClass248_2) {
					local38 = 0;
					local40 = 3;
					local42 = 2;
				} else if (local33 == Static389.aClass248_3) {
					local38 = 0;
					local40 = 10;
					local42 = 4;
				} else if (Static389.aClass248_4 == local33) {
					local38 = local9++;
					local40 = 5;
					local42 = 0;
				} else if (local33 == Static389.aClass248_5) {
					local42 = 1;
					local38 = local9++;
					local40 = 5;
				} else if (Static389.aClass248_6 == local33) {
					local38 = local9++;
					local42 = 2;
					local40 = 5;
				} else {
					local38 = local9++;
					local42 = 3;
					local40 = 5;
				}
				local7.addElement(local11, local42, 0, local40, local38, local17);
				local17 += local33.anInt6924;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
