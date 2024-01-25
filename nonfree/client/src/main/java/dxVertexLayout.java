import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class3 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "b", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!kaa;[Lclient!mm;)V")
	public dxVertexLayout(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) Class220[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aNaa1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class220 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local21.method5376() > local23; local23++) {
				@Pc(37) Class326 local37 = local21.method5379(local23);
				@Pc(44) byte local44;
				@Pc(46) byte local46;
				@Pc(42) int local42;
				if (Static525.aClass326_1 == local37) {
					local42 = 0;
					local44 = 2;
					local46 = 0;
				} else if (local37 == Static525.aClass326_2) {
					local42 = 0;
					local46 = 3;
					local44 = 2;
				} else if (local37 == Static525.aClass326_3) {
					local42 = 0;
					local44 = 4;
					local46 = 10;
				} else if (Static525.aClass326_4 == local37) {
					local42 = local9++;
					local46 = 5;
					local44 = 0;
				} else if (local37 == Static525.aClass326_5) {
					local44 = 1;
					local46 = 5;
					local42 = local9++;
				} else if (Static525.aClass326_6 == local37) {
					local46 = 5;
					local42 = local9++;
					local44 = 2;
				} else {
					local46 = 5;
					local44 = 3;
					local42 = local9++;
				}
				local7.addElement(local11, local44, 0, local46, local42, local17);
				local17 += local37.anInt9354;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
